package o;

/* JADX INFO: renamed from: o.wXm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC52764wXm {
    void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2);

    /* JADX INFO: renamed from: o.wXm$Application */
    public static final class Application {
        public static /* synthetic */ void loadFromAttributes$default(InterfaceC52764wXm interfaceC52764wXm, android.util.AttributeSet attributeSet, int i, int i2, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadFromAttributes");
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = 0;
            }
            interfaceC52764wXm.OLrzqt(attributeSet, i, i2);
        }
    }
}
