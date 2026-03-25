package o;

/* JADX INFO: renamed from: o.yvy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58159yvy {
    private C58159yvy() {
        throw new java.lang.AssertionError("No instances");
    }

    public static <T, R> C58155yvu<T> KWHzl(AbstractC58247yxg<R> abstractC58247yxg, R r) {
        C58158yvx.AEQbTJ(abstractC58247yxg, "lifecycle == null");
        C58158yvx.AEQbTJ(r, "event == null");
        return KWHzl(AEQbTJ(abstractC58247yxg, r));
    }

    public static <R> AbstractC58247yxg<R> AEQbTJ(AbstractC58247yxg<R> abstractC58247yxg, final R r) {
        return abstractC58247yxg.filter(new InterfaceC58239yxY<R>() { // from class: o.yvy.1
            @Override // o.InterfaceC58239yxY
            public boolean test(R r2) throws java.lang.Exception {
                return r2.equals(r);
            }
        });
    }

    public static <T, R> C58155yvu<T> KWHzl(AbstractC58247yxg<R> abstractC58247yxg) {
        return new C58155yvu<>(abstractC58247yxg);
    }

    public static <T, R> C58155yvu<T> copydefault(AbstractC58247yxg<R> abstractC58247yxg, InterfaceC58229yxO<R, R> interfaceC58229yxO) {
        C58158yvx.AEQbTJ(abstractC58247yxg, "lifecycle == null");
        C58158yvx.AEQbTJ(interfaceC58229yxO, "correspondingEvents == null");
        return KWHzl(OLrzqt(abstractC58247yxg.share(), interfaceC58229yxO));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.yxO<R, R> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <R> AbstractC58247yxg<java.lang.Boolean> OLrzqt(AbstractC58247yxg<R> abstractC58247yxg, InterfaceC58229yxO<R, R> interfaceC58229yxO) {
        return AbstractC58247yxg.combineLatest(abstractC58247yxg.take(1L).map(interfaceC58229yxO), abstractC58247yxg.skip(1L), new InterfaceC58223yxI<R, R, java.lang.Boolean>() { // from class: o.yvy.3
            /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // o.InterfaceC58223yxI
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public java.lang.Boolean apply(R r, R r2) throws java.lang.Exception {
                return java.lang.Boolean.valueOf(r2.equals(r));
            }
        }).onErrorReturn(C58153yvs.EZpvd).filter(C58153yvs.copydefault);
    }
}
