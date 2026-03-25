package o;

import o.InterfaceC5460So;

/* JADX INFO: renamed from: o.Sn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5459Sn<R> implements InterfaceC5460So<R> {
    public static final C5459Sn<?> copydefault = new C5459Sn<>();
    public static final InterfaceC5463Sr<?> KWHzl = new TaskDescription();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static <R> InterfaceC5463Sr<R> EZpvd() {
        return (InterfaceC5463Sr<R>) KWHzl;
    }

    @Override // o.InterfaceC5460So
    public boolean OLrzqt(java.lang.Object obj, InterfaceC5460So.ActionBar actionBar) {
        return false;
    }

    /* JADX INFO: renamed from: o.Sn$TaskDescription */
    public static class TaskDescription<R> implements InterfaceC5463Sr<R> {
        @Override // o.InterfaceC5463Sr
        public InterfaceC5460So<R> OLrzqt(com.bumptech.glide.load.DataSource dataSource, boolean z) {
            return C5459Sn.copydefault;
        }
    }
}
