package o;

import o.InterfaceC5386Ps;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public class NC implements InterfaceC5386Ps<C5378Pk, java.io.InputStream> {
    public final Call.Factory EZpvd;

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    public boolean OLrzqt(@androidx.annotation.NonNull C5378Pk c5378Pk) {
        return true;
    }

    public NC(@androidx.annotation.NonNull Call.Factory factory) {
        this.EZpvd = factory;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InterfaceC5386Ps.Application<java.io.InputStream> AEQbTJ(@androidx.annotation.NonNull C5378Pk c5378Pk, int i, int i2, @androidx.annotation.NonNull NM nm) {
        return new InterfaceC5386Ps.Application<>(c5378Pk, new ND(this.EZpvd, c5378Pk));
    }

    public static class StateListAnimator implements InterfaceC5390Pw<C5378Pk, java.io.InputStream> {
        public static volatile Call.Factory AEQbTJ;
        public final Call.Factory copydefault;

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        public static Call.Factory OLrzqt() {
            if (AEQbTJ == null) {
                synchronized (StateListAnimator.class) {
                    if (AEQbTJ == null) {
                        AEQbTJ = new OkHttpClient();
                    }
                }
            }
            return AEQbTJ;
        }

        public StateListAnimator() {
            this(OLrzqt());
        }

        public StateListAnimator(@androidx.annotation.NonNull Call.Factory factory) {
            this.copydefault = factory;
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<C5378Pk, java.io.InputStream> AEQbTJ(PA pa) {
            return new NC(this.copydefault);
        }
    }
}
