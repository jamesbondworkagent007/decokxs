package o;

import com.google.android.exoplayer2.DefaultLoadControl;
import o.InterfaceC5386Ps;

/* JADX INFO: loaded from: classes2.dex */
public class PF implements InterfaceC5386Ps<C5378Pk, java.io.InputStream> {
    public static final NJ<java.lang.Integer> OLrzqt = NJ.OLrzqt("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", java.lang.Integer.valueOf(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS));
    public final C5389Pv<C5378Pk, C5378Pk> EZpvd;

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@androidx.annotation.NonNull C5378Pk c5378Pk) {
        return true;
    }

    public PF() {
        this(null);
    }

    public PF(@androidx.annotation.Nullable C5389Pv<C5378Pk, C5378Pk> c5389Pv) {
        this.EZpvd = c5389Pv;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC5386Ps.Application<java.io.InputStream> AEQbTJ(@androidx.annotation.NonNull C5378Pk c5378Pk, int i, int i2, @androidx.annotation.NonNull NM nm) {
        C5389Pv<C5378Pk, C5378Pk> c5389Pv = this.EZpvd;
        if (c5389Pv != null) {
            C5378Pk c5378PkEZpvd = c5389Pv.EZpvd(c5378Pk, 0, 0);
            if (c5378PkEZpvd == null) {
                this.EZpvd.KWHzl(c5378Pk, 0, 0, c5378Pk);
            } else {
                c5378Pk = c5378PkEZpvd;
            }
        }
        return new InterfaceC5386Ps.Application<>(c5378Pk, new NW(c5378Pk, ((java.lang.Integer) nm.OLrzqt(OLrzqt)).intValue()));
    }

    public static class TaskDescription implements InterfaceC5390Pw<C5378Pk, java.io.InputStream> {
        public final C5389Pv<C5378Pk, C5378Pk> copydefault = new C5389Pv<>(500);

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<C5378Pk, java.io.InputStream> AEQbTJ(PA pa) {
            return new PF(this.copydefault);
        }
    }
}
