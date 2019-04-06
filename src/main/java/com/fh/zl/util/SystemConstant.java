package com.fh.zl.util;

public final class SystemConstant {

    public static final Integer SUCCESS = 1;

    public static final Integer ERROR = 0;

    public static final long USER_TEIME_ERROR = -1l;
    //图片的路径
    public static final String PRODUCT_IMG_PATH = "commons/productphoto";
    //用户输入密码错误的次数
    public static final Integer LOGIN_LOCK_COUNT = 2;
    //session中user的key
    public static final String SESSION_USER = "userDB";

    public static final String ORDER = "{orderDir:order[0][dir],orderColumn:order[0][column]}";
    //datatable中排序的状态
    public static final String ORDER_DIR = "order[0][dir]";
    //datatable中排序列的下标
    public static final String ORDER_COLUMN = "order[0][column]";
    //datatable中排序的列名
    public static final String GET_ORDER_NAME(String ordercolumn){
        return "columns["+ordercolumn+"][data]";
    }

    public static final String BRANCH_LIST = "branchMapList";

    public static final String PROVINCE_LIST = "provinceList";
}
