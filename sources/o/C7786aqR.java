package o;

/* JADX INFO: renamed from: o.aqR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7786aqR extends C7785aqQ implements InterfaceC7852are {
    public android.graphics.drawable.Drawable AYXKKw;
    public Application djBIcL;
    public C7350aiF isConnected;

    /* JADX INFO: renamed from: o.aqR$Application */
    /* JADX INFO: loaded from: classes3.dex */
    public interface Application {
        void EZpvd(C7785aqQ c7785aqQ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C7785aqQ, o.AbstractC7787aqS
    public android.graphics.drawable.Drawable OLrzqt() {
        return this.AYXKKw;
    }

    public C7786aqR(android.content.Context context, java.lang.String str, C7350aiF c7350aiF, Application application, int i) {
        super(i);
        this.djBIcL = application;
        this.isConnected = c7350aiF;
        InterfaceC7855arh interfaceC7855arhAYXKKw = C7323ahf.AYXKKw();
        if (interfaceC7855arhAYXKKw != null) {
            if (android.webkit.URLUtil.isNetworkUrl(str)) {
                interfaceC7855arhAYXKKw.KWHzl(context, str, null, null, this);
                return;
            }
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            android.graphics.drawable.Drawable drawableCopydefault = interfaceC7855arhAYXKKw.copydefault(context, str);
            this.AYXKKw = drawableCopydefault;
            if (drawableCopydefault != null) {
                KWHzl();
            }
        }
    }

    @Override // o.InterfaceC7852are
    public void copydefault(android.graphics.drawable.Drawable drawable, java.lang.String str) {
        this.AYXKKw = drawable;
        if (drawable == null) {
            return;
        }
        KWHzl();
        Application application = this.djBIcL;
        if (application != null) {
            application.EZpvd(this);
        }
    }

    public final void KWHzl() {
        int iCopydefault = this.isConnected.copydefault();
        int iAEQbTJ = this.isConnected.AEQbTJ();
        if (iCopydefault > 0 || iAEQbTJ > 0) {
            this.AYXKKw.setBounds(0, 0, iCopydefault, iAEQbTJ);
        } else {
            android.graphics.drawable.Drawable drawable = this.AYXKKw;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.AYXKKw.getIntrinsicHeight());
        }
        this.AYXKKw.invalidateSelf();
    }
}
