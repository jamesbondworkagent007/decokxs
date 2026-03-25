package com.okinc.business.defi.wallet.common.okxconnect.util;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import com.flyco.tablayout.BuildConfig;
import com.google.common.base.Ascii;
import com.google.mlkit.common.MlKitException;
import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.TrxDappSignData;
import com.okinc.business.defi.wallet.common.okxconnect.util.MethodHelperActivity;
import com.okinc.network.okg.response.ResponseData;
import java.io.Serializable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.AbstractActivityC33013moT;
import o.AbstractC58185ywX;
import o.C33129mqd;
import o.C43251rlk;
import o.C44103sDl;
import o.C56390yDp;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC16048eca;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.InterfaceC9854bdT;
import o.pUU;
import o.xWE;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class MethodHelperActivity extends AbstractActivityC33013moT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public static InterfaceC16048eca OLrzqt;
    public String KWHzl;
    public String copydefault = "MethodHelperActivity";
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.ecc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return MethodHelperActivity.copydefault();
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.ecd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return MethodHelperActivity.KWHzl();
        }
    });
    public final Json AEQbTJ = JsonKt.Json$default(null, new Function1() { // from class: o.ecb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return MethodHelperActivity.EZpvd((JsonBuilder) obj);
        }
    }, 1, null);

    /* JADX INFO: loaded from: classes14.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MethodType.values().length];
            try {
                iArr[MethodType.SIGN_TRANSACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MethodType.SEND_TRANSACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MethodType.ADD_ETHEREUM_CHAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MethodType.WATCH_EVM_ASSET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MethodType.BTC_SEND_TRANSACTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MethodType.BTC_SIGN_AND_PUSH_PSBT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MethodType.COSMOS_SEND_TRANSACTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MethodType.TRON_SIGN_MESSAGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MethodType.TRON_APPROVE_DAPP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MethodType.TRON_SIGN_TRANSFER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public String getTAG() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.util.MethodHelperActivity.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void OLrzqt(@NotNull Context context, @NotNull String str, @NotNull DappSignArgs dappSignArgs, InterfaceC16048eca interfaceC16048eca) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(dappSignArgs, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) MethodHelperActivity.class).putExtra("ARG_PARAM", dappSignArgs).putExtra("ARG_METHOD_TYPE", MethodType.SIGN_TRANSACTION).putExtra("ARG_BUNDLE_RESULT_KEY", "data").putExtra("ARG_MESSAGE_ID", str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            MethodHelperActivity.OLrzqt = interfaceC16048eca;
            context.startActivity(intentPutExtra);
        }

        public final void copydefault(@NotNull Context context, @NotNull String str, @NotNull DappSignArgs dappSignArgs, InterfaceC16048eca interfaceC16048eca) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(dappSignArgs, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) MethodHelperActivity.class).putExtra("ARG_PARAM", dappSignArgs).putExtra("ARG_METHOD_TYPE", MethodType.TRON_SIGN_MESSAGE).putExtra("ARG_BUNDLE_RESULT_KEY", "data").putExtra("ARG_MESSAGE_ID", str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            MethodHelperActivity.OLrzqt = interfaceC16048eca;
            context.startActivity(intentPutExtra);
        }

        public static /* synthetic */ void startSendTransaction$default(StateListAnimator stateListAnimator, Context context, String str, DappInteractionArgs dappInteractionArgs, String str2, boolean z, InterfaceC16048eca interfaceC16048eca, int i, Object obj) {
            if ((i & 16) != 0) {
                z = false;
            }
            stateListAnimator.AEQbTJ(context, str, dappInteractionArgs, str2, z, interfaceC16048eca);
        }

        public final void AEQbTJ(@NotNull Context context, @NotNull String str, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull String str2, boolean z, InterfaceC16048eca interfaceC16048eca) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) MethodHelperActivity.class).putExtra("ARG_PARAM", dappInteractionArgs).putExtra("ARG_METHOD_TYPE", MethodType.SEND_TRANSACTION).putExtra("ARG_BUNDLE_RESULT_KEY", str2).putExtra("ARG_IS_USE_NEW_CALLBACK", z).putExtra("ARG_MESSAGE_ID", str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            MethodHelperActivity.OLrzqt = interfaceC16048eca;
            context.startActivity(intentPutExtra);
        }

        public final void EZpvd(@NotNull Context context, @NotNull String str, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull String str2, InterfaceC16048eca interfaceC16048eca) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) MethodHelperActivity.class).putExtra("ARG_PARAM", dappInteractionArgs).putExtra("ARG_METHOD_TYPE", MethodType.TRON_APPROVE_DAPP).putExtra("ARG_BUNDLE_RESULT_KEY", str2).putExtra("ARG_MESSAGE_ID", str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            MethodHelperActivity.OLrzqt = interfaceC16048eca;
            context.startActivity(intentPutExtra);
        }

        public final void KWHzl(@NotNull Context context, @NotNull String str, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull String str2, InterfaceC16048eca interfaceC16048eca) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) MethodHelperActivity.class).putExtra("ARG_PARAM", dappInteractionArgs).putExtra("ARG_METHOD_TYPE", MethodType.TRON_SIGN_TRANSFER).putExtra("ARG_BUNDLE_RESULT_KEY", str2).putExtra("ARG_MESSAGE_ID", str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            MethodHelperActivity.OLrzqt = interfaceC16048eca;
            context.startActivity(intentPutExtra);
        }

        public static /* synthetic */ void startCosmosSendTransaction$default(StateListAnimator stateListAnimator, Context context, String str, DappInteractionArgs dappInteractionArgs, String str2, boolean z, InterfaceC16048eca interfaceC16048eca, int i, Object obj) {
            if ((i & 16) != 0) {
                z = false;
            }
            stateListAnimator.EZpvd(context, str, dappInteractionArgs, str2, z, interfaceC16048eca);
        }

        public final void EZpvd(@NotNull Context context, @NotNull String str, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull String str2, boolean z, InterfaceC16048eca interfaceC16048eca) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) MethodHelperActivity.class).putExtra("ARG_PARAM", dappInteractionArgs).putExtra("ARG_METHOD_TYPE", MethodType.COSMOS_SEND_TRANSACTION).putExtra("ARG_BUNDLE_RESULT_KEY", str2).putExtra("ARG_IS_USE_NEW_CALLBACK", z).putExtra("ARG_MESSAGE_ID", str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            MethodHelperActivity.OLrzqt = interfaceC16048eca;
            context.startActivity(intentPutExtra);
        }

        public final void AEQbTJ(@NotNull Context context, @NotNull String str, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull String str2, InterfaceC16048eca interfaceC16048eca) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) MethodHelperActivity.class).putExtra("ARG_PARAM", dappInteractionArgs).putExtra("ARG_METHOD_TYPE", MethodType.ADD_ETHEREUM_CHAIN).putExtra("ARG_BUNDLE_RESULT_KEY", str2).putExtra("ARG_MESSAGE_ID", str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            MethodHelperActivity.OLrzqt = interfaceC16048eca;
            context.startActivity(intentPutExtra);
        }

        public final void OLrzqt(@NotNull Context context, @NotNull String str, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull String str2, InterfaceC16048eca interfaceC16048eca) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) MethodHelperActivity.class).putExtra("ARG_PARAM", dappInteractionArgs).putExtra("ARG_METHOD_TYPE", MethodType.WATCH_EVM_ASSET).putExtra("ARG_BUNDLE_RESULT_KEY", str2).putExtra("ARG_MESSAGE_ID", str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            MethodHelperActivity.OLrzqt = interfaceC16048eca;
            context.startActivity(intentPutExtra);
        }

        public final void copydefault(@NotNull Context context, @NotNull String str, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull String str2, InterfaceC16048eca interfaceC16048eca) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) MethodHelperActivity.class).putExtra("ARG_PARAM", dappInteractionArgs).putExtra("ARG_METHOD_TYPE", MethodType.BTC_SEND_TRANSACTION).putExtra("ARG_BUNDLE_RESULT_KEY", str2).putExtra("ARG_MESSAGE_ID", str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            MethodHelperActivity.OLrzqt = interfaceC16048eca;
            context.startActivity(intentPutExtra);
        }

        public final void KWHzl(@NotNull Context context, @NotNull String str, @NotNull DappSignArgs dappSignArgs, @NotNull InterfaceC16048eca interfaceC16048eca) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(dappSignArgs, "");
            Intrinsics.checkNotNullParameter(interfaceC16048eca, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) MethodHelperActivity.class).putExtra("ARG_PARAM", dappSignArgs).putExtra("ARG_METHOD_TYPE", MethodType.BTC_SIGN_AND_PUSH_PSBT).putExtra("ARG_MESSAGE_ID", str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            MethodHelperActivity.OLrzqt = interfaceC16048eca;
            context.startActivity(intentPutExtra);
        }
    }

    public final InterfaceC9854bdT gEmmrt() {
        return (InterfaceC9854bdT) this.AhwBna.getValue();
    }

    public static final InterfaceC9854bdT copydefault() {
        return (InterfaceC9854bdT) C43251rlk.copydefault(InterfaceC9854bdT.class);
    }

    public final xWE AYXKKw() {
        return (xWE) this.AYXKKw.getValue();
    }

    public static final xWE KWHzl() {
        return (xWE) C43251rlk.copydefault(xWE.class);
    }

    public final String AEQbTJ() {
        String stringExtra = getIntent().getStringExtra("ARG_MESSAGE_ID");
        return stringExtra == null ? "" : stringExtra;
    }

    public static final Unit EZpvd(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        MethodType methodType;
        super.onCreate(bundle);
        this.KWHzl = getIntent().getStringExtra("ARG_BUNDLE_RESULT_KEY");
        if (Build.VERSION.SDK_INT >= 33) {
            methodType = (MethodType) getIntent().getSerializableExtra("ARG_METHOD_TYPE", MethodType.class);
        } else {
            Serializable serializableExtra = getIntent().getSerializableExtra("ARG_METHOD_TYPE");
            methodType = serializableExtra instanceof MethodType ? (MethodType) serializableExtra : null;
        }
        pUU.EZpvd(getTAG(), "onCreate " + methodType);
        if (methodType == null) {
            finish();
            return;
        }
        switch (TaskDescription.KWHzl[methodType.ordinal()]) {
            case 1:
                fetchVPNInfo();
                return;
            case 2:
                AkhnZx();
                return;
            case 3:
                djBIcL();
                return;
            case 4:
                fARcdN();
                return;
            case 5:
                valueOf();
                return;
            case 6:
                AhwBna();
                return;
            case 7:
                isConnected();
                return;
            case 8:
                DbNXlk();
                return;
            case 9:
                values();
                return;
            case 10:
                ejfBZ();
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void fetchVPNInfo() {
        DappSignArgs dappSignArgs;
        if (Build.VERSION.SDK_INT >= 33) {
            dappSignArgs = (DappSignArgs) getIntent().getParcelableExtra("ARG_PARAM", DappSignArgs.class);
        } else {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("ARG_PARAM");
            dappSignArgs = parcelableExtra instanceof DappSignArgs ? (DappSignArgs) parcelableExtra : null;
        }
        final DappSignArgs dappSignArgs2 = dappSignArgs;
        if (dappSignArgs2 == null) {
            finish();
        } else {
            pUU.EZpvd(getTAG(), "handleSignTransaction");
            InterfaceC9854bdT.Application.startSignDapp$default(gEmmrt(), this, dappSignArgs2, new Function1() { // from class: o.ebY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MethodHelperActivity.OLrzqt(this.OLrzqt, dappSignArgs2, (android.os.Bundle) obj);
                }
            }, null, 8, null);
        }
    }

    public static final Unit OLrzqt(MethodHelperActivity methodHelperActivity, DappSignArgs dappSignArgs, Bundle bundle) {
        methodHelperActivity.KWHzl(bundle, dappSignArgs.getChainId());
        methodHelperActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AkhnZx() {
        final DappInteractionArgs dappInteractionArgs;
        DappInteractionArgs dappInteractionArgs2;
        if (Build.VERSION.SDK_INT >= 33) {
            dappInteractionArgs2 = (DappInteractionArgs) getIntent().getParcelableExtra("ARG_PARAM", DappInteractionArgs.class);
        } else {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("ARG_PARAM");
            if (!(parcelableExtra instanceof DappInteractionArgs)) {
                dappInteractionArgs = null;
                boolean booleanExtra = getIntent().getBooleanExtra("ARG_IS_USE_NEW_CALLBACK", false);
                if (dappInteractionArgs != null) {
                    finish();
                    return;
                } else {
                    InterfaceC9854bdT.Application.startContractInteraction$default(gEmmrt(), this, dappInteractionArgs, new Function1() { // from class: o.ebN
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return MethodHelperActivity.gEmmrt(this.copydefault, dappInteractionArgs, (android.os.Bundle) obj);
                        }
                    }, booleanExtra ? new Function1() { // from class: o.ebV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return MethodHelperActivity.OLrzqt((NewCallbackBean) obj);
                        }
                    } : null, null, 16, null);
                    return;
                }
            }
            dappInteractionArgs2 = (DappInteractionArgs) parcelableExtra;
        }
        dappInteractionArgs = dappInteractionArgs2;
        boolean booleanExtra2 = getIntent().getBooleanExtra("ARG_IS_USE_NEW_CALLBACK", false);
        if (dappInteractionArgs != null) {
        }
    }

    public static final Unit gEmmrt(MethodHelperActivity methodHelperActivity, DappInteractionArgs dappInteractionArgs, Bundle bundle) {
        methodHelperActivity.KWHzl(bundle, dappInteractionArgs.getChainId());
        methodHelperActivity.finish();
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX OLrzqt(NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, "", null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public final void DbNXlk() {
        DappSignArgs dappSignArgs;
        if (Build.VERSION.SDK_INT >= 33) {
            dappSignArgs = (DappSignArgs) getIntent().getParcelableExtra("ARG_PARAM", DappSignArgs.class);
        } else {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("ARG_PARAM");
            dappSignArgs = parcelableExtra instanceof DappSignArgs ? (DappSignArgs) parcelableExtra : null;
        }
        final DappSignArgs dappSignArgs2 = dappSignArgs;
        if (dappSignArgs2 == null) {
            finish();
        } else {
            pUU.EZpvd(getTAG(), "handleSignTransaction");
            InterfaceC9854bdT.Application.startSignDapp$default(gEmmrt(), this, dappSignArgs2, new Function1() { // from class: o.ebT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MethodHelperActivity.KWHzl(this.EZpvd, dappSignArgs2, (android.os.Bundle) obj);
                }
            }, null, 8, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(MethodHelperActivity methodHelperActivity, DappSignArgs dappSignArgs, Bundle bundle) {
        if (bundle != null) {
            try {
                String string = bundle.getString("data");
                if (string == null) {
                    string = "";
                }
                Json json = methodHelperActivity.AEQbTJ;
                json.getSerializersModule();
                List<String> signature = ((TrxDappSignData) json.decodeFromString(TrxDappSignData.Companion.serializer(), string)).getSignature();
                if (signature != null && signature.size() == 1) {
                    methodHelperActivity.KWHzl(BundleKt.bundleOf(C56390yDp.OLrzqt("data", signature.get(0))), dappSignArgs.getChainId());
                }
                methodHelperActivity.finish();
            } catch (Exception unused) {
                pUU.EZpvd(methodHelperActivity.getTAG(), "decode TrxDappSignData failed");
                methodHelperActivity.KWHzl(bundle, dappSignArgs.getChainId());
                methodHelperActivity.finish();
            }
        }
        return Unit.INSTANCE;
    }

    public final void values() {
        final DappInteractionArgs dappInteractionArgs;
        if (Build.VERSION.SDK_INT >= 33) {
            dappInteractionArgs = (DappInteractionArgs) getIntent().getParcelableExtra("ARG_PARAM", DappInteractionArgs.class);
        } else {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("ARG_PARAM");
            dappInteractionArgs = parcelableExtra instanceof DappInteractionArgs ? (DappInteractionArgs) parcelableExtra : null;
        }
        if (dappInteractionArgs == null) {
            finish();
        } else {
            gEmmrt().AEQbTJ(this, dappInteractionArgs, new Function1() { // from class: o.ebZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MethodHelperActivity.AhwBna(this.OLrzqt, dappInteractionArgs, (android.os.Bundle) obj);
                }
            }, dappInteractionArgs.getUseNewCallback() ? new Function1() { // from class: o.ebX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MethodHelperActivity.copydefault((NewCallbackBean) obj);
                }
            } : null);
        }
    }

    public static final Unit AhwBna(MethodHelperActivity methodHelperActivity, DappInteractionArgs dappInteractionArgs, Bundle bundle) {
        methodHelperActivity.KWHzl(bundle, dappInteractionArgs.getChainId());
        methodHelperActivity.finish();
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX copydefault(NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, "", null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void isConnected() {
        DappInteractionArgs dappInteractionArgs;
        DappInteractionArgs dappInteractionArgs2;
        if (Build.VERSION.SDK_INT >= 33) {
            dappInteractionArgs2 = (DappInteractionArgs) getIntent().getParcelableExtra("ARG_PARAM", DappInteractionArgs.class);
        } else {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("ARG_PARAM");
            if (!(parcelableExtra instanceof DappInteractionArgs)) {
                dappInteractionArgs = null;
                boolean booleanExtra = getIntent().getBooleanExtra("ARG_IS_USE_NEW_CALLBACK", false);
                if (dappInteractionArgs != null) {
                    finish();
                    return;
                } else {
                    InterfaceC9854bdT.Application.startContractInteraction$default(gEmmrt(), this, dappInteractionArgs, new Function1() { // from class: o.ebS
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return MethodHelperActivity.AEQbTJ(this.OLrzqt, (android.os.Bundle) obj);
                        }
                    }, booleanExtra ? new Function1() { // from class: o.ebQ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return MethodHelperActivity.OLrzqt(this.OLrzqt, (NewCallbackBean) obj);
                        }
                    } : null, null, 16, null);
                    return;
                }
            }
            dappInteractionArgs2 = (DappInteractionArgs) parcelableExtra;
        }
        dappInteractionArgs = dappInteractionArgs2;
        boolean booleanExtra2 = getIntent().getBooleanExtra("ARG_IS_USE_NEW_CALLBACK", false);
        if (dappInteractionArgs != null) {
        }
    }

    public static final Unit AEQbTJ(MethodHelperActivity methodHelperActivity, Bundle bundle) {
        methodHelperActivity.finish();
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX OLrzqt(MethodHelperActivity methodHelperActivity, NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        InterfaceC16048eca interfaceC16048eca = OLrzqt;
        if (interfaceC16048eca != null) {
            String strAEQbTJ = methodHelperActivity.AEQbTJ();
            String strOptString = new JSONObject(newCallbackBean.getBody().toString()).optString("signRawData");
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            interfaceC16048eca.OLrzqt(strAEQbTJ, strOptString);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, "", null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public final void djBIcL() {
        DappInteractionArgs dappInteractionArgs;
        if (Build.VERSION.SDK_INT >= 33) {
            dappInteractionArgs = (DappInteractionArgs) getIntent().getParcelableExtra("ARG_PARAM", DappInteractionArgs.class);
        } else {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("ARG_PARAM");
            dappInteractionArgs = parcelableExtra instanceof DappInteractionArgs ? (DappInteractionArgs) parcelableExtra : null;
        }
        final DappInteractionArgs dappInteractionArgs2 = dappInteractionArgs;
        if (dappInteractionArgs2 == null) {
            finish();
        } else {
            xWE.StateListAnimator.addCustomEvmChain$default(AYXKKw(), this, dappInteractionArgs2, null, new Function1() { // from class: o.ebR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MethodHelperActivity.AYXKKw(this.AEQbTJ, dappInteractionArgs2, (android.os.Bundle) obj);
                }
            }, 4, null);
        }
    }

    public static final Unit AYXKKw(MethodHelperActivity methodHelperActivity, DappInteractionArgs dappInteractionArgs, Bundle bundle) {
        methodHelperActivity.KWHzl(bundle, dappInteractionArgs.getChainId());
        methodHelperActivity.finish();
        return Unit.INSTANCE;
    }

    public final void fARcdN() {
        DappInteractionArgs dappInteractionArgs;
        if (Build.VERSION.SDK_INT >= 33) {
            dappInteractionArgs = (DappInteractionArgs) getIntent().getParcelableExtra("ARG_PARAM", DappInteractionArgs.class);
        } else {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("ARG_PARAM");
            dappInteractionArgs = parcelableExtra instanceof DappInteractionArgs ? (DappInteractionArgs) parcelableExtra : null;
        }
        final DappInteractionArgs dappInteractionArgs2 = dappInteractionArgs;
        if (dappInteractionArgs2 == null) {
            finish();
        } else {
            xWE.StateListAnimator.watchEvmAsset$default(AYXKKw(), this, dappInteractionArgs2, null, new Function1() { // from class: o.ece
                private static final byte[] $$c = {4, 94, 35, 33};
                private static final int $$d = 220;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$a = {17, 48, 74, -112, -4, 7, -1, Ascii.GS, 7, 7, Ascii.CR, -12, 17, 0, Ascii.VT, -30, 0, 17, 5};
                private static final int $$b = 8;
                private static int gEmmrt = 0;
                private static int AhwBna = 1;
                private static char[] AEQbTJ = {7141, 11844, 11804, 11834, 7143, 7142, 11793, 7150, 11788, 11827, 11870, 11787, 7137, 7138, 11794, 11837, 7149, 11789, 11786, 11802, 11797, 11799, 11801, 11803, 7148, 11790, 7136, 11820, 11792, 11798, 11807, 11784, 7139, 11795, 11805, 11833};
                private static char OLrzqt = 7138;
                private static int KWHzl = 1694165116;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static java.lang.String $$e(byte b, int i, byte b2) {
                    int i2;
                    int i3;
                    int i4 = b * 3;
                    int i5 = (b2 * 4) + 4;
                    byte[] bArr = $$c;
                    int i6 = 120 - i;
                    byte[] bArr2 = new byte[1 - i4];
                    int i7 = 0 - i4;
                    if (bArr == null) {
                        int i8 = i5;
                        int i9 = 0;
                        i5 += i6;
                        i3 = i8 + 1;
                        i2 = i9;
                        bArr2[i2] = (byte) i5;
                        if (i2 == i7) {
                            return new java.lang.String(bArr2, 0);
                        }
                        int i10 = i2 + 1;
                        i8 = i3;
                        i6 = bArr[i3];
                        i9 = i10;
                        i5 += i6;
                        i3 = i8 + 1;
                        i2 = i9;
                        bArr2[i2] = (byte) i5;
                        if (i2 == i7) {
                        }
                    } else {
                        i2 = 0;
                        i5 = i6;
                        i3 = i5;
                        bArr2[i2] = (byte) i5;
                        if (i2 == i7) {
                        }
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static void c(int i, int i2, byte b, java.lang.Object[] objArr) {
                    int i3;
                    byte[] bArr = $$a;
                    int i4 = (i * 20) + 79;
                    int i5 = b + 4;
                    int i6 = i2 * 5;
                    byte[] bArr2 = new byte[11 - i6];
                    int i7 = 10 - i6;
                    if (bArr == null) {
                        int i8 = i5;
                        int i9 = 0;
                        int i10 = i7;
                        i4 = i10 + (-i4) + 8;
                        i5 = i8;
                        i3 = i9;
                        int i11 = i5 + 1;
                        bArr2[i3] = (byte) i4;
                        if (i3 == i7) {
                            objArr[0] = new java.lang.String(bArr2, 0);
                            return;
                        }
                        int i12 = bArr[i11];
                        i10 = i4;
                        i4 = i12;
                        i9 = i3 + 1;
                        i8 = i11;
                        i4 = i10 + (-i4) + 8;
                        i5 = i8;
                        i3 = i9;
                        int i112 = i5 + 1;
                        bArr2[i3] = (byte) i4;
                        if (i3 == i7) {
                        }
                    } else {
                        i3 = 0;
                        int i1122 = i5 + 1;
                        bArr2[i3] = (byte) i4;
                        if (i3 == i7) {
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    int i = 2 % 2;
                    int i2 = gEmmrt + 81;
                    AhwBna = i2 % 128;
                    int i3 = i2 % 2;
                    MethodHelperActivity methodHelperActivity = this.copydefault;
                    if (i3 != 0) {
                        return MethodHelperActivity.isConnected(methodHelperActivity, dappInteractionArgs2, (android.os.Bundle) obj);
                    }
                    MethodHelperActivity.isConnected(methodHelperActivity, dappInteractionArgs2, (android.os.Bundle) obj);
                    java.lang.Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [129=4] */
                /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
                private static void b(int i, char[] cArr, int i2, int i3, boolean z, java.lang.Object[] objArr) throws java.lang.Throwable {
                    int i4 = 2 % 2;
                    Zl zl = new Zl();
                    char[] cArr2 = new char[i3];
                    zl.OLrzqt = 0;
                    while (zl.OLrzqt < i3) {
                        int i5 = $10 + 57;
                        $11 = i5 % 128;
                        int i6 = i5 % 2;
                        zl.KWHzl = cArr[zl.OLrzqt];
                        cArr2[zl.OLrzqt] = (char) (i + zl.KWHzl);
                        int i7 = zl.OLrzqt;
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i7]), java.lang.Integer.valueOf(KWHzl)};
                            java.lang.Object objEZpvd = YY.EZpvd(1433686791);
                            if (objEZpvd == null) {
                                byte length = (byte) $$c.length;
                                objEZpvd = YY.EZpvd(625, 5, (char) 0, 1364500091, false, $$e((byte) 0, length, (byte) (length - 4)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                            }
                            cArr2[i7] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                            java.lang.Object[] objArr3 = {zl, zl};
                            java.lang.Object objEZpvd2 = YY.EZpvd(654343494);
                            if (objEZpvd2 == null) {
                                byte b = (byte) 0;
                                byte b2 = (byte) (b + 5);
                                objEZpvd2 = YY.EZpvd(625, 5, (char) 0, 589344826, false, $$e(b, b2, (byte) (b2 - 5)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                            }
                            ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3);
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    if (i2 > 0) {
                        zl.AEQbTJ = i2;
                        char[] cArr3 = new char[i3];
                        java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i3);
                        java.lang.System.arraycopy(cArr3, 0, cArr2, i3 - zl.AEQbTJ, zl.AEQbTJ);
                        java.lang.System.arraycopy(cArr3, zl.AEQbTJ, cArr2, 0, i3 - zl.AEQbTJ);
                    }
                    if (z) {
                        char[] cArr4 = new char[i3];
                        zl.OLrzqt = 0;
                        int i8 = $10 + 45;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        while (zl.OLrzqt < i3) {
                            cArr4[zl.OLrzqt] = cArr2[(i3 - zl.OLrzqt) - 1];
                            try {
                                java.lang.Object[] objArr4 = {zl, zl};
                                java.lang.Object objEZpvd3 = YY.EZpvd(654343494);
                                if (objEZpvd3 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = (byte) (b3 + 5);
                                    objEZpvd3 = YY.EZpvd(625, 5, (char) 0, 589344826, false, $$e(b3, b4, (byte) (b4 - 5)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                                }
                                ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                            } catch (java.lang.Throwable th2) {
                                java.lang.Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        int i10 = $10 + 55;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        cArr2 = cArr4;
                    }
                    java.lang.String str = new java.lang.String(cArr2);
                    int i12 = $10 + 45;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        throw null;
                    }
                    objArr[0] = str;
                }

                /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [273=8] */
                /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
                private static void a(int i, char[] cArr, byte b, java.lang.Object[] objArr) throws java.lang.Throwable {
                    int i2;
                    java.lang.Object obj;
                    int i3 = 2;
                    int i4 = 2 % 2;
                    Zg zg = new Zg();
                    char[] cArr2 = AEQbTJ;
                    int i5 = 555755035;
                    java.lang.Object obj2 = null;
                    if (cArr2 != null) {
                        int length = cArr2.length;
                        char[] cArr3 = new char[length];
                        int i6 = 0;
                        while (i6 < length) {
                            int i7 = $11 + 23;
                            $10 = i7 % 128;
                            int i8 = i7 % i3;
                            try {
                                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i6])};
                                java.lang.Object objEZpvd = YY.EZpvd(i5);
                                if (objEZpvd == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objEZpvd = YY.EZpvd(117, 4, (char) 13956, 620817255, false, $$e(b2, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE});
                                }
                                cArr3[i6] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                                i6++;
                                int i9 = $11 + 53;
                                $10 = i9 % 128;
                                int i10 = i9 % 2;
                                i3 = 2;
                                i5 = 555755035;
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        cArr2 = cArr3;
                    }
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(OLrzqt)};
                    java.lang.Object objEZpvd2 = YY.EZpvd(555755035);
                    if (objEZpvd2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objEZpvd2 = YY.EZpvd(117, 4, (char) 13956, 620817255, false, $$e(b4, b5, b5), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    char cCharValue = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).charValue();
                    char[] cArr4 = new char[i];
                    if (i % 2 != 0) {
                        i2 = i - 1;
                        cArr4[i2] = (char) (cArr[i2] - b);
                    } else {
                        i2 = i;
                    }
                    if (i2 > 1) {
                        zg.KWHzl = 0;
                        while (zg.KWHzl < i2) {
                            zg.AEQbTJ = cArr[zg.KWHzl];
                            zg.OLrzqt = cArr[zg.KWHzl + 1];
                            if (zg.AEQbTJ == zg.OLrzqt) {
                                cArr4[zg.KWHzl] = (char) (zg.AEQbTJ - b);
                                cArr4[zg.KWHzl + 1] = (char) (zg.OLrzqt - b);
                                int i11 = $11 + 23;
                                $10 = i11 % 128;
                                if (i11 % 2 != 0) {
                                    int i12 = 2 / 3;
                                }
                                obj = obj2;
                            } else {
                                java.lang.Object[] objArr4 = {zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg};
                                java.lang.Object objEZpvd3 = YY.EZpvd(-526958001);
                                if (objEZpvd3 == null) {
                                    byte b6 = (byte) 0;
                                    objEZpvd3 = YY.EZpvd(491, 5, (char) 30951, -457732301, false, $$e(b6, (byte) (b6 | 52), b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
                                }
                                if (((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).intValue() == zg.djBIcL) {
                                    int i13 = $10 + 39;
                                    $11 = i13 % 128;
                                    int i14 = i13 % 2;
                                    java.lang.Object[] objArr5 = {zg, zg, java.lang.Integer.valueOf(cCharValue), java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), java.lang.Integer.valueOf(cCharValue), zg, java.lang.Integer.valueOf(cCharValue), zg};
                                    java.lang.Object objEZpvd4 = YY.EZpvd(1348337226);
                                    if (objEZpvd4 == null) {
                                        byte b7 = (byte) 0;
                                        objEZpvd4 = YY.EZpvd(221, 5, (char) 3937, 1417491254, false, $$e(b7, (byte) (b7 | 55), b7), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).intValue();
                                    int i15 = (zg.EZpvd * cCharValue) + zg.djBIcL;
                                    cArr4[zg.KWHzl] = cArr2[iIntValue];
                                    cArr4[zg.KWHzl + 1] = cArr2[i15];
                                } else {
                                    obj = null;
                                    if (zg.copydefault == zg.EZpvd) {
                                        int i16 = $10 + 11;
                                        $11 = i16 % 128;
                                        int i17 = i16 % 2;
                                        zg.AYXKKw = ((zg.AYXKKw + cCharValue) - 1) % cCharValue;
                                        zg.djBIcL = ((zg.djBIcL + cCharValue) - 1) % cCharValue;
                                        int i18 = (zg.copydefault * cCharValue) + zg.AYXKKw;
                                        int i19 = (zg.EZpvd * cCharValue) + zg.djBIcL;
                                        cArr4[zg.KWHzl] = cArr2[i18];
                                        cArr4[zg.KWHzl + 1] = cArr2[i19];
                                        int i20 = $10 + 53;
                                        $11 = i20 % 128;
                                        int i21 = i20 % 2;
                                    } else {
                                        int i22 = (zg.copydefault * cCharValue) + zg.djBIcL;
                                        int i23 = (zg.EZpvd * cCharValue) + zg.AYXKKw;
                                        cArr4[zg.KWHzl] = cArr2[i22];
                                        cArr4[zg.KWHzl + 1] = cArr2[i23];
                                    }
                                }
                            }
                            zg.KWHzl += 2;
                            obj2 = obj;
                        }
                    }
                    for (int i24 = 0; i24 < i; i24++) {
                        cArr4[i24] = (char) (cArr4[i24] ^ 13722);
                    }
                    objArr[0] = new java.lang.String(cArr4);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
                public static void KWHzl(long j, long j2) throws java.lang.Throwable {
                    int i = 2 % 2;
                    long j3 = j ^ (j2 << 32);
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a(9, new char[]{'\f', '\t', 31, 27, '\"', 24, 18, '\t', 13823}, Ascii.VT, objArr);
                    java.lang.Object obj = C44103sDl.class.getField((java.lang.String) objArr[0]).get(null);
                    try {
                        java.lang.reflect.Constructor declaredConstructor = java.lang.StringBuilder.class.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a(30, new char[]{5, 17, ' ', 6, 21, 25, 19, 29, 7, '\t', 22, 6, '#', 28, 22, '#', 21, 26, 13855, 13855, 21, '\f', ' ', '\f', 20, '\b', 31, '#', 19, 2}, (byte) 42, objArr2);
                        java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        b(208, new char[]{5, 65531, 65528, 7, 7, 65532}, 2, 6, false, objArr4);
                        java.lang.reflect.Method method = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr4[0], java.lang.String.class);
                        method.setAccessible(true);
                        method.invoke(objNewInstance, objArr3);
                        java.lang.Object[] objArr5 = {java.lang.Long.valueOf(j3)};
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        b(208, new char[]{5, 65531, 65528, 7, 7, 65532}, 2, 6, false, objArr6);
                        java.lang.reflect.Method method2 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr6[0], java.lang.Long.TYPE);
                        method2.setAccessible(true);
                        method2.invoke(objNewInstance, objArr5);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        a(22, new char[]{5, 21, 19, 18, 30, 22, 18, '\t', 27, 4, 18, '!', '\f', '\b', 21, '\n', '\"', 24, '\"', 18, 20, 11}, (byte) 61, objArr7);
                        java.lang.String str = (java.lang.String) objArr7[0];
                        int i2 = gEmmrt + 19;
                        AhwBna = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i3 = 4 % 4;
                        }
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        b(210, new char[]{'\t', 65532, 3, 65534, 7, '\t', 65512, 4}, 1, 8, true, objArr8);
                        java.lang.reflect.Method method3 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr8[0], null);
                        method3.setAccessible(true);
                        java.lang.Object objInvoke = method3.invoke(objNewInstance, null);
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        b(BuildConfig.VERSION_CODE, new char[]{6, 0, 65530}, 2, 3, true, objArr9);
                        java.lang.Object[] objArr10 = {objInvoke, (java.lang.String) objArr9[0]};
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        b(MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, new char[]{5, 65533, 65535, 2, 65533, '\f', 65535, 14, 65535, 7, 65531, '\f', 65531, 65514, 6, 6, 15, 65512, 14, '\t', 65512}, 5, 21, true, objArr11);
                        java.lang.reflect.Method method4 = Intrinsics.class.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.String.class);
                        method4.setAccessible(true);
                        method4.invoke(null, objArr10);
                        if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            b(198, new char[]{'\n', 2, '\r', '\n', 27, 6, 65520, '\f', 65517, 16, '\b', 65473, '\n', 20, 65473, 15, 16, 21, 65473, '\n', 15, '\n', 21}, 6, 23, false, objArr12);
                            java.lang.String string = ((java.lang.String) objArr12[0]).toString();
                            int i4 = AhwBna + 61;
                            gEmmrt = i4 % 128;
                            if (i4 % 2 == 0) {
                                java.lang.Object[] objArr13 = {string};
                                java.lang.reflect.Constructor declaredConstructor2 = java.lang.IllegalStateException.class.getDeclaredConstructor(java.lang.String.class);
                                declaredConstructor2.setAccessible(true);
                                throw ((java.lang.Throwable) declaredConstructor2.newInstance(objArr13));
                            }
                            java.lang.Object[] objArr14 = {string};
                            java.lang.Class[] clsArr = new java.lang.Class[0];
                            clsArr[0] = java.lang.String.class;
                            java.lang.reflect.Constructor declaredConstructor3 = java.lang.IllegalStateException.class.getDeclaredConstructor(clsArr);
                            declaredConstructor3.setAccessible(true);
                            throw ((java.lang.Throwable) declaredConstructor3.newInstance(objArr14));
                        }
                        java.lang.Object obj2 = pUU.class.getField("copydefault").get(null);
                        java.lang.reflect.Method method5 = Intrinsics.class.getMethod("copydefault", java.lang.Object.class);
                        method5.setAccessible(true);
                        method5.invoke(null, obj2);
                        java.lang.reflect.Method method6 = pUP.class.getMethod("OLrzqt", java.lang.String.class, java.lang.String.class);
                        method6.setAccessible(true);
                        method6.invoke(obj2, str, objInvoke);
                        byte[] bArr = $$a;
                        byte b = bArr[6];
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        c((byte) (-b), bArr[13], b, objArr15);
                        java.lang.reflect.Method method7 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr15[0], null);
                        method7.setAccessible(true);
                        java.lang.Object objInvoke2 = method7.invoke(obj, null);
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        a(14, new char[]{23, 15, 5, 21, '!', 19, '#', 22, 24, '\t', '\f', 24, 18, 20}, (byte) 95, objArr16);
                        DetectionInfoBean.class.getField((java.lang.String) objArr16[0]).setBoolean(objInvoke2, true);
                        byte b2 = bArr[6];
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        c((byte) (-b2), bArr[13], b2, objArr17);
                        java.lang.reflect.Method method8 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr17[0], null);
                        method8.setAccessible(true);
                        java.lang.Object objInvoke3 = method8.invoke(obj, null);
                        java.lang.Long lValueOf = java.lang.Long.valueOf(j3);
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        b(204, new char[]{65508, '\t', 1, '\n', 65535, 0, 65533, 16, 2}, 4, 9, false, objArr18);
                        DetectionInfoBean.class.getField((java.lang.String) objArr18[0]).set(objInvoke3, lValueOf);
                        byte b3 = bArr[13];
                        byte b4 = (byte) (-bArr[6]);
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        c(b3, b4, (byte) (b4 | 8), objArr19);
                        java.lang.reflect.Method method9 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr19[0], null);
                        method9.setAccessible(true);
                        method9.invoke(obj, null);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }, 4, null);
        }
    }

    public static final Unit isConnected(MethodHelperActivity methodHelperActivity, DappInteractionArgs dappInteractionArgs, Bundle bundle) {
        methodHelperActivity.KWHzl(bundle, dappInteractionArgs.getChainId());
        methodHelperActivity.finish();
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        DappInteractionArgs dappInteractionArgs;
        if (Build.VERSION.SDK_INT >= 33) {
            dappInteractionArgs = (DappInteractionArgs) getIntent().getParcelableExtra("ARG_PARAM", DappInteractionArgs.class);
        } else {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("ARG_PARAM");
            dappInteractionArgs = parcelableExtra instanceof DappInteractionArgs ? (DappInteractionArgs) parcelableExtra : null;
        }
        final DappInteractionArgs dappInteractionArgs2 = dappInteractionArgs;
        if (dappInteractionArgs2 == null) {
            finish();
        } else {
            InterfaceC9854bdT.Application.startTransferDapp$default(gEmmrt(), this, dappInteractionArgs2, new Function1() { // from class: o.ebU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MethodHelperActivity.djBIcL(this.copydefault, dappInteractionArgs2, (android.os.Bundle) obj);
                }
            }, null, null, 16, null);
        }
    }

    public static final Unit djBIcL(MethodHelperActivity methodHelperActivity, DappInteractionArgs dappInteractionArgs, Bundle bundle) {
        methodHelperActivity.KWHzl(bundle, dappInteractionArgs.getChainId());
        methodHelperActivity.finish();
        return Unit.INSTANCE;
    }

    public final void ejfBZ() {
        DappInteractionArgs dappInteractionArgs;
        if (Build.VERSION.SDK_INT >= 33) {
            dappInteractionArgs = (DappInteractionArgs) getIntent().getParcelableExtra("ARG_PARAM", DappInteractionArgs.class);
        } else {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("ARG_PARAM");
            dappInteractionArgs = parcelableExtra instanceof DappInteractionArgs ? (DappInteractionArgs) parcelableExtra : null;
        }
        final DappInteractionArgs dappInteractionArgs2 = dappInteractionArgs;
        if (dappInteractionArgs2 == null) {
            finish();
        } else {
            InterfaceC9854bdT.Application.startTransferDapp$default(gEmmrt(), this, dappInteractionArgs2, new Function1() { // from class: o.ebL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MethodHelperActivity.fetchVPNInfo(this.copydefault, dappInteractionArgs2, (android.os.Bundle) obj);
                }
            }, new Function1() { // from class: o.ebO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MethodHelperActivity.gEmmrt((NewCallbackBean) obj);
                }
            }, null, 16, null);
        }
    }

    public static final Unit fetchVPNInfo(MethodHelperActivity methodHelperActivity, DappInteractionArgs dappInteractionArgs, Bundle bundle) {
        methodHelperActivity.KWHzl(bundle, dappInteractionArgs.getChainId());
        methodHelperActivity.finish();
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX gEmmrt(NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, "", null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public final void AhwBna() {
        DappSignArgs dappSignArgs;
        if (Build.VERSION.SDK_INT >= 33) {
            dappSignArgs = (DappSignArgs) getIntent().getParcelableExtra("ARG_PARAM", DappSignArgs.class);
        } else {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("ARG_PARAM");
            dappSignArgs = parcelableExtra instanceof DappSignArgs ? (DappSignArgs) parcelableExtra : null;
        }
        DappSignArgs dappSignArgs2 = dappSignArgs;
        if (dappSignArgs2 == null) {
            finish();
        } else {
            pUU.EZpvd(getTAG(), "handleBtcSignAndPushPsbt");
            InterfaceC9854bdT.Application.startSignDapp$default(gEmmrt(), this, dappSignArgs2, new Function1() { // from class: o.ebW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MethodHelperActivity.EZpvd(this.AEQbTJ, (android.os.Bundle) obj);
                }
            }, null, 8, null);
        }
    }

    public static final Unit EZpvd(MethodHelperActivity methodHelperActivity, Bundle bundle) {
        String string = bundle != null ? bundle.getString("data") : null;
        String string2 = "";
        if (string == null) {
            string = "";
        }
        String string3 = bundle != null ? bundle.getString("tx_hash") : null;
        if (string3 == null) {
            string3 = "";
        }
        if (C33129mqd.OLrzqt((CharSequence) string) && C33129mqd.OLrzqt((CharSequence) string3)) {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, "txHash", string3);
            JsonElementBuildersKt.put(jsonObjectBuilder, "signedPsbt", string);
            string2 = jsonObjectBuilder.build().toString();
        }
        InterfaceC16048eca interfaceC16048eca = OLrzqt;
        if (interfaceC16048eca != null) {
            interfaceC16048eca.OLrzqt(methodHelperActivity.AEQbTJ(), string2);
        }
        methodHelperActivity.finish();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        pUU.EZpvd(getTAG(), "onDestroy");
        if (isFinishing()) {
            KWHzl((Bundle) null, (String) null);
        } else {
            pUU.copydefault(getTAG(), "Activity is being destroyed abnormally");
        }
    }

    public final void KWHzl(Bundle bundle, String str) {
        String string = bundle != null ? bundle.getString("tx_sign") : null;
        if (string == null) {
            string = "";
        }
        if (Intrinsics.EZpvd((Object) str, (Object) "9004") && StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) "DEPLOY_ACCOUNT", false, 2, (Object) null)) {
            InterfaceC16048eca interfaceC16048eca = OLrzqt;
            if (interfaceC16048eca != null) {
                interfaceC16048eca.OLrzqt(AEQbTJ(), "IS_STARKNET_REGISTER");
                return;
            }
            return;
        }
        String string2 = bundle != null ? bundle.getString(this.KWHzl) : null;
        String str2 = string2 != null ? string2 : "";
        InterfaceC16048eca interfaceC16048eca2 = OLrzqt;
        if (interfaceC16048eca2 != null) {
            interfaceC16048eca2.OLrzqt(AEQbTJ(), str2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MethodType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ MethodType[] $VALUES;
        public static final MethodType SIGN_TRANSACTION = new MethodType("SIGN_TRANSACTION", 0);
        public static final MethodType SEND_TRANSACTION = new MethodType("SEND_TRANSACTION", 1);
        public static final MethodType ADD_ETHEREUM_CHAIN = new MethodType("ADD_ETHEREUM_CHAIN", 2);
        public static final MethodType WATCH_EVM_ASSET = new MethodType("WATCH_EVM_ASSET", 3);
        public static final MethodType BTC_SEND_TRANSACTION = new MethodType("BTC_SEND_TRANSACTION", 4);
        public static final MethodType BTC_SIGN_AND_PUSH_PSBT = new MethodType("BTC_SIGN_AND_PUSH_PSBT", 5);
        public static final MethodType COSMOS_SEND_TRANSACTION = new MethodType("COSMOS_SEND_TRANSACTION", 6);
        public static final MethodType TRON_SIGN_MESSAGE = new MethodType("TRON_SIGN_MESSAGE", 7);
        public static final MethodType TRON_APPROVE_DAPP = new MethodType("TRON_APPROVE_DAPP", 8);
        public static final MethodType TRON_SIGN_TRANSFER = new MethodType("TRON_SIGN_TRANSFER", 9);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ MethodType[] $values() {
            return new MethodType[]{SIGN_TRANSACTION, SEND_TRANSACTION, ADD_ETHEREUM_CHAIN, WATCH_EVM_ASSET, BTC_SEND_TRANSACTION, BTC_SIGN_AND_PUSH_PSBT, COSMOS_SEND_TRANSACTION, TRON_SIGN_MESSAGE, TRON_APPROVE_DAPP, TRON_SIGN_TRANSFER};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<MethodType> getEntries() {
            return $ENTRIES;
        }

        private MethodType(String str, int i) {
        }

        static {
            MethodType[] methodTypeArr$values = $values();
            $VALUES = methodTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(methodTypeArr$values);
        }

        public static MethodType valueOf(String str) {
            return (MethodType) Enum.valueOf(MethodType.class, str);
        }

        public static MethodType[] values() {
            return (MethodType[]) $VALUES.clone();
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
