package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.defi.biz.core.mpc.MpcWalletCreateType;
import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.CheckShareRequestBody;
import com.okinc.business.defi.biz.net.bean.CheckShareResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class fIO {
    public final C13934dbu KWHzl = new C13934dbu();

    public final void KWHzl(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, final int i, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        dZP dzp = dZP.OLrzqt;
        final java.lang.String strEZpvd = dzp.EZpvd();
        java.lang.String strOLrzqt = dzp.OLrzqt();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        AbstractC58185ywX abstractC58185ywXOLrzqt = C43423rox.OLrzqt(C58156yvv.EZpvd(EZpvd(str, str2, strOLrzqt, strEZpvd), abstractActivityC33041mov), new Function1() { // from class: o.fIN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(fIO.EZpvd((ResponseData) obj));
            }
        });
        final Function1 function12 = new Function1() { // from class: o.fIP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fIO.KWHzl(objectRef, str2, strEZpvd, (CheckShareResponse) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.fIS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fIO.KWHzl(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.fIU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fIO.OLrzqt(abstractActivityC33041mov, objectRef, str3, str, function1, i, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fIT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fIO.AEQbTJ(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.fIQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fIO.KWHzl(abstractActivityC33041mov, this, i, str, str2, str3, function1, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fIR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fIO.AhwBna(function14, obj);
            }
        });
        if (abstractActivityC33041mov instanceof ActivityC18845fqB) {
            ((ActivityC18845fqB) abstractActivityC33041mov).OLrzqt().AEQbTJ(interfaceC58217yxCAEQbTJ);
        } else {
            abstractActivityC33041mov.addDisposable(interfaceC58217yxCAEQbTJ);
        }
    }

    public static final InterfaceC60096zvd KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public static final InterfaceC60096zvd KWHzl(Ref.ObjectRef objectRef, java.lang.String str, java.lang.String str2, CheckShareResponse checkShareResponse) {
        Intrinsics.checkNotNullParameter(checkShareResponse, "");
        if (checkShareResponse.getShareStatus()) {
            ?? EZpvd = C10964byQ.EZpvd(str);
            objectRef.element = EZpvd;
            if (EZpvd != 0) {
                return C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AYXKKw(str2).EZpvd();
            }
            return AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.RuntimeException("data error"));
        }
        return AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.RuntimeException("data error"));
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, Ref.ObjectRef objectRef, java.lang.String str, java.lang.String str2, Function1 function1, int i, java.util.List list) {
        java.lang.Object next;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP;
        java.lang.String mpcId;
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!((AbstractC12782ctV) next).DCUTEIdCUTEI()) {
                break;
            }
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) next;
        java.lang.String str3 = (abstractC12782ctV == null || (mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP()) == null || (mpcId = mpcWalletEncodeInfoQSBOWP.getMpcId()) == null) ? "" : mpcId;
        C19631gJn c19631gJn = (C19631gJn) new ViewModelProvider(abstractActivityC33041mov).get(C19631gJn.class);
        java.lang.String str4 = (java.lang.String) objectRef.element;
        c19631gJn.copydefault(str, str4 == null ? "" : str4, str2, str3, MpcWalletCreateType.QRCODE_RECOVER.getValue(), abstractActivityC33041mov.getSupportFragmentManager(), C33069mpW.copydefault(C13754dXa.FragmentManager.Nullable, C56423yEv.EZpvd(C56390yDp.OLrzqt("acctname", dZP.OLrzqt.AhwBna()))), function1, i);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(final AbstractActivityC33041mov abstractActivityC33041mov, final fIO fio, final int i, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final Function1 function1, java.lang.Throwable th) {
        C43296rmc.AEQbTJ("restoreFromScan", "error " + th.getMessage());
        C15724eSy.operatorNetworkError$default(C15724eSy.AEQbTJ, abstractActivityC33041mov, new Function0() { // from class: o.fIM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fIO.AEQbTJ(this.EZpvd, abstractActivityC33041mov, i, str, str2, str3, function1);
            }
        }, null, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(fIO fio, AbstractActivityC33041mov abstractActivityC33041mov, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, Function1 function1) {
        fio.KWHzl(abstractActivityC33041mov, i, str, str2, str3, function1);
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<ResponseData<CheckShareResponse>> EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws JSONException {
        java.lang.String ecdsaShare2;
        java.lang.String strEZpvd = C10964byQ.EZpvd(str2);
        if (strEZpvd == null) {
            AbstractC58185ywX<ResponseData<CheckShareResponse>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, null, null, 63, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        MpcWalletDecodeInfo mpcWalletDecodeInfoOLrzqt = C10964byQ.OLrzqt(strEZpvd, str, str4, str3, "", false);
        if (mpcWalletDecodeInfoOLrzqt == null || (ecdsaShare2 = mpcWalletDecodeInfoOLrzqt.getEcdsaShare2()) == null) {
            AbstractC58185ywX<ResponseData<CheckShareResponse>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, null, null, 63, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        JSONObject jSONObject = new JSONObject(AEQbTJ(ecdsaShare2));
        java.lang.String string = jSONObject.getString("message");
        java.lang.String string2 = jSONObject.getString("signature");
        C13934dbu c13934dbu = this.KWHzl;
        Intrinsics.copydefault((java.lang.Object) string);
        Intrinsics.copydefault((java.lang.Object) string2);
        return c13934dbu.KWHzl(new CheckShareRequestBody(str, 0, string, string2));
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        return xYQ.KWHzl.copydefault(str);
    }

    public static final boolean EZpvd(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return (responseData.getCode() != 0 || responseData.getData() == null || responseData.getData() == null) ? false : true;
    }
}
