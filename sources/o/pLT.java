package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import o.InterfaceC43232rlR;

/* JADX INFO: loaded from: classes9.dex */
public final class pLT {
    public static final InterfaceC43232rlR KWHzl = new ActionBar();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final InterfaceC43232rlR OLrzqt() {
        return KWHzl;
    }

    public static final class ActionBar implements InterfaceC43232rlR {
        public final java.lang.String AEQbTJ = "download";
        public final DeeplinkMode OLrzqt = DeeplinkMode.APP;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43232rlR
        public java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        @Override // o.InterfaceC43232rlR
        public boolean KWHzl() {
            return true;
        }

        @Override // o.InterfaceC43232rlR
        public boolean OLrzqt() {
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43232rlR
        public DeeplinkMode copydefault() {
            return this.OLrzqt;
        }

        @Override // o.InterfaceC43232rlR
        public boolean EZpvd() {
            return InterfaceC43232rlR.TaskDescription.OLrzqt(this);
        }

        @Override // o.InterfaceC43232rlR
        public java.util.List<java.lang.String> djBIcL() {
            return InterfaceC43232rlR.TaskDescription.EZpvd(this);
        }
    }
}
