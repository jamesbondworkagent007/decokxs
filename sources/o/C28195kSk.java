package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.trade.core.domain.model.ApproveUnsignedData;
import com.okinc.business.dex.trade.core.domain.model.V6BatchBroadcastRequest;
import com.okinc.business.dex.trade.core.domain.model.V6BatchTxItem;
import com.okinc.business.dex.trade.core.domain.model.V6BroadcastAccountInfo;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.common.V6CallData;
import com.okinc.business.trade.features.home.advanced.usecase.EVMBatchSignBroadcastUseCase$batchBroadcast$1;
import com.okinc.business.trade.features.home.advanced.usecase.EVMBatchSignBroadcastUseCase$signAndBroadcast$1;
import com.okinc.business.trade.features.home.advanced.usecase.EVMBatchSignBroadcastUseCase$signAndBroadcast$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.serialization.json.Json;
import o.AbstractC43419rot;
import o.AbstractC9836bdB;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kSk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28195kSk {
    public final C28196kSl EZpvd;
    public final C19700gMb KWHzl;
    public final gYX OLrzqt;

    @yCM
    public C28195kSk(@NotNull C28196kSl c28196kSl, @NotNull gYX gyx, @NotNull C19700gMb c19700gMb) {
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        Intrinsics.checkNotNullParameter(gyx, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        this.EZpvd = c28196kSl;
        this.OLrzqt = gyx;
        this.KWHzl = c19700gMb;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull C28194kSj c28194kSj, @NotNull FragmentActivity fragmentActivity, @NotNull Continuation<? super Result<java.lang.String>> continuation) {
        EVMBatchSignBroadcastUseCase$signAndBroadcast$1 eVMBatchSignBroadcastUseCase$signAndBroadcast$1;
        C28195kSk c28195kSk;
        C28194kSj c28194kSj2;
        long j;
        FragmentActivity fragmentActivity2;
        if (continuation instanceof EVMBatchSignBroadcastUseCase$signAndBroadcast$1) {
            eVMBatchSignBroadcastUseCase$signAndBroadcast$1 = (EVMBatchSignBroadcastUseCase$signAndBroadcast$1) continuation;
            int i = eVMBatchSignBroadcastUseCase$signAndBroadcast$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVMBatchSignBroadcastUseCase$signAndBroadcast$1.label = i - Integer.MIN_VALUE;
            } else {
                eVMBatchSignBroadcastUseCase$signAndBroadcast$1 = new EVMBatchSignBroadcastUseCase$signAndBroadcast$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = eVMBatchSignBroadcastUseCase$signAndBroadcast$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = eVMBatchSignBroadcastUseCase$signAndBroadcast$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            long jValueOf = C33129mqd.valueOf(c28194kSj.KWHzl());
            C28196kSl c28196kSl = this.EZpvd;
            eVMBatchSignBroadcastUseCase$signAndBroadcast$1.L$0 = this;
            eVMBatchSignBroadcastUseCase$signAndBroadcast$1.L$1 = c28194kSj;
            eVMBatchSignBroadcastUseCase$signAndBroadcast$1.L$2 = fragmentActivity;
            eVMBatchSignBroadcastUseCase$signAndBroadcast$1.J$0 = jValueOf;
            eVMBatchSignBroadcastUseCase$signAndBroadcast$1.label = 1;
            objEZpvd = c28196kSl.EZpvd(eVMBatchSignBroadcastUseCase$signAndBroadcast$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c28195kSk = this;
            c28194kSj2 = c28194kSj;
            j = jValueOf;
            fragmentActivity2 = fragmentActivity;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                return ((Result) objEZpvd).m7386unboximpl();
            }
            j = eVMBatchSignBroadcastUseCase$signAndBroadcast$1.J$0;
            FragmentActivity fragmentActivity3 = (FragmentActivity) eVMBatchSignBroadcastUseCase$signAndBroadcast$1.L$2;
            C28194kSj c28194kSj3 = (C28194kSj) eVMBatchSignBroadcastUseCase$signAndBroadcast$1.L$1;
            C28195kSk c28195kSk2 = (C28195kSk) eVMBatchSignBroadcastUseCase$signAndBroadcast$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            fragmentActivity2 = fragmentActivity3;
            c28194kSj2 = c28194kSj3;
            c28195kSk = c28195kSk2;
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) objEZpvd;
        if (interfaceC9738bbJ == null) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 13, null)));
        }
        AbstractC9836bdB.StateListAnimator stateListAnimatorOLrzqt = c28195kSk.OLrzqt(c28194kSj2.OLrzqt(), j);
        if (stateListAnimatorOLrzqt == null) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 13, null)));
        }
        AbstractC9836bdB.StateListAnimator stateListAnimatorEZpvd = c28195kSk.EZpvd(c28194kSj2.AYXKKw().getCallData(), j);
        if (stateListAnimatorEZpvd == null) {
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 13, null)));
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        EVMBatchSignBroadcastUseCase$signAndBroadcast$2 eVMBatchSignBroadcastUseCase$signAndBroadcast$2 = new EVMBatchSignBroadcastUseCase$signAndBroadcast$2(c28195kSk, fragmentActivity2, interfaceC9738bbJ, stateListAnimatorOLrzqt, stateListAnimatorEZpvd, c28194kSj2, null);
        eVMBatchSignBroadcastUseCase$signAndBroadcast$1.L$0 = null;
        eVMBatchSignBroadcastUseCase$signAndBroadcast$1.L$1 = null;
        eVMBatchSignBroadcastUseCase$signAndBroadcast$1.L$2 = null;
        eVMBatchSignBroadcastUseCase$signAndBroadcast$1.label = 2;
        objEZpvd = BuildersKt.withContext(main, eVMBatchSignBroadcastUseCase$signAndBroadcast$2, eVMBatchSignBroadcastUseCase$signAndBroadcast$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        return ((Result) objEZpvd).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC9836bdB.StateListAnimator OLrzqt(ApproveUnsignedData approveUnsignedData, long j) {
        java.lang.String strCopydefault;
        java.lang.String strCopydefault2;
        java.lang.String strCopydefault3;
        java.lang.String string;
        java.lang.String strCopydefault4;
        java.lang.String to = approveUnsignedData.getTo();
        java.lang.String strCopydefault5 = null;
        if (to == null) {
            return null;
        }
        java.lang.Integer nonce = approveUnsignedData.getNonce();
        java.lang.String str = (nonce == null || (string = nonce.toString()) == null || (strCopydefault4 = C33491mxU.copydefault(string)) == null) ? "0x0" : strCopydefault4;
        java.lang.String value = approveUnsignedData.getValue();
        java.lang.String str2 = (value == null || (strCopydefault3 = C33491mxU.copydefault(value)) == null) ? "0x0" : strCopydefault3;
        java.lang.String data = approveUnsignedData.getData();
        if (data == null) {
            data = "";
        }
        java.lang.String str3 = data;
        java.lang.Long gas = approveUnsignedData.getGas();
        java.lang.String strCopydefault6 = C33491mxU.copydefault(java.lang.String.valueOf(gas != null ? gas.longValue() : 0L));
        java.lang.String type = approveUnsignedData.getType();
        java.lang.String str4 = type == null ? "0x0" : type;
        java.lang.String gasPrice = approveUnsignedData.getGasPrice();
        if (gasPrice == null) {
            strCopydefault = null;
        } else {
            if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) gasPrice))) {
                gasPrice = null;
            }
            if (gasPrice != null) {
                strCopydefault = C33491mxU.copydefault(gasPrice);
            }
        }
        java.lang.String maxFeePerGas = approveUnsignedData.getMaxFeePerGas();
        if (maxFeePerGas == null) {
            strCopydefault2 = null;
        } else {
            if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxFeePerGas))) {
                maxFeePerGas = null;
            }
            if (maxFeePerGas != null) {
                strCopydefault2 = C33491mxU.copydefault(maxFeePerGas);
            }
        }
        java.lang.String maxPriorityFeePerGas = approveUnsignedData.getMaxPriorityFeePerGas();
        if (maxPriorityFeePerGas != null) {
            if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxPriorityFeePerGas))) {
                maxPriorityFeePerGas = null;
            }
            if (maxPriorityFeePerGas != null) {
                strCopydefault5 = C33491mxU.copydefault(maxPriorityFeePerGas);
            }
        }
        return new AbstractC9836bdB.StateListAnimator(j, str, to, str2, str3, strCopydefault6, str4, j, strCopydefault, strCopydefault2, strCopydefault5);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC9836bdB.StateListAnimator EZpvd(V6CallData v6CallData, long j) {
        java.lang.String strCopydefault;
        java.lang.String strCopydefault2;
        java.lang.String string;
        java.lang.String strCopydefault3;
        java.lang.String strCopydefault4 = null;
        if (v6CallData == null) {
            return null;
        }
        java.lang.Long nonce = v6CallData.getNonce();
        java.lang.String str = (nonce == null || (string = nonce.toString()) == null || (strCopydefault3 = C33491mxU.copydefault(string)) == null) ? "0x0" : strCopydefault3;
        java.lang.String to = v6CallData.getTo();
        java.lang.String strCopydefault5 = C33491mxU.copydefault(v6CallData.getValue());
        java.lang.String data = v6CallData.getData();
        java.lang.String strCopydefault6 = C33491mxU.copydefault(v6CallData.getGas());
        java.lang.String type = v6CallData.getType();
        java.lang.String str2 = type == null ? "0x0" : type;
        java.lang.String gasPrice = v6CallData.getGasPrice();
        if (gasPrice == null) {
            strCopydefault = null;
        } else {
            if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) gasPrice))) {
                gasPrice = null;
            }
            if (gasPrice != null) {
                strCopydefault = C33491mxU.copydefault(gasPrice);
            }
        }
        java.lang.String maxFeePerGas = v6CallData.getMaxFeePerGas();
        if (maxFeePerGas == null) {
            strCopydefault2 = null;
        } else {
            if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxFeePerGas))) {
                maxFeePerGas = null;
            }
            if (maxFeePerGas != null) {
                strCopydefault2 = C33491mxU.copydefault(maxFeePerGas);
            }
        }
        java.lang.String maxPriorityFeePerGas = v6CallData.getMaxPriorityFeePerGas();
        if (maxPriorityFeePerGas != null) {
            if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxPriorityFeePerGas))) {
                maxPriorityFeePerGas = null;
            }
            if (maxPriorityFeePerGas != null) {
                strCopydefault4 = C33491mxU.copydefault(maxPriorityFeePerGas);
            }
        }
        return new AbstractC9836bdB.StateListAnimator(j, str, to, strCopydefault5, data, strCopydefault6, str2, j, strCopydefault, strCopydefault2, strCopydefault4);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, ApproveUnsignedData approveUnsignedData, V6CalldataResponseData v6CalldataResponseData, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.util.List<java.lang.String> list, boolean z, Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        EVMBatchSignBroadcastUseCase$batchBroadcast$1 eVMBatchSignBroadcastUseCase$batchBroadcast$1;
        ApproveUnsignedData approveUnsignedData2;
        V6CalldataResponseData v6CalldataResponseData2;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.util.List<java.lang.String> list2;
        boolean z2;
        java.lang.String str14;
        C28195kSk c28195kSk;
        java.lang.String strEncodeToString;
        java.lang.String str15;
        AbstractC43419rot abstractC43419rot;
        if (continuation instanceof EVMBatchSignBroadcastUseCase$batchBroadcast$1) {
            eVMBatchSignBroadcastUseCase$batchBroadcast$1 = (EVMBatchSignBroadcastUseCase$batchBroadcast$1) continuation;
            int i = eVMBatchSignBroadcastUseCase$batchBroadcast$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVMBatchSignBroadcastUseCase$batchBroadcast$1.label = i - Integer.MIN_VALUE;
            } else {
                eVMBatchSignBroadcastUseCase$batchBroadcast$1 = new EVMBatchSignBroadcastUseCase$batchBroadcast$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = eVMBatchSignBroadcastUseCase$batchBroadcast$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = eVMBatchSignBroadcastUseCase$batchBroadcast$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            C28196kSl c28196kSl = this.EZpvd;
            long jValueOf = C33129mqd.valueOf(str);
            eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$0 = this;
            eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$1 = str;
            approveUnsignedData2 = approveUnsignedData;
            eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$2 = approveUnsignedData2;
            v6CalldataResponseData2 = v6CalldataResponseData;
            eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$3 = v6CalldataResponseData2;
            str8 = str2;
            eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$4 = str8;
            str9 = str3;
            eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$5 = str9;
            str10 = str4;
            eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$6 = str10;
            str11 = str5;
            eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$7 = str11;
            str12 = str6;
            eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$8 = str12;
            str13 = str7;
            eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$9 = str13;
            list2 = list;
            eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$10 = list2;
            eVMBatchSignBroadcastUseCase$batchBroadcast$1.Z$0 = z;
            eVMBatchSignBroadcastUseCase$batchBroadcast$1.label = 1;
            objOLrzqt = c28196kSl.OLrzqt(jValueOf, eVMBatchSignBroadcastUseCase$batchBroadcast$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            z2 = z;
            str14 = str;
            c28195kSk = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str15 = (java.lang.String) eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                abstractC43419rot = (AbstractC43419rot) objOLrzqt;
                if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                    Result.Application application = Result.Companion;
                    return Result.m7377constructorimpl(str15);
                }
                if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                Result.Application application2 = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()));
            }
            z2 = eVMBatchSignBroadcastUseCase$batchBroadcast$1.Z$0;
            java.util.List<java.lang.String> list3 = (java.util.List) eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$10;
            java.lang.String str16 = (java.lang.String) eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$9;
            java.lang.String str17 = (java.lang.String) eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$8;
            java.lang.String str18 = (java.lang.String) eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$7;
            str10 = (java.lang.String) eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$6;
            java.lang.String str19 = (java.lang.String) eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$5;
            java.lang.String str20 = (java.lang.String) eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$4;
            V6CalldataResponseData v6CalldataResponseData3 = (V6CalldataResponseData) eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$3;
            ApproveUnsignedData approveUnsignedData3 = (ApproveUnsignedData) eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$2;
            str14 = (java.lang.String) eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$1;
            c28195kSk = (C28195kSk) eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            list2 = list3;
            approveUnsignedData2 = approveUnsignedData3;
            str13 = str16;
            v6CalldataResponseData2 = v6CalldataResponseData3;
            str12 = str17;
            str8 = str20;
            str11 = str18;
            str9 = str19;
        }
        java.lang.String str21 = (java.lang.String) objOLrzqt;
        if (str21 == null) {
            str21 = "";
        }
        java.lang.String id = approveUnsignedData2.getId();
        V6BatchTxItem v6BatchTxItem = new V6BatchTxItem(id != null ? id : "", str8, approveUnsignedData2.getUnsignedTx(), str9);
        java.lang.String orderId = v6CalldataResponseData2.getOrderId();
        if (orderId == null) {
            orderId = "";
        }
        V6CallData callData = v6CalldataResponseData2.getCallData();
        if (callData != null) {
            Json.Default r9 = Json.Default;
            r9.getSerializersModule();
            strEncodeToString = r9.encodeToString(V6CallData.Companion.serializer(), callData);
        } else {
            strEncodeToString = null;
        }
        V6BatchBroadcastRequest v6BatchBroadcastRequest = new V6BatchBroadcastRequest(c28195kSk.EZpvd.copydefault(), str21, str14, yDY.gEmmrt(v6BatchTxItem, new V6BatchTxItem(orderId, str10, strEncodeToString, str11)), list2, str12, str13, C56443yFo.KWHzl(true), new V6BroadcastAccountInfo(c28195kSk.KWHzl.OLrzqt(), z2));
        gYX gyx = c28195kSk.OLrzqt;
        eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$0 = str11;
        eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$1 = null;
        eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$2 = null;
        eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$3 = null;
        eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$4 = null;
        eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$5 = null;
        eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$6 = null;
        eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$7 = null;
        eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$8 = null;
        eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$9 = null;
        eVMBatchSignBroadcastUseCase$batchBroadcast$1.L$10 = null;
        eVMBatchSignBroadcastUseCase$batchBroadcast$1.label = 2;
        objOLrzqt = gyx.EZpvd(v6BatchBroadcastRequest, eVMBatchSignBroadcastUseCase$batchBroadcast$1);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        str15 = str11;
        abstractC43419rot = (AbstractC43419rot) objOLrzqt;
        if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
        }
    }
}
