package o;

/* JADX INFO: renamed from: o.zvi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60101zvi {
    public static InterfaceC60081zvD KWHzl;

    private C60101zvi() {
    }

    static {
        InterfaceC60085zvH interfaceC60085zvHDjBIcL = C60099zvg.djBIcL();
        if (interfaceC60085zvHDjBIcL != null) {
            KWHzl = interfaceC60085zvHDjBIcL.copydefault();
            return;
        }
        C60117zvy.AEQbTJ("Failed to find provider.");
        C60117zvy.AEQbTJ("Defaulting to no-operation MDCAdapter implementation.");
        KWHzl = new C60111zvs();
    }

    public static void EZpvd(java.lang.String str, java.lang.String str2) throws java.lang.IllegalArgumentException {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("key parameter cannot be null");
        }
        InterfaceC60081zvD interfaceC60081zvD = KWHzl;
        if (interfaceC60081zvD == null) {
            throw new java.lang.IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        interfaceC60081zvD.AEQbTJ(str, str2);
    }

    public static java.util.Map<java.lang.String, java.lang.String> copydefault() {
        InterfaceC60081zvD interfaceC60081zvD = KWHzl;
        if (interfaceC60081zvD == null) {
            throw new java.lang.IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        return interfaceC60081zvD.AEQbTJ();
    }

    public static void KWHzl(java.util.Map<java.lang.String, java.lang.String> map) {
        InterfaceC60081zvD interfaceC60081zvD = KWHzl;
        if (interfaceC60081zvD == null) {
            throw new java.lang.IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        interfaceC60081zvD.copydefault(map);
    }
}
