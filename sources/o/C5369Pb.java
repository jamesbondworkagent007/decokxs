package o;

import androidx.core.util.Pools;
import java.security.MessageDigest;
import o.SL;

/* JADX INFO: renamed from: o.Pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5369Pb {
    public final SD<NH, java.lang.String> copydefault = new SD<>(1000);
    public final Pools.Pool<StateListAnimator> OLrzqt = SL.copydefault(10, new SL.StateListAnimator<StateListAnimator>() { // from class: o.Pb.4
        /* JADX DEBUG: Method merged with bridge method: KWHzl()Ljava/lang/Object; */
        @Override // o.SL.StateListAnimator
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public StateListAnimator KWHzl() {
            try {
                return new StateListAnimator(MessageDigest.getInstance("SHA-256"));
            } catch (java.security.NoSuchAlgorithmException e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    });

    public java.lang.String OLrzqt(NH nh) {
        java.lang.String strAEQbTJ;
        synchronized (this.copydefault) {
            strAEQbTJ = this.copydefault.AEQbTJ(nh);
        }
        if (strAEQbTJ == null) {
            strAEQbTJ = EZpvd(nh);
        }
        synchronized (this.copydefault) {
            this.copydefault.copydefault(nh, strAEQbTJ);
        }
        return strAEQbTJ;
    }

    public final java.lang.String EZpvd(NH nh) {
        StateListAnimator stateListAnimator = (StateListAnimator) SE.OLrzqt(this.OLrzqt.acquire());
        try {
            nh.AEQbTJ(stateListAnimator.OLrzqt);
            return SI.AEQbTJ(stateListAnimator.OLrzqt.digest());
        } finally {
            this.OLrzqt.release(stateListAnimator);
        }
    }

    /* JADX INFO: renamed from: o.Pb$StateListAnimator */
    public static final class StateListAnimator implements SL.TaskDescription {
        public final SJ EZpvd = SJ.copydefault();
        public final MessageDigest OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.SL.TaskDescription
        public SJ valueOf() {
            return this.EZpvd;
        }

        public StateListAnimator(MessageDigest messageDigest) {
            this.OLrzqt = messageDigest;
        }
    }
}
