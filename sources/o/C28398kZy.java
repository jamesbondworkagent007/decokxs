package o;

import com.okinc.business.dexlogic.bean.ChainTokensData;
import com.okinc.business.trade.features.home.tokenlist.domain.usecase.tokenlist.single.ABSwitchSingleTokenListUseCase$invoke$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kZy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28398kZy implements InterfaceC28389kZp {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final kZE AEQbTJ;
    public final InterfaceC25414iwK EZpvd;
    public final kZD OLrzqt;

    public C28398kZy(@NotNull kZD kzd, @NotNull kZE kze, @NotNull InterfaceC25414iwK interfaceC25414iwK) {
        Intrinsics.checkNotNullParameter(kzd, "");
        Intrinsics.checkNotNullParameter(kze, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        this.OLrzqt = kzd;
        this.AEQbTJ = kze;
        this.EZpvd = interfaceC25414iwK;
    }

    /* JADX INFO: renamed from: o.kZy$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kZy.TaskDescription.<init>():void type: THIS */
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
        ABSwitchSingleTokenListUseCase$invoke$1 aBSwitchSingleTokenListUseCase$invoke$1;
        C28398kZy c28398kZy;
        java.lang.Object obj;
        boolean zEZpvd;
        java.lang.Object obj2;
        java.lang.Object obj3;
        if (continuation instanceof ABSwitchSingleTokenListUseCase$invoke$1) {
            aBSwitchSingleTokenListUseCase$invoke$1 = (ABSwitchSingleTokenListUseCase$invoke$1) continuation;
            int i = aBSwitchSingleTokenListUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aBSwitchSingleTokenListUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                aBSwitchSingleTokenListUseCase$invoke$1 = new ABSwitchSingleTokenListUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj4 = aBSwitchSingleTokenListUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = aBSwitchSingleTokenListUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj4);
            boolean zOLrzqt = this.EZpvd.OLrzqt();
            pUU.KWHzl("ABSwitchSingleTokenListUseCase", "invoke useRust=" + zOLrzqt);
            if (zOLrzqt) {
                kZE kze = this.AEQbTJ;
                aBSwitchSingleTokenListUseCase$invoke$1.L$0 = this;
                aBSwitchSingleTokenListUseCase$invoke$1.L$1 = c28378kZe;
                aBSwitchSingleTokenListUseCase$invoke$1.label = 1;
                java.lang.Object objAEQbTJ = kze.AEQbTJ(c28378kZe, aBSwitchSingleTokenListUseCase$invoke$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                c28398kZy = this;
                obj = objAEQbTJ;
                AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
                zEZpvd = abstractC43419rot.EZpvd();
                obj2 = abstractC43419rot;
                if (!zEZpvd) {
                }
            } else {
                kZD kzd = this.OLrzqt;
                aBSwitchSingleTokenListUseCase$invoke$1.label = 3;
                java.lang.Object objAEQbTJ2 = kzd.AEQbTJ(c28378kZe, aBSwitchSingleTokenListUseCase$invoke$1);
                obj3 = objAEQbTJ2;
                return objAEQbTJ2 == objCopydefault ? objCopydefault : obj3;
            }
        } else if (i2 == 1) {
            c28378kZe = (C28378kZe) aBSwitchSingleTokenListUseCase$invoke$1.L$1;
            c28398kZy = (C28398kZy) aBSwitchSingleTokenListUseCase$invoke$1.L$0;
            C56391yDq.AEQbTJ(obj4);
            obj = obj4;
            AbstractC43419rot abstractC43419rot2 = (AbstractC43419rot) obj;
            zEZpvd = abstractC43419rot2.EZpvd();
            obj2 = abstractC43419rot2;
            if (!zEZpvd) {
                pUU.valueOf("ABSwitchSingleTokenListUseCase", "Rust failed, fallback to native");
                kZD kzd2 = c28398kZy.OLrzqt;
                aBSwitchSingleTokenListUseCase$invoke$1.L$0 = null;
                aBSwitchSingleTokenListUseCase$invoke$1.L$1 = null;
                aBSwitchSingleTokenListUseCase$invoke$1.label = 2;
                java.lang.Object objAEQbTJ3 = kzd2.AEQbTJ(c28378kZe, aBSwitchSingleTokenListUseCase$invoke$1);
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
