package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.model.tx.signdata.EVMMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.MessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.api.model.tx.signdata.SolanaMessageSignData;
import com.okinc.business.dex.tee.domain.model.TransactionIntentData;
import com.okinc.business.dex.tee.domain.model.VerifySignInfo;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingStrategy;
import com.okinc.business.dex.trade.copytrading.edit.domain.usecase.CopyTradingSignIntentUseCase$1;
import com.okinc.business.dex.trade.copytrading.edit.domain.usecase.CopyTradingSignIntentUseCase$signIntent$1;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC19873gSm;
import o.InterfaceC9740bbL;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gSo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19875gSo {
    public static final Activity Companion = new Activity(null);
    public final C19734gNi AEQbTJ;
    public final Function0<java.lang.Long> EZpvd;
    public final C19700gMb KWHzl;
    public final C19874gSn copydefault;

    public C19875gSo(@NotNull C19734gNi c19734gNi, @NotNull C19700gMb c19700gMb, @NotNull C19874gSn c19874gSn, @NotNull Function0<java.lang.Long> function0) {
        Intrinsics.checkNotNullParameter(c19734gNi, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c19874gSn, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = c19734gNi;
        this.KWHzl = c19700gMb;
        this.copydefault = c19874gSn;
        this.EZpvd = function0;
    }

    /* JADX INFO: renamed from: o.gSo$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gSo.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yCM
    public C19875gSo(@NotNull C19734gNi c19734gNi, @NotNull C19700gMb c19700gMb, @NotNull C19874gSn c19874gSn) {
        this(c19734gNi, c19700gMb, c19874gSn, CopyTradingSignIntentUseCase$1.INSTANCE);
        Intrinsics.checkNotNullParameter(c19734gNi, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c19874gSn, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull CopyTradingStrategy copyTradingStrategy, @NotNull FragmentActivity fragmentActivity, boolean z, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, @NotNull Continuation<? super AbstractC19873gSm> continuation) throws java.lang.Throwable {
        CopyTradingSignIntentUseCase$signIntent$1 copyTradingSignIntentUseCase$signIntent$1;
        long jValueOf;
        long j;
        java.lang.String str;
        CopyTradingStrategy copyTradingStrategy2;
        TransactionIntentData transactionIntentData;
        C19875gSo c19875gSo;
        long j2;
        if (continuation instanceof CopyTradingSignIntentUseCase$signIntent$1) {
            copyTradingSignIntentUseCase$signIntent$1 = (CopyTradingSignIntentUseCase$signIntent$1) continuation;
            int i = copyTradingSignIntentUseCase$signIntent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingSignIntentUseCase$signIntent$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingSignIntentUseCase$signIntent$1 = new CopyTradingSignIntentUseCase$signIntent$1(this, continuation);
            }
        }
        java.lang.Object obj = copyTradingSignIntentUseCase$signIntent$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingSignIntentUseCase$signIntent$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            long jLongValue = this.EZpvd.invoke().longValue();
            if (copyTradingStrategy.getExpireTimeType().length() > 0 && !Intrinsics.EZpvd((java.lang.Object) copyTradingStrategy.getExpireTimeType(), (java.lang.Object) "custom")) {
                jValueOf = C33129mqd.valueOf(copyTradingStrategy.getExpireTime()) + jLongValue;
            } else {
                jValueOf = C33129mqd.valueOf(copyTradingStrategy.getExpireTime());
            }
            j = jValueOf;
            TransactionIntentData transactionIntentDataKWHzl = this.copydefault.KWHzl(copyTradingStrategy, jLongValue, j);
            EZpvd(transactionIntentDataKWHzl.getReferrerAddress(), copyTradingStrategy.getServiceFeeInfo());
            java.lang.String strKWHzl = this.AEQbTJ.KWHzl(transactionIntentDataKWHzl);
            long jValueOf2 = C33129mqd.valueOf(copyTradingStrategy.getChainId());
            C19700gMb c19700gMb = this.KWHzl;
            InterfaceC9738bbJ interfaceC9738bbJKWHzl = c19700gMb.KWHzl();
            java.lang.String strDbNXlk = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.DbNXlk() : null;
            AbstractC58260yxt<ResponseData<C9748bbT>> abstractC58260yxtAEQbTJ = c19700gMb.AEQbTJ(new SignDataArgs<>(strDbNXlk == null ? "" : strDbNXlk, null, jValueOf2, copydefault(jValueOf2, strKWHzl), null, null, null, null, null, null, C56443yFo.AEQbTJ(3), null, null, null, null, null, null, false, false, null, false, false, false, true, 8387570, null), z, fragmentActivity, taskDescription);
            copyTradingSignIntentUseCase$signIntent$1.L$0 = this;
            copyTradingSignIntentUseCase$signIntent$1.L$1 = copyTradingStrategy;
            copyTradingSignIntentUseCase$signIntent$1.L$2 = transactionIntentDataKWHzl;
            copyTradingSignIntentUseCase$signIntent$1.L$3 = strKWHzl;
            copyTradingSignIntentUseCase$signIntent$1.J$0 = j;
            copyTradingSignIntentUseCase$signIntent$1.J$1 = jValueOf2;
            copyTradingSignIntentUseCase$signIntent$1.label = 1;
            java.lang.Object objAwait = RxAwaitKt.await(abstractC58260yxtAEQbTJ, copyTradingSignIntentUseCase$signIntent$1);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            str = strKWHzl;
            obj = objAwait;
            copyTradingStrategy2 = copyTradingStrategy;
            transactionIntentData = transactionIntentDataKWHzl;
            c19875gSo = this;
            j2 = jValueOf2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = copyTradingSignIntentUseCase$signIntent$1.J$1;
            long j4 = copyTradingSignIntentUseCase$signIntent$1.J$0;
            java.lang.String str2 = (java.lang.String) copyTradingSignIntentUseCase$signIntent$1.L$3;
            TransactionIntentData transactionIntentData2 = (TransactionIntentData) copyTradingSignIntentUseCase$signIntent$1.L$2;
            CopyTradingStrategy copyTradingStrategy3 = (CopyTradingStrategy) copyTradingSignIntentUseCase$signIntent$1.L$1;
            c19875gSo = (C19875gSo) copyTradingSignIntentUseCase$signIntent$1.L$0;
            C56391yDq.AEQbTJ(obj);
            str = str2;
            j = j4;
            copyTradingStrategy2 = copyTradingStrategy3;
            transactionIntentData = transactionIntentData2;
            j2 = j3;
        }
        ResponseData responseData = (ResponseData) obj;
        pUU.KWHzl("CreateCopyTradingStrategyUseCase", "signResult code=" + responseData.getCode());
        int code = responseData.getCode();
        if (code == -5014 || code == -5007) {
            return AbstractC19873gSm.StateListAnimator.EZpvd;
        }
        if (code == -5001) {
            C9748bbT c9748bbT = (C9748bbT) responseData.getData();
            java.lang.String strAEQbTJ = c9748bbT != null ? c9748bbT.AEQbTJ() : null;
            if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
                pUU.copydefault("CreateCopyTradingStrategyUseCase", "signature=" + strAEQbTJ);
                return AbstractC19873gSm.Activity.copydefault;
            }
            pUU.KWHzl("CreateCopyTradingStrategyUseCase", "raw strategy=" + C23316hvt.OLrzqt(copyTradingStrategy2));
            InterfaceC9738bbJ interfaceC9738bbJKWHzl2 = c19875gSo.KWHzl.KWHzl();
            java.lang.String strDbNXlk2 = interfaceC9738bbJKWHzl2 != null ? interfaceC9738bbJKWHzl2.DbNXlk() : null;
            if (strDbNXlk2 == null) {
                strDbNXlk2 = "";
            }
            return new AbstractC19873gSm.TaskDescription(copyTradingStrategy2.copy((116731 & 1) != 0 ? copyTradingStrategy2.sourceType : null, (116731 & 2) != 0 ? copyTradingStrategy2.chainId : null, (116731 & 4) != 0 ? copyTradingStrategy2.verifySignInfo : new VerifySignInfo(strDbNXlk2, copyTradingStrategy2.getUserWalletAddress(), j2, c19875gSo.KWHzl.isConnected(), str, strAEQbTJ), (116731 & 8) != 0 ? copyTradingStrategy2.reqStartTime : null, (116731 & 16) != 0 ? copyTradingStrategy2.userWalletAddress : null, (116731 & 32) != 0 ? copyTradingStrategy2.trackedWalletAddress : null, (116731 & 64) != 0 ? copyTradingStrategy2.strategyName : null, (116731 & 128) != 0 ? copyTradingStrategy2.buySettings : null, (116731 & 256) != 0 ? copyTradingStrategy2.sellSettings : null, (116731 & 512) != 0 ? copyTradingStrategy2.tokenFilter : null, (116731 & 1024) != 0 ? copyTradingStrategy2.serviceFeeInfo : null, (116731 & 2048) != 0 ? copyTradingStrategy2.referralCode : transactionIntentData.getReferrerCode(), (116731 & 4096) != 0 ? copyTradingStrategy2.referrerAddress : transactionIntentData.getReferrerAddress(), (116731 & 8192) != 0 ? copyTradingStrategy2.expireTime : java.lang.String.valueOf(j), (116731 & 16384) != 0 ? copyTradingStrategy2.expireTimeType : null, (116731 & 32768) != 0 ? copyTradingStrategy2.strategyId : null, (116731 & 65536) != 0 ? copyTradingStrategy2.teeSilentSignEnabled : false));
        }
        return AbstractC19873gSm.Activity.copydefault;
    }

    public final void EZpvd(java.lang.String str, ServiceFeeInfo serviceFeeInfo) {
        if (!serviceFeeInfo.isCharge() || Intrinsics.EZpvd((java.lang.Object) serviceFeeInfo.getReferralCommissionAddress(), (java.lang.Object) str)) {
            return;
        }
        pUU.copydefault("CreateCopyTradingStrategyUseCase", "referral address doesn't match: serviceInfoRef=" + serviceFeeInfo.getReferralCommissionAddress() + ", localRef=" + str);
    }

    public final MessageSignData copydefault(long j, java.lang.String str) {
        if (this.KWHzl.OLrzqt(j)) {
            return new EVMMessageSignData(str, false, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
        }
        return new SolanaMessageSignData(str, false, null, 6, null);
    }
}
