package o;

import com.okinc.business.dexlogic.bean.ApproveResultInfo;
import com.okinc.business.dexlogic.bean.ApproveUnsignedData;
import com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.SwapApproveInfoReq;
import com.okinc.business.trade.features.home.advanced.repository.AdvancedApprovalRepositoryImpl$getApproveUnsignedData$2;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC23234huQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kQm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28143kQm implements InterfaceC28146kQp {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final InterfaceC23234huQ EZpvd;
    public final android.util.LruCache<java.lang.String, java.util.Map<java.lang.String, DeFiPlatformTokenApprovalInfo>> OLrzqt;

    @yCM
    public C28143kQm(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        this.EZpvd = interfaceC23234huQ;
        this.OLrzqt = new android.util.LruCache<>(15);
    }

    @Override // o.InterfaceC28146kQp
    public void AEQbTJ() {
        this.OLrzqt.evictAll();
    }

    @Override // o.InterfaceC28146kQp
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull Continuation<? super AbstractC58185ywX<java.util.Map<java.lang.String, DeFiPlatformTokenApprovalInfo>>> continuation) {
        AbstractC58185ywX<ResponseData<java.util.Map<java.lang.String, DeFiPlatformTokenApprovalInfo>>> abstractC58185ywXCopydefault = this.EZpvd.copydefault(str2, str, str3, "", "");
        final Function1 function1 = new Function1() { // from class: o.kQn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28143kQm.AEQbTJ(this.EZpvd, str2, str3, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.kQu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C28143kQm.copydefault(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return C33024moe.KWHzl((AbstractC58185ywX) abstractC58185ywXAEQbTJ);
    }

    public static final java.util.Map copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.Map) function1.invoke(obj);
    }

    @Override // o.InterfaceC28146kQp
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull Continuation<? super AbstractC43419rot<ApproveUnsignedData, OKServerException>> continuation) {
        return kAB.EZpvd(new AdvancedApprovalRepositoryImpl$getApproveUnsignedData$2(this, str2, str3, str, str5, str6, null), continuation);
    }

    @Override // o.InterfaceC28146kQp
    public AbstractC58185ywX<ResponseData<ApproveResultInfo>> copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull SwapApproveInfoReq swapApproveInfoReq) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(swapApproveInfoReq, "");
        return C33024moe.KWHzl(InterfaceC23234huQ.Application.saveApproveBroadCast$default(this.EZpvd, map, swapApproveInfoReq, null, 4, null));
    }

    @Override // o.InterfaceC28146kQp
    public java.lang.Object EZpvd(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull Continuation<? super java.util.Map<java.lang.String, DeFiPlatformTokenApprovalInfo>> continuation) {
        return this.OLrzqt.get(EZpvd(dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getTokenContractAddress()));
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        return str + "_" + str2;
    }

    /* JADX INFO: renamed from: o.kQm$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kQm.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final java.util.Map AEQbTJ(C28143kQm c28143kQm, java.lang.String str, java.lang.String str2, ResponseData responseData) throws OKServerException {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && responseData.getData() != null) {
            c28143kQm.OLrzqt.put(c28143kQm.EZpvd(str, str2), (java.util.Map<java.lang.String, DeFiPlatformTokenApprovalInfo>) responseData.getData());
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return (java.util.Map) data;
        }
        throw new OKServerException(responseData.getCode(), responseData.getMsg(), null, null, 12, null);
    }
}
