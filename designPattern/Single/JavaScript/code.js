var SinglePattern = (function () {
    function Construct() {
    }

    var private_obj = new Construct();

    return {
        getInstance: function () {
            return private_obj;
        }
    }
}())

var LazySinglePattern = (function () {
    function Construct() {
    }

    var private_obj = null;

    return {
        getInstance: function () {
            if (!private_obj)
                private_obj = new Construct();
            return private_obj;
        }
    }
}())

export default {SinglePattern, LazySinglePattern};