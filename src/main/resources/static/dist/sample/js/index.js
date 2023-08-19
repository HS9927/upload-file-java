const route = {
    DASHBOARD_INDEX: context + "/dashboard",
};

const page = {
    id: null,
    table: null,
    interval: null,
    selector: {
        dataTable: $("#tblDashboard")
        , btnSave: $("#btnSave")
    },
    alert: {

    },
    ajax: {
        loadDatatable: function () {
            page.table = page.selector.dataTable.DataTable({
                processing: true,
                serverSide: true,
                orderCellsTop: true,
                ordering: false,
                ajax: {
                    url: route.DASHBOARD_INDEX,
                    type: "POST",
                    contentType: "application/json",
                    data: function (d) {
                        return JSON.stringify(d);
                    }
                },
                columnDefs: [
                    {
                        targets: [0],
                        searchable: false,
                        orderable: false,
                        visible: false,
                    }
                ],
                columns: [
                    { data: "id" }
                    , {
                        data: null, render: function (data, type, row, meta) {
                            return meta.row + meta.settings._iDisplayStart + 1;
                        }
                    },
                    { data: "name" }
                    , { data: "email" }
                ]
            });
            $("#tblDashboard_filter").css("visibility", "hidden");
        }
        , info: function () {
            return new Promise((resolve, reject) => {
                page.fire.loading();
                $.ajax({
                    url: "url",
                    type: "GET",
                    contentType: "application/json",
                    dataType: "json",
                    cache: false,
                    timeout: 600000,
                    success: function (res) {
                        resolve(res);
                    },
                    error: function (e) {
                        reject(e);
                    }
                });
            }).finally(() => {
                $("#container").waitMe("hide");
            }).catch((err) => {
                console.log(err);
                page.alert.error();
            });
        }
        , save: function () {
            return new Promise((resolve, reject) => {
                page.fire.loading();
                $.ajax({
                    url: "url",
                    type: "GET",
                    contentType: "application/json",
                    data: JSON.stringify(data),
                    dataType: "json",
                    cache: false,
                    timeout: 600000,
                    success: function (res) {
                        resolve(res);
                    },
                    error: function (e) {
                        reject(e);
                    }
                });
            }).finally(() => {
                $("#container").waitMe("hide");
            }).catch((err) => {
                console.log(err);
                page.alert.error();
            });
        }
    },
    fire: {
        loading: function () {
            $("#container").waitMe({
                effect: "win8",
                text: "",
                color: "#000",
                maxSize: "",
                waitTime: -1,
                textPos: "vertical",
                fontSize: "",
                source: "",
                onClose: function () { },
            });
        }
        , onSave: function () {
            page.selector.btnSave.click(() => {
                let data = {
                    name: "a",
                    email: "a@k.com"
                }

                page.ajax.save(data).then(res => {
                    if (res.success) {
                        /// Do Success
                    }
                    else {
                        /// Do Error
                        page.alert.errorWithMessage(res.message);
                        page.alert.error();
                        page.fire.loading.hide();
                    }
                });
            });
        }
    }
};