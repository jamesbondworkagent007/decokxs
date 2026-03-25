package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import o.InterfaceC43232rlR;

/* JADX INFO: loaded from: classes9.dex */
public final class pLN {
    public static final InterfaceC43232rlR copydefault = new Activity();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final InterfaceC43232rlR copydefault() {
        return copydefault;
    }

    public static final class Activity implements InterfaceC43232rlR {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43232rlR
        public java.lang.String AEQbTJ() {
            return "campaigns";
        }

        @Override // o.InterfaceC43232rlR
        public boolean EZpvd() {
            return InterfaceC43232rlR.TaskDescription.OLrzqt(this);
        }

        @Override // o.InterfaceC43232rlR
        public boolean KWHzl() {
            return InterfaceC43232rlR.TaskDescription.copydefault(this);
        }

        @Override // o.InterfaceC43232rlR
        public boolean OLrzqt() {
            return InterfaceC43232rlR.TaskDescription.AEQbTJ(this);
        }

        @Override // o.InterfaceC43232rlR
        public java.util.List<java.lang.String> djBIcL() {
            return InterfaceC43232rlR.TaskDescription.EZpvd(this);
        }

        @Override // o.InterfaceC43232rlR
        public DeeplinkMode copydefault() {
            return DeeplinkMode.APP;
        }
    }
}
