package com.example.demo;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2019-06-19T16:18:31.732+0900")
public class ProductRepositoryImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.example.demo.ProductRepository {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.example.demo.ProductRepository.class, "selectAll");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.example.demo.ProductRepository.class, "selectProduct", java.lang.String.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.example.demo.ProductRepository.class, "searchAll", java.lang.String.class, java.lang.String.class, java.math.BigDecimal.class, java.math.BigDecimal.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.example.demo.ProductRepository.class, "insert", com.example.demo.Product.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.example.demo.ProductRepository.class, "update", com.example.demo.Product.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public ProductRepositoryImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<com.example.demo.Product> selectAll() {
        entering("com.example.demo.ProductRepositoryImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/example/demo/ProductRepository/selectAll.sql");
            __query.setEntityType(com.example.demo._Product.getSingletonInternal());
            __query.setCallerClassName("com.example.demo.ProductRepositoryImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<com.example.demo.Product>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.example.demo.Product>(com.example.demo._Product.getSingletonInternal()));
            java.util.List<com.example.demo.Product> __result = __command.execute();
            __query.complete();
            exiting("com.example.demo.ProductRepositoryImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.example.demo.ProductRepositoryImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public com.example.demo.Product selectProduct(java.lang.String goodsId) {
        entering("com.example.demo.ProductRepositoryImpl", "selectProduct", goodsId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/example/demo/ProductRepository/selectProduct.sql");
            __query.setEntityType(com.example.demo._Product.getSingletonInternal());
            __query.addParameter("goodsId", java.lang.String.class, goodsId);
            __query.setCallerClassName("com.example.demo.ProductRepositoryImpl");
            __query.setCallerMethodName("selectProduct");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<com.example.demo.Product> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.example.demo.Product>(com.example.demo._Product.getSingletonInternal()));
            com.example.demo.Product __result = __command.execute();
            __query.complete();
            exiting("com.example.demo.ProductRepositoryImpl", "selectProduct", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.example.demo.ProductRepositoryImpl", "selectProduct", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.example.demo.Product> searchAll(java.lang.String goodsId, java.lang.String goodsName, java.math.BigDecimal priceFrom, java.math.BigDecimal priceTo) {
        entering("com.example.demo.ProductRepositoryImpl", "searchAll", goodsId, goodsName, priceFrom, priceTo);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/example/demo/ProductRepository/searchAll.sql");
            __query.setEntityType(com.example.demo._Product.getSingletonInternal());
            __query.addParameter("goodsId", java.lang.String.class, goodsId);
            __query.addParameter("goodsName", java.lang.String.class, goodsName);
            __query.addParameter("priceFrom", java.math.BigDecimal.class, priceFrom);
            __query.addParameter("priceTo", java.math.BigDecimal.class, priceTo);
            __query.setCallerClassName("com.example.demo.ProductRepositoryImpl");
            __query.setCallerMethodName("searchAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<com.example.demo.Product>> __command = getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.example.demo.Product>(com.example.demo._Product.getSingletonInternal()));
            java.util.List<com.example.demo.Product> __result = __command.execute();
            __query.complete();
            exiting("com.example.demo.ProductRepositoryImpl", "searchAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.example.demo.ProductRepositoryImpl", "searchAll", __e);
            throw __e;
        }
    }

    @Override
    public int insert(com.example.demo.Product product) {
        entering("com.example.demo.ProductRepositoryImpl", "insert", product);
        try {
            if (product == null) {
                throw new org.seasar.doma.DomaNullPointerException("product");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<com.example.demo.Product> __query = getQueryImplementors().createAutoInsertQuery(__method3, com.example.demo._Product.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setEntity(product);
            __query.setCallerClassName("com.example.demo.ProductRepositoryImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method3, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.example.demo.ProductRepositoryImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.example.demo.ProductRepositoryImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(com.example.demo.Product product) {
        entering("com.example.demo.ProductRepositoryImpl", "update", product);
        try {
            if (product == null) {
                throw new org.seasar.doma.DomaNullPointerException("product");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<com.example.demo.Product> __query = getQueryImplementors().createAutoUpdateQuery(__method4, com.example.demo._Product.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setEntity(product);
            __query.setCallerClassName("com.example.demo.ProductRepositoryImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method4, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.example.demo.ProductRepositoryImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.example.demo.ProductRepositoryImpl", "update", __e);
            throw __e;
        }
    }

}
