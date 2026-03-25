package o;

import com.okinc.business.defi.biz.net.bean.Eip7702Status;
import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import com.okinc.business.defi.biz.net.bean.TeeAndEip7702Item;
import com.okinc.business.defi.biz.net.bean.TeeAndEip7702StatusItem;
import com.okinc.business.defi.biz.net.bean.TeeStatus;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus;
import com.okinc.business.defi.wallet.tee.usecase.TeeAnd7702StatusUseCaseImpl$getTeeAndEip7702Status$1;
import com.okinc.business.defi.wallet.tee.usecase.TeeAnd7702StatusUseCaseImpl$getTeeAndEip7702Statuses$1;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC17923fXh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fXk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17926fXk implements InterfaceC17923fXh {
    public final fVJ EZpvd;

    public C17926fXk(@NotNull fVJ fvj) {
        Intrinsics.checkNotNullParameter(fvj, "");
        this.EZpvd = fvj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull Continuation<? super TeeStatus> continuation) throws java.lang.Throwable {
        TeeAnd7702StatusUseCaseImpl$getTeeAndEip7702Status$1 teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Status$1;
        if (continuation instanceof TeeAnd7702StatusUseCaseImpl$getTeeAndEip7702Status$1) {
            teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Status$1 = (TeeAnd7702StatusUseCaseImpl$getTeeAndEip7702Status$1) continuation;
            int i = teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Status$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Status$1.label = i - Integer.MIN_VALUE;
            } else {
                teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Status$1 = new TeeAnd7702StatusUseCaseImpl$getTeeAndEip7702Status$1(this, continuation);
            }
        }
        TeeAnd7702StatusUseCaseImpl$getTeeAndEip7702Status$1 teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Status$12 = teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Status$1;
        java.lang.Object objAEQbTJ = teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Status$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Status$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            fVJ fvj = this.EZpvd;
            teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Status$12.label = 1;
            objAEQbTJ = fvj.AEQbTJ(str, str2, true, z, teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Status$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        SingleTeeStatus singleTeeStatus = (SingleTeeStatus) objAEQbTJ;
        if (singleTeeStatus != null) {
            return singleTeeStatus.getTeeStatus();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.util.List<TeeAndEip7702Item> list, @NotNull Continuation<? super InterfaceC17923fXh.ActionBar> continuation) throws java.lang.Throwable {
        TeeAnd7702StatusUseCaseImpl$getTeeAndEip7702Statuses$1 teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Statuses$1;
        java.util.Map map;
        java.util.Map map2;
        if (continuation instanceof TeeAnd7702StatusUseCaseImpl$getTeeAndEip7702Statuses$1) {
            teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Statuses$1 = (TeeAnd7702StatusUseCaseImpl$getTeeAndEip7702Statuses$1) continuation;
            int i = teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Statuses$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Statuses$1.label = i - Integer.MIN_VALUE;
            } else {
                teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Statuses$1 = new TeeAnd7702StatusUseCaseImpl$getTeeAndEip7702Statuses$1(this, continuation);
            }
        }
        java.lang.Object obj = teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Statuses$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Statuses$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            fVJ fvj = this.EZpvd;
            teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Statuses$1.L$0 = linkedHashMap;
            teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Statuses$1.L$1 = linkedHashMap2;
            teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Statuses$1.label = 1;
            java.lang.Object objKWHzl = fvj.KWHzl(list, teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Statuses$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            map = linkedHashMap;
            obj = objKWHzl;
            map2 = linkedHashMap2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map2 = (java.util.Map) teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Statuses$1.L$1;
            map = (java.util.Map) teeAnd7702StatusUseCaseImpl$getTeeAndEip7702Statuses$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        for (TeeAndEip7702StatusItem teeAndEip7702StatusItem : (java.lang.Iterable) obj) {
            TeeStatus teeStatus = teeAndEip7702StatusItem.getTeeStatus();
            if (teeStatus != null) {
                map.put(teeAndEip7702StatusItem.getAccountId(), teeStatus);
            }
            Eip7702Status eip7702Status = teeAndEip7702StatusItem.getEip7702Status();
            if (eip7702Status != null) {
                map2.put(teeAndEip7702StatusItem.getAccountId(), EIP7702WalletStatus.Companion.KWHzl(C56443yFo.AEQbTJ(eip7702Status.getStatus())));
            }
        }
        return new InterfaceC17923fXh.ActionBar(map, map2);
    }
}
