package o;

import com.google.gson.Gson;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.database.extra.ExtraDatabase;
import com.okinc.business.defi.biz.database.wallet.WalletDatabase;
import com.okinc.business.defi.common.utils.ReferralManager;
import com.okinc.business.defi.utm.Web3UtmParamManager;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dKx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC13426dKx {
    public static final TaskDescription Companion = TaskDescription.copydefault;

    C17671fNz AEQbTJ();

    C8419bCP AYXKKw();

    C15275eCh AhwBna();

    C11274cId AkhnZx();

    cPU AuCTel();

    C11495cQj AuCTelauCTel();

    C10407bnq AubY();

    InterfaceC18439fiS AwvSrB();

    WalletDatabase AxsJAY();

    C13934dbu DTwDnp();

    C18039faq DbNXlk();

    cOG EZpvd();

    C15530eLt KWHzl();

    InterfaceC13844daJ OLrzqt();

    InterfaceC18445fiY ORxRYg();

    C12827cuN OcIXYQ();

    cQM QKVWgx();

    C10604brb QOLQEE();

    cSN QUSxYX();

    C10614brl QVAiDq();

    C13062cyk QbewEr();

    WalletUpdateWorker QfsBiF();

    C13058cyg RJOkX();

    C17668fNw RcXXUw();

    Web3UtmParamManager UeEOUB();

    C17670fNy aKErDB();

    C13594dRc copydefault();

    C13023cxy dNCPSb();

    C10822bvh djBIcL();

    C14644dpO ejfBZ();

    C11010bzJ fARcdN();

    eWB fIwbmz();

    C15935eaT fJNWhG();

    Gson fetchVPNInfo();

    C10619brq gEmmrt();

    C14140dfo gHZMYf();

    fVJ getFieldNames();

    ReferralManager getNewProxyInstance();

    C18943fru hDKMBd();

    C13758dXe isConnected();

    C14716dqh iwGUEr();

    C13092czN sSMYrx();

    C11498cQm uzCIH();

    ExtraDatabase valueOf();

    fVN values();

    C16058eck wlaJM();

    gJS zLjUOn();

    C13124czt zsXlph();

    WalletConnectUtils zuBGHE();

    /* JADX INFO: renamed from: o.dKx$TaskDescription */
    public static final class TaskDescription {
        public static volatile InterfaceC13426dKx EZpvd;
        public static final /* synthetic */ TaskDescription copydefault = new TaskDescription();

        private TaskDescription() {
        }

        public static /* synthetic */ InterfaceC13426dKx getInstance$default(TaskDescription taskDescription, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return taskDescription.copydefault(context);
        }

        public final InterfaceC13426dKx copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            InterfaceC13426dKx c13427dKy = EZpvd;
            if (c13427dKy == null) {
                synchronized (this) {
                    c13427dKy = EZpvd;
                    if (c13427dKy == null) {
                        c13427dKy = new C13427dKy(context);
                        EZpvd = c13427dKy;
                    }
                }
            }
            return c13427dKy;
        }
    }
}
