package o;

import com.okinc.business.dexlogic.bean.ChainTokensData;
import com.okinc.business.trade.features.home.tokenlist.domain.usecase.tokenlist.bridge.ABSwitchBridgeTokenListUseCase$invoke$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kZu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28394kZu implements InterfaceC28389kZp {
    public final kZB EZpvd;
    public final InterfaceC25414iwK OLrzqt;
    public final C28397kZx copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    public C28394kZu(@NotNull kZB kzb, @NotNull C28397kZx c28397kZx, @NotNull InterfaceC25414iwK interfaceC25414iwK) {
        Intrinsics.checkNotNullParameter(kzb, "");
        Intrinsics.checkNotNullParameter(c28397kZx, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        this.EZpvd = kzb;
        this.copydefault = c28397kZx;
        this.OLrzqt = interfaceC25414iwK;
    }

    /* JADX INFO: renamed from: o.kZu$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kZu.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC28389kZp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull C28378kZe c28378kZe, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) throws java.lang.Throwable {
        ABSwitchBridgeTokenListUseCase$invoke$1 aBSwitchBridgeTokenListUseCase$invoke$1;
        C28394kZu c28394kZu;
        java.lang.Object obj;
        boolean zEZpvd;
        java.lang.Object obj2;
        java.lang.Object obj3;
        if (continuation instanceof ABSwitchBridgeTokenListUseCase$invoke$1) {
            aBSwitchBridgeTokenListUseCase$invoke$1 = (ABSwitchBridgeTokenListUseCase$invoke$1) continuation;
            int i = aBSwitchBridgeTokenListUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aBSwitchBridgeTokenListUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                aBSwitchBridgeTokenListUseCase$invoke$1 = new ABSwitchBridgeTokenListUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj4 = aBSwitchBridgeTokenListUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = aBSwitchBridgeTokenListUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj4);
            boolean zOLrzqt = this.OLrzqt.OLrzqt();
            pUU.KWHzl("ABSwitchBridgeTokenListUseCase", "invoke useRust=" + zOLrzqt);
            if (zOLrzqt) {
                C28397kZx c28397kZx = this.copydefault;
                aBSwitchBridgeTokenListUseCase$invoke$1.L$0 = this;
                aBSwitchBridgeTokenListUseCase$invoke$1.L$1 = c28378kZe;
                aBSwitchBridgeTokenListUseCase$invoke$1.label = 1;
                java.lang.Object objAEQbTJ = c28397kZx.AEQbTJ(c28378kZe, aBSwitchBridgeTokenListUseCase$invoke$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                c28394kZu = this;
                obj = objAEQbTJ;
                AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
                zEZpvd = abstractC43419rot.EZpvd();
                obj2 = abstractC43419rot;
                if (!zEZpvd) {
                }
            } else {
                kZB kzb = this.EZpvd;
                aBSwitchBridgeTokenListUseCase$invoke$1.label = 3;
                java.lang.Object objAEQbTJ2 = kzb.AEQbTJ(c28378kZe, aBSwitchBridgeTokenListUseCase$invoke$1);
                obj3 = objAEQbTJ2;
                return objAEQbTJ2 == objCopydefault ? objCopydefault : obj3;
            }
        } else if (i2 == 1) {
            c28378kZe = (C28378kZe) aBSwitchBridgeTokenListUseCase$invoke$1.L$1;
            c28394kZu = (C28394kZu) aBSwitchBridgeTokenListUseCase$invoke$1.L$0;
            C56391yDq.AEQbTJ(obj4);
            obj = obj4;
            AbstractC43419rot abstractC43419rot2 = (AbstractC43419rot) obj;
            zEZpvd = abstractC43419rot2.EZpvd();
            obj2 = abstractC43419rot2;
            if (!zEZpvd) {
                pUU.valueOf("ABSwitchBridgeTokenListUseCase", "Rust failed, fallback to native");
                kZB kzb2 = c28394kZu.EZpvd;
                aBSwitchBridgeTokenListUseCase$invoke$1.L$0 = null;
                aBSwitchBridgeTokenListUseCase$invoke$1.L$1 = null;
                aBSwitchBridgeTokenListUseCase$invoke$1.label = 2;
                java.lang.Object objAEQbTJ3 = kzb2.AEQbTJ(c28378kZe, aBSwitchBridgeTokenListUseCase$invoke$1);
                obj2 = objAEQbTJ3;
                if (objAEQbTJ3 == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj4);
                obj3 = obj4;
            }
            C56391yDq.AEQbTJ(obj4);
            obj2 = obj4;
        }
        return obj2;
    }
}
