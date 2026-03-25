package o;

/* JADX INFO: renamed from: o.zvn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60106zvn implements InterfaceC60081zvD {
    public final C60116zvx OLrzqt = new C60116zvx();
    public final java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> EZpvd = new java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>>() { // from class: o.zvn.2
        /* JADX DEBUG: Method merged with bridge method: childValue(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // java.lang.InheritableThreadLocal
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public java.util.Map<java.lang.String, java.lang.String> childValue(java.util.Map<java.lang.String, java.lang.String> map) {
            if (map == null) {
                return null;
            }
            return new java.util.HashMap(map);
        }
    };

    @Override // o.InterfaceC60081zvD
    public void AEQbTJ(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("key cannot be null");
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.EZpvd.get();
        if (map == null) {
            map = new java.util.HashMap<>();
            this.EZpvd.set(map);
        }
        map.put(str, str2);
    }

    @Override // o.InterfaceC60081zvD
    public java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
        java.util.Map<java.lang.String, java.lang.String> map = this.EZpvd.get();
        if (map != null) {
            return new java.util.HashMap(map);
        }
        return null;
    }

    @Override // o.InterfaceC60081zvD
    public void copydefault(java.util.Map<java.lang.String, java.lang.String> map) {
        this.EZpvd.set(map != null ? new java.util.HashMap(map) : null);
    }
}
