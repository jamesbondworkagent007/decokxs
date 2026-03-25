package o;

/* JADX INFO: renamed from: o.yti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58037yti implements InterfaceC58039ytk {
    public final android.content.Context OLrzqt;

    public C58037yti(android.content.Context context) {
        this.OLrzqt = context;
    }

    @Override // o.InterfaceC58039ytk
    public void copydefault(AbstractC58042ytn abstractC58042ytn) {
        C58013ytK.EZpvd("Matrix.DefaultPluginListener", "%s plugin is inited", abstractC58042ytn.EZpvd());
    }

    @Override // o.InterfaceC58039ytk
    public void OLrzqt(AbstractC58042ytn abstractC58042ytn) {
        C58013ytK.EZpvd("Matrix.DefaultPluginListener", "%s plugin is started", abstractC58042ytn.EZpvd());
    }

    @Override // o.InterfaceC58039ytk
    public void copydefault(C58038ytj c58038ytj) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.Object obj = c58038ytj;
        if (c58038ytj == null) {
            obj = "";
        }
        objArr[0] = obj;
        C58013ytK.EZpvd("Matrix.DefaultPluginListener", "report issue content: %s", objArr);
    }
}
