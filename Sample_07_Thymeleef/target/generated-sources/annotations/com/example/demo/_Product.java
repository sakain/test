package com.example.demo;

/** */
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2019-06-19T15:43:09.440+0900")
public final class _Product extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.example.demo.Product> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final _Product __singleton = new _Product();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the ProductID */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.example.demo.Product, java.lang.String, Object> $ProductID = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(com.example.demo.Product.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "ProductID", "ProductID", __namingType, false);

    /** the ProductType */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.example.demo.Product, java.lang.String, Object> $ProductType = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.example.demo.Product.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "ProductType", "ProductType", __namingType, true, true, false);

    /** the ProductName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.example.demo.Product, java.lang.String, Object> $ProductName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.example.demo.Product.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "ProductName", "ProductName", __namingType, true, true, false);

    /** the Price */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.example.demo.Product, java.math.BigDecimal, Object> $Price = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.example.demo.Product.class, java.math.BigDecimal.class, java.math.BigDecimal.class, () -> new org.seasar.doma.wrapper.BigDecimalWrapper(), null, null, "Price", "Price", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.example.demo.Product>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.demo.Product, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.demo.Product, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.demo.Product, ?>> __entityPropertyTypeMap;

    private _Product() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Product";
        __catalogName = "";
        __schemaName = "";
        __tableName = "Product";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.demo.Product, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.demo.Product, ?>> __list = new java.util.ArrayList<>(4);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.demo.Product, ?>> __map = new java.util.HashMap<>(4);
        __idList.add($ProductID);
        __list.add($ProductID);
        __map.put("ProductID", $ProductID);
        __list.add($ProductType);
        __map.put("ProductType", $ProductType);
        __list.add($ProductName);
        __map.put("ProductName", $ProductName);
        __list.add($Price);
        __map.put("Price", $Price);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(com.example.demo.Product entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.example.demo.Product> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.example.demo.Product entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.example.demo.Product> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.example.demo.Product entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.example.demo.Product> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.example.demo.Product entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.example.demo.Product> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.example.demo.Product entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.example.demo.Product> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.example.demo.Product entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.example.demo.Product> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.demo.Product, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.demo.Product, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.demo.Product, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.example.demo.Product, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.example.demo.Product, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.example.demo.Product newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.example.demo.Product, ?>> __args) {
        com.example.demo.Product entity = new com.example.demo.Product();
        if (__args.get("ProductID") != null) __args.get("ProductID").save(entity);
        if (__args.get("ProductType") != null) __args.get("ProductType").save(entity);
        if (__args.get("ProductName") != null) __args.get("ProductName").save(entity);
        if (__args.get("Price") != null) __args.get("Price").save(entity);
        return entity;
    }

    @Override
    public Class<com.example.demo.Product> getEntityClass() {
        return com.example.demo.Product.class;
    }

    @Override
    public com.example.demo.Product getOriginalStates(com.example.demo.Product __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.example.demo.Product __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Product getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Product newInstance() {
        return new _Product();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<com.example.demo.Product> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
