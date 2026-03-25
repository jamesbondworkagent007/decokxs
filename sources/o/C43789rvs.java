package o;

import androidx.camera.video.AudioStats;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AbExperimentConfig;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ContainerPathNode;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ContentListInsertConfig;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ContentListReplaceConfig;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaReplaceConfig;
import com.okinc.ok_kyc_core.data.remote.networkmodel.EditCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FormAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InsertConfig;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InsertPosition;
import com.okinc.ok_kyc_core.data.remote.networkmodel.KycExperimentResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ProcessingAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ReplaceConfig;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ResultAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitleData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SelectWalletVerificationAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.repository.KYCExperimentRepositoryImpl$getKycExperiment$1;
import com.okinc.ok_kyc_core.data.repository.KYCExperimentRepositoryImpl$getKycExperiment$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCExperimentRepositoryImpl$getKycExperimentValue$1;
import com.okinc.ok_kyc_core.data.repository.KYCExperimentRepositoryImpl$getKycExperimentValues$1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KParameter;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.AbstractC43728ruk;
import o.C42459rTq;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.rvs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C43789rvs implements InterfaceC41967rBk {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final rAQ AEQbTJ;
    public final InterfaceC43704ruM AhwBna;
    public final Json EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final Json copydefault;

    /* JADX INFO: renamed from: o.rvs$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InsertPosition.values().length];
            try {
                iArr[InsertPosition.Top.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InsertPosition.Bottom.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    public C43789rvs(@NotNull rAQ raq, InterfaceC43704ruM interfaceC43704ruM) {
        Intrinsics.checkNotNullParameter(raq, "");
        this.AEQbTJ = raq;
        this.AhwBna = interfaceC43704ruM;
        this.EZpvd = JsonKt.Json$default(null, new Function1() { // from class: o.rvz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43789rvs.KWHzl((JsonBuilder) obj);
            }
        }, 1, null);
        this.copydefault = JsonKt.Json$default(null, new Function1() { // from class: o.rvx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43789rvs.AEQbTJ((JsonBuilder) obj);
            }
        }, 1, null);
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.rvA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43789rvs.copydefault(this.copydefault);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.rAQ)
  (wrap:o.ruM:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.ruM) : (r2v0 o.ruM))
 A[MD:(o.rAQ, o.ruM):void (m)] (LINE:33) call: o.rvs.<init>(o.rAQ, o.ruM):void type: THIS */
    public /* synthetic */ C43789rvs(rAQ raq, InterfaceC43704ruM interfaceC43704ruM, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(raq, (i & 2) != 0 ? null : interfaceC43704ruM);
    }

    /* JADX INFO: renamed from: o.rvs$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rvs.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final Unit KWHzl(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setExplicitNulls(false);
        jsonBuilder.setLenient(true);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setExplicitNulls(false);
        jsonBuilder.setLenient(true);
        return Unit.INSTANCE;
    }

    public final InterfaceC43704ruM copydefault() {
        return (InterfaceC43704ruM) this.OLrzqt.getValue();
    }

    public static final InterfaceC43704ruM copydefault(C43789rvs c43789rvs) {
        InterfaceC43704ruM interfaceC43704ruM = c43789rvs.AhwBna;
        return interfaceC43704ruM == null ? InterfaceC43704ruM.Companion.KWHzl() : interfaceC43704ruM;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41967rBk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        KYCExperimentRepositoryImpl$getKycExperimentValue$1 kYCExperimentRepositoryImpl$getKycExperimentValue$1;
        if (continuation instanceof KYCExperimentRepositoryImpl$getKycExperimentValue$1) {
            kYCExperimentRepositoryImpl$getKycExperimentValue$1 = (KYCExperimentRepositoryImpl$getKycExperimentValue$1) continuation;
            int i = kYCExperimentRepositoryImpl$getKycExperimentValue$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCExperimentRepositoryImpl$getKycExperimentValue$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCExperimentRepositoryImpl$getKycExperimentValue$1 = new KYCExperimentRepositoryImpl$getKycExperimentValue$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = kYCExperimentRepositoryImpl$getKycExperimentValue$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCExperimentRepositoryImpl$getKycExperimentValue$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                kYCExperimentRepositoryImpl$getKycExperimentValue$1.L$0 = str;
                kYCExperimentRepositoryImpl$getKycExperimentValue$1.L$1 = str2;
                kYCExperimentRepositoryImpl$getKycExperimentValue$1.label = 1;
                objEZpvd = EZpvd(str3, z, kYCExperimentRepositoryImpl$getKycExperimentValue$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (java.lang.String) kYCExperimentRepositoryImpl$getKycExperimentValue$1.L$1;
                str = (java.lang.String) kYCExperimentRepositoryImpl$getKycExperimentValue$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
            }
            AbstractC43728ruk abstractC43728ruk = (AbstractC43728ruk) objEZpvd;
            if (abstractC43728ruk instanceof AbstractC43728ruk.ActionBar) {
                java.lang.String str4 = ((KycExperimentResponse) ((AbstractC43728ruk.ActionBar) abstractC43728ruk).copydefault()).getVariants().get(str);
                if (str4 == null) {
                    str4 = str2;
                }
                pUU.KWHzl("KYCExperimentRepositoryImpl", "Experiment value for key '" + str + "': " + str4);
                return str4;
            }
            if (!(abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            pUU.valueOf("KYCExperimentRepositoryImpl", "Failed to get experiment data, using default value '" + str2 + "' for key '" + str + "'");
            return str2;
        } catch (java.lang.Exception e) {
            pUU.valueOf("KYCExperimentRepositoryImpl", "Exception occurred getting experiment value for key '" + str + "', using default value '" + str2 + "': " + e);
            return str2;
        }
    }

    /* JADX INFO: renamed from: o.rvs$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl((java.lang.Comparable) ((kotlin.Pair) ((IndexedValue) t).AEQbTJ()).getFirst(), (java.lang.Comparable) ((kotlin.Pair) ((IndexedValue) t2).AEQbTJ()).getFirst());
        }
    }

    /* JADX INFO: renamed from: o.rvs$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl((java.lang.Comparable) ((kotlin.Pair) ((IndexedValue) t).AEQbTJ()).getFirst(), (java.lang.Comparable) ((kotlin.Pair) ((IndexedValue) t2).AEQbTJ()).getFirst());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, boolean z, @NotNull Continuation<? super java.util.Map<java.lang.String, java.lang.String>> continuation) throws java.lang.Throwable {
        KYCExperimentRepositoryImpl$getKycExperimentValues$1 kYCExperimentRepositoryImpl$getKycExperimentValues$1;
        if (continuation instanceof KYCExperimentRepositoryImpl$getKycExperimentValues$1) {
            kYCExperimentRepositoryImpl$getKycExperimentValues$1 = (KYCExperimentRepositoryImpl$getKycExperimentValues$1) continuation;
            int i = kYCExperimentRepositoryImpl$getKycExperimentValues$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCExperimentRepositoryImpl$getKycExperimentValues$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCExperimentRepositoryImpl$getKycExperimentValues$1 = new KYCExperimentRepositoryImpl$getKycExperimentValues$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = kYCExperimentRepositoryImpl$getKycExperimentValues$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCExperimentRepositoryImpl$getKycExperimentValues$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                kYCExperimentRepositoryImpl$getKycExperimentValues$1.L$0 = map;
                kYCExperimentRepositoryImpl$getKycExperimentValues$1.label = 1;
                objEZpvd = EZpvd(str, z, kYCExperimentRepositoryImpl$getKycExperimentValues$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (java.util.Map) kYCExperimentRepositoryImpl$getKycExperimentValues$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
            }
            AbstractC43728ruk abstractC43728ruk = (AbstractC43728ruk) objEZpvd;
            if (abstractC43728ruk instanceof AbstractC43728ruk.ActionBar) {
                KycExperimentResponse kycExperimentResponse = (KycExperimentResponse) ((AbstractC43728ruk.ActionBar) abstractC43728ruk).copydefault();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                    java.lang.String key = entry.getKey();
                    java.lang.String value = entry.getValue();
                    java.lang.String str2 = kycExperimentResponse.getVariants().get(key);
                    if (str2 != null) {
                        value = str2;
                    }
                    linkedHashMap.put(key, value);
                    pUU.KWHzl("KYCExperimentRepositoryImpl", "Experiment value for key '" + key + "': " + value);
                }
                return linkedHashMap;
            }
            if (!(abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            pUU.valueOf("KYCExperimentRepositoryImpl", "Failed to get experiment data, using all default values");
            return C56424yEw.values(map);
        } catch (java.lang.Exception e) {
            pUU.valueOf("KYCExperimentRepositoryImpl", "Exception occurred getting experiment values, using all default values: " + e);
            return C56424yEw.values(map);
        }
    }

    /* JADX INFO: renamed from: o.rvs$Application */
    public static final class Application<T> implements java.util.Comparator {
        public final /* synthetic */ java.util.Comparator copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(java.util.Comparator comparator) {
            this.copydefault = comparator;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.copydefault.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            return yET.KWHzl(java.lang.Integer.valueOf(((IndexedValue) t).OLrzqt()), java.lang.Integer.valueOf(((IndexedValue) t2).OLrzqt()));
        }
    }

    /* JADX INFO: renamed from: o.rvs$PendingIntent */
    public static final class PendingIntent<T> implements java.util.Comparator {
        public final /* synthetic */ java.util.Comparator copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(java.util.Comparator comparator) {
            this.copydefault = comparator;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.copydefault.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            return yET.KWHzl(java.lang.Integer.valueOf(((IndexedValue) t).OLrzqt()), java.lang.Integer.valueOf(((IndexedValue) t2).OLrzqt()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(java.lang.String str, boolean z, @NotNull Continuation<? super AbstractC43728ruk<KycExperimentResponse, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCExperimentRepositoryImpl$getKycExperiment$1 kYCExperimentRepositoryImpl$getKycExperiment$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCExperimentRepositoryImpl$getKycExperiment$1) {
            kYCExperimentRepositoryImpl$getKycExperiment$1 = (KYCExperimentRepositoryImpl$getKycExperiment$1) continuation;
            int i = kYCExperimentRepositoryImpl$getKycExperiment$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCExperimentRepositoryImpl$getKycExperiment$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCExperimentRepositoryImpl$getKycExperiment$1 = new KYCExperimentRepositoryImpl$getKycExperiment$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCExperimentRepositoryImpl$getKycExperiment$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCExperimentRepositoryImpl$getKycExperiment$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.AEQbTJ.AEQbTJ();
                KYCExperimentRepositoryImpl$getKycExperiment$2$1 kYCExperimentRepositoryImpl$getKycExperiment$2$1 = new KYCExperimentRepositoryImpl$getKycExperiment$2$1(z, this, str, null);
                kYCExperimentRepositoryImpl$getKycExperiment$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCExperimentRepositoryImpl$getKycExperiment$2$1, kYCExperimentRepositoryImpl$getKycExperiment$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            if (th instanceof OKServerException) {
                pUU.KWHzl("FileUpload", "response = OKServerException");
                int code = th.getCode();
                java.lang.String message = th.getMessage();
                java.lang.String str2 = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str2, message2 == null ? "" : message2, null, 8, null));
            } else {
                pUU.KWHzl("FileUpload", "response = else");
                java.lang.String strValueOf = java.lang.String.valueOf(th.getCause());
                java.lang.String message3 = th.getMessage();
                taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(0, message3 == null ? "" : message3, strValueOf, null, 9, null));
            }
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43728ruk.ActionBar(data);
        }
        pUU.KWHzl("qjf", "response = " + responseData);
        taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), null, 8, null));
        return taskDescription;
    }

    public final void copydefault(KycExperimentResponse kycExperimentResponse, java.lang.String str) {
        SPUtils.remove("sp_experiment_time");
        SPUtils.remove("sp_experiment_data");
        SPUtils.remove("sp_experiment_cor");
        SPUtils.put("sp_experiment_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "kyc_experiment");
        SPUtils.put("sp_experiment_data", kycExperimentResponse, "kyc_experiment");
        if (str == null) {
            str = "";
        }
        SPUtils.put("sp_experiment_cor", str, "kyc_experiment");
    }

    public static /* synthetic */ boolean isExperimentCacheValid$default(C43789rvs c43789rvs, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c43789rvs.copydefault(str);
    }

    public final boolean copydefault(java.lang.String str) {
        java.lang.Long l = SPUtils.getLong("sp_experiment_time", 0L, "kyc_experiment");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        Intrinsics.copydefault(l);
        long jLongValue = l.longValue();
        KycExperimentResponse kycExperimentResponse = (KycExperimentResponse) SPUtils.getObject("sp_experiment_data", KycExperimentResponse.class, "kyc_experiment");
        java.lang.String string = SPUtils.getString("sp_experiment_cor", "", "kyc_experiment");
        boolean z = jCurrentTimeMillis - jLongValue <= 300000;
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) (string == null ? "" : string), (java.lang.Object) (str != null ? str : ""));
        boolean z2 = kycExperimentResponse != null;
        pUU.EZpvd("KYCExperimentRepositoryImpl", "Cache validation - timeValid: " + z + ", corValid: " + zEZpvd + ", hasData: " + z2 + ", cachedCor: '" + string + "', currentCor: '" + str + "'");
        return z && zEZpvd && z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    @Override // o.InterfaceC41967rBk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PageComponentAppModel AEQbTJ(PageComponentAppModel pageComponentAppModel, JsonElement jsonElement, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String contentOrNull;
        JsonElement jsonElement2;
        JsonPrimitive jsonPrimitive;
        java.util.Set<java.lang.String> setCopydefault;
        java.lang.Object objM7377constructorimpl;
        PageComponentAppModel pageComponentAppModelEZpvd;
        if (pageComponentAppModel == null || (contentOrNull = pageComponentAppModel.getId()) == null) {
            JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
            contentOrNull = (jsonObject == null || (jsonElement2 = (JsonElement) jsonObject.get((java.lang.Object) "id")) == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive);
        } else {
            if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) contentOrNull))) {
                contentOrNull = null;
            }
            if (contentOrNull == null) {
            }
        }
        if (contentOrNull != null) {
            java.lang.String str4 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) contentOrNull) ^ true ? contentOrNull : null;
            if (str4 != null) {
                java.lang.String strCopydefault = copydefault(pageComponentAppModel, jsonElement);
                if (strCopydefault == null) {
                    C43693ruB.copydefault("KYC_Rapidfire_ExperimentFallback_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("page_id", str4), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_NAME, "page_type_invalid"), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_DETAIL, EopTrackEvent.KEY_PAGE_TYPE)));
                    return pageComponentAppModel;
                }
                if (AEQbTJ(str, str3)) {
                    pUU.valueOf("KYCExperimentRepositoryImpl", "experiment country mismatch for pageId=" + str4 + " pageType=" + strCopydefault + " cor=" + str + " beCor=" + str3);
                    C43693ruB.copydefault("KYC_Rapidfire_ExperimentFallback_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("page_id", str4), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_NAME, "cor_mismatch"), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_DETAIL, "country_check")));
                    return pageComponentAppModel;
                }
                C42459rTq.Activity activityEZpvd = C42459rTq.KWHzl.EZpvd(str4, strCopydefault, str, str2);
                if (activityEZpvd == null) {
                    C43693ruB.copydefault("KYC_Rapidfire_ExperimentFallback_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("page_id", str4), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_NAME, "gate_missing"), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_DETAIL, "gate")));
                    return pageComponentAppModel;
                }
                if (!copydefault(activityEZpvd, jsonElement)) {
                    return pageComponentAppModel;
                }
                java.util.List<java.lang.String> listDjBIcL = activityEZpvd.djBIcL();
                if (listDjBIcL != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator<T> it = listDjBIcL.iterator();
                    while (it.hasNext()) {
                        java.lang.String lowerCase = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) it.next()).toString().toLowerCase(java.util.Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        if (lowerCase.length() <= 0) {
                            lowerCase = null;
                        }
                        if (lowerCase != null) {
                            arrayList.add(lowerCase);
                        }
                    }
                    setCopydefault = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
                    if (setCopydefault == null) {
                        setCopydefault = yEE.copydefault();
                    }
                }
                java.util.Set<java.lang.String> set = setCopydefault;
                AbExperimentConfig abExperimentConfigAEQbTJ = AEQbTJ(str4, strCopydefault, str, str2);
                if (abExperimentConfigAEQbTJ == null) {
                    C43693ruB.copydefault("KYC_Rapidfire_ExperimentFallback_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("page_id", str4), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_NAME, "parsing_failed"), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_DETAIL, "experiment_config")));
                    return pageComponentAppModel;
                }
                java.lang.String strAEQbTJ = C42459rTq.KWHzl.AEQbTJ(str, str2, strCopydefault, str4);
                try {
                    Result.Application application = Result.Companion;
                    if (pageComponentAppModel instanceof FormAppModel) {
                        pageComponentAppModelEZpvd = OLrzqt((FormAppModel) pageComponentAppModel, abExperimentConfigAEQbTJ, str4, strAEQbTJ, set);
                    } else if (pageComponentAppModel instanceof ResultAppModel) {
                        pageComponentAppModelEZpvd = OLrzqt((ResultAppModel) pageComponentAppModel, abExperimentConfigAEQbTJ, str4, strAEQbTJ, set);
                    } else if (pageComponentAppModel instanceof ProcessingAppModel) {
                        pageComponentAppModelEZpvd = copydefault((ProcessingAppModel) pageComponentAppModel, abExperimentConfigAEQbTJ, str4, strAEQbTJ, set);
                    } else if (pageComponentAppModel instanceof PopUpAppModel) {
                        pageComponentAppModelEZpvd = OLrzqt((PopUpAppModel) pageComponentAppModel, abExperimentConfigAEQbTJ, str4, strAEQbTJ, set);
                    } else {
                        pageComponentAppModelEZpvd = pageComponentAppModel instanceof SelectWalletVerificationAppModel ? EZpvd((SelectWalletVerificationAppModel) pageComponentAppModel, abExperimentConfigAEQbTJ) : pageComponentAppModel;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(pageComponentAppModelEZpvd);
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.copydefault("KYCExperimentRepositoryImpl", "experiment[" + strAEQbTJ + "] inject failed for pageId=" + str4 + ": " + thM7380exceptionOrNullimpl.getMessage());
                    C43693ruB.copydefault("KYC_Rapidfire_ExperimentFallback_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("page_id", str4), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_NAME, "inject_failed"), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_DETAIL, "experiment_apply")));
                    objM7377constructorimpl = pageComponentAppModel;
                }
                return (PageComponentAppModel) objM7377constructorimpl;
            }
        }
        C43693ruB.copydefault("KYC_Rapidfire_ExperimentFallback_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("page_id", "unknown_page_id"), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_NAME, "page_id_invalid"), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_DETAIL, "page_id")));
        return pageComponentAppModel;
    }

    public final boolean AEQbTJ(java.lang.String str, java.lang.String str2) {
        java.lang.String lowerCase;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String lowerCase2 = null;
        if (str == null || (string2 = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string2.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        }
        if (str2 != null && (string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str2).toString()) != null) {
            lowerCase2 = string.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        }
        if (lowerCase == null || lowerCase.length() == 0 || lowerCase2 == null || lowerCase2.length() == 0) {
            return false;
        }
        return !Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) lowerCase2);
    }

    public final boolean copydefault(C42459rTq.Activity activity, JsonElement jsonElement) {
        java.lang.Object objM7377constructorimpl;
        java.lang.String strCopydefault = activity.copydefault();
        if (strCopydefault == null) {
            return true;
        }
        java.lang.String strEZpvd = activity.EZpvd();
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd))) {
            strEZpvd = null;
        }
        if (strEZpvd == null) {
            strEZpvd = "unknown_page_id";
        }
        java.lang.String strCopydefault2 = C42459rTq.KWHzl.copydefault(strCopydefault);
        if (strCopydefault2 == null) {
            C43693ruB.copydefault("KYC_Rapidfire_BaseCheckError_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("page_id", strEZpvd), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_NAME, "parsing_failed"), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_DETAIL, "base_payload")));
            return false;
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(this.copydefault.parseToJsonElement(strCopydefault2));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        JsonElement jsonElement2 = (JsonElement) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        if (jsonElement2 == null) {
            C43693ruB.copydefault("KYC_Rapidfire_BaseCheckError_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("page_id", strEZpvd), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_NAME, "parsing_failed"), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_DETAIL, "base_json")));
            return false;
        }
        JsonElement jsonElementAEQbTJ = AEQbTJ(jsonElement2);
        if (jsonElementAEQbTJ == null) {
            C43693ruB.copydefault("KYC_Rapidfire_BaseCheckError_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("page_id", strEZpvd), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_NAME, "parsing_failed"), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_DETAIL, "base_viewmodel")));
            return false;
        }
        JsonElement jsonElementAEQbTJ2 = AEQbTJ(jsonElement);
        if (jsonElementAEQbTJ2 != null) {
            jsonElement = jsonElementAEQbTJ2;
        } else if (jsonElement == null) {
            C43693ruB.copydefault("KYC_Rapidfire_BaseCheckError_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("page_id", strEZpvd), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_NAME, "parsing_failed"), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_DETAIL, "current_viewmodel")));
            return false;
        }
        double dEZpvd = EZpvd(jsonElementAEQbTJ, jsonElement);
        if (dEZpvd >= 1.0d) {
            return true;
        }
        pUU.valueOf("KYCExperimentRepositoryImpl", "experiment basePlaybook mismatch for pageId=" + activity.EZpvd() + ", ratio=" + dEZpvd);
        C43693ruB.copydefault("KYC_Rapidfire_BaseCheckError_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("page_id", strEZpvd), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_NAME, "base_check_failed"), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_DETAIL, "schema_mismatch")));
        return false;
    }

    public final JsonElement AEQbTJ(JsonElement jsonElement) {
        JsonElement jsonElement2;
        if (!(jsonElement instanceof JsonObject)) {
            return jsonElement;
        }
        JsonObject jsonObject = (JsonObject) jsonElement;
        JsonElement jsonElement3 = (JsonElement) jsonObject.get((java.lang.Object) "data");
        if ((jsonElement3 instanceof JsonObject) && (jsonElement2 = (JsonElement) ((JsonObject) jsonElement3).get((java.lang.Object) "viewModel")) != null) {
            return jsonElement2;
        }
        JsonElement jsonElement4 = (JsonElement) jsonObject.get((java.lang.Object) "viewModel");
        return jsonElement4 == null ? jsonElement : jsonElement4;
    }

    public final FormAppModel OLrzqt(FormAppModel formAppModel, AbExperimentConfig abExperimentConfig, java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set) {
        FormAppModel formAppModelCopy;
        RichSubtitleData richSubtitle = abExperimentConfig.getRichSubtitle();
        RichSubtitle richSubtitleEZpvd = richSubtitle != null ? C43780rvj.EZpvd(richSubtitle) : null;
        if (abExperimentConfig.getTitle() == null && abExperimentConfig.getSubtitle() == null && abExperimentConfig.getPageTitle() == null && abExperimentConfig.getRichTitle() == null && richSubtitleEZpvd == null) {
            formAppModelCopy = formAppModel;
        } else {
            java.lang.String title = abExperimentConfig.getTitle();
            if (title == null) {
                title = formAppModel.getTitle();
            }
            java.lang.String str3 = title;
            java.lang.String subtitle = abExperimentConfig.getSubtitle();
            if (subtitle == null) {
                subtitle = formAppModel.getSubtitle();
            }
            java.lang.String str4 = subtitle;
            java.lang.String pageTitle = abExperimentConfig.getPageTitle();
            if (pageTitle == null) {
                pageTitle = formAppModel.getPageTitle();
            }
            java.lang.String str5 = pageTitle;
            RichTitle richTitle = abExperimentConfig.getRichTitle();
            if (richTitle == null) {
                richTitle = formAppModel.getRichTitle();
            }
            RichTitle richTitle2 = richTitle;
            if (richSubtitleEZpvd == null) {
                richSubtitleEZpvd = formAppModel.getRichSubtitle();
            }
            formAppModelCopy = formAppModel.copy((536870908 & 1) != 0 ? formAppModel.items : null, (536870908 & 2) != 0 ? formAppModel.cta : null, (536870908 & 4) != 0 ? formAppModel.stepper : null, (536870908 & 8) != 0 ? formAppModel.titleWithSteps : null, (536870908 & 16) != 0 ? formAppModel.pageTitle : str5, (536870908 & 32) != 0 ? formAppModel.quit : null, (536870908 & 64) != 0 ? formAppModel.onExit : null, (536870908 & 128) != 0 ? formAppModel.align : null, (536870908 & 256) != 0 ? formAppModel.canGoBack : null, (536870908 & 512) != 0 ? formAppModel.canClose : null, (536870908 & 1024) != 0 ? formAppModel.skipCta : null, (536870908 & 2048) != 0 ? formAppModel.faqUrl : null, (536870908 & 4096) != 0 ? formAppModel.richTitle : richTitle2, (536870908 & 8192) != 0 ? formAppModel.richSubtitle : richSubtitleEZpvd, (536870908 & 16384) != 0 ? formAppModel.notifications : null, (536870908 & 32768) != 0 ? formAppModel.id : null, (536870908 & 65536) != 0 ? formAppModel.required : null, (536870908 & 131072) != 0 ? formAppModel.version : null, (536870908 & 262144) != 0 ? formAppModel.value : null, (536870908 & 524288) != 0 ? formAppModel.title : str3, (536870908 & 1048576) != 0 ? formAppModel.subtitle : str4, (536870908 & 2097152) != 0 ? formAppModel.pageStack : null, (536870908 & 4194304) != 0 ? formAppModel.dynamicTitle : null, (536870908 & 8388608) != 0 ? formAppModel.deleteButton : null, (536870908 & 16777216) != 0 ? formAppModel.amplitudeParams : null, (536870908 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? formAppModel.rightButton : null, (536870908 & 67108864) != 0 ? formAppModel.alertCard : null, (536870908 & 134217728) != 0 ? formAppModel.isFormRefresh : null, (536870908 & 268435456) != 0 ? formAppModel.pageStackType : null);
        }
        kotlin.Pair<java.util.List<UIComponentAppModel>, CtaAppModel> pairEZpvd = EZpvd(formAppModelCopy.getItems(), formAppModelCopy.getCta(), abExperimentConfig, str, str2, set);
        return formAppModelCopy.copy((536870908 & 1) != 0 ? formAppModelCopy.items : pairEZpvd.component1(), (536870908 & 2) != 0 ? formAppModelCopy.cta : pairEZpvd.component2(), (536870908 & 4) != 0 ? formAppModelCopy.stepper : null, (536870908 & 8) != 0 ? formAppModelCopy.titleWithSteps : null, (536870908 & 16) != 0 ? formAppModelCopy.pageTitle : null, (536870908 & 32) != 0 ? formAppModelCopy.quit : null, (536870908 & 64) != 0 ? formAppModelCopy.onExit : null, (536870908 & 128) != 0 ? formAppModelCopy.align : null, (536870908 & 256) != 0 ? formAppModelCopy.canGoBack : null, (536870908 & 512) != 0 ? formAppModelCopy.canClose : null, (536870908 & 1024) != 0 ? formAppModelCopy.skipCta : null, (536870908 & 2048) != 0 ? formAppModelCopy.faqUrl : null, (536870908 & 4096) != 0 ? formAppModelCopy.richTitle : null, (536870908 & 8192) != 0 ? formAppModelCopy.richSubtitle : null, (536870908 & 16384) != 0 ? formAppModelCopy.notifications : null, (536870908 & 32768) != 0 ? formAppModelCopy.id : null, (536870908 & 65536) != 0 ? formAppModelCopy.required : null, (536870908 & 131072) != 0 ? formAppModelCopy.version : null, (536870908 & 262144) != 0 ? formAppModelCopy.value : null, (536870908 & 524288) != 0 ? formAppModelCopy.title : null, (536870908 & 1048576) != 0 ? formAppModelCopy.subtitle : null, (536870908 & 2097152) != 0 ? formAppModelCopy.pageStack : null, (536870908 & 4194304) != 0 ? formAppModelCopy.dynamicTitle : null, (536870908 & 8388608) != 0 ? formAppModelCopy.deleteButton : null, (536870908 & 16777216) != 0 ? formAppModelCopy.amplitudeParams : null, (536870908 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? formAppModelCopy.rightButton : null, (536870908 & 67108864) != 0 ? formAppModelCopy.alertCard : null, (536870908 & 134217728) != 0 ? formAppModelCopy.isFormRefresh : null, (536870908 & 268435456) != 0 ? formAppModelCopy.pageStackType : null);
    }

    public final ResultAppModel OLrzqt(ResultAppModel resultAppModel, AbExperimentConfig abExperimentConfig, java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set) {
        kotlin.Pair<java.util.List<UIComponentAppModel>, CtaAppModel> pairEZpvd = EZpvd(resultAppModel.getItems(), resultAppModel.getCta(), abExperimentConfig, str, str2, set);
        java.util.List<UIComponentAppModel> listComponent1 = pairEZpvd.component1();
        CtaAppModel ctaAppModelComponent2 = pairEZpvd.component2();
        java.lang.String title = abExperimentConfig.getTitle();
        if (title == null) {
            title = resultAppModel.getTitle();
        }
        java.lang.String str3 = title;
        java.lang.String subtitle = abExperimentConfig.getSubtitle();
        if (subtitle == null) {
            subtitle = resultAppModel.getSubtitle();
        }
        return resultAppModel.copy((851964 & 1) != 0 ? resultAppModel.items : listComponent1, (851964 & 2) != 0 ? resultAppModel.cta : ctaAppModelComponent2, (851964 & 4) != 0 ? resultAppModel.icon : null, (851964 & 8) != 0 ? resultAppModel.status : null, (851964 & 16) != 0 ? resultAppModel.quit : null, (851964 & 32) != 0 ? resultAppModel.onExit : null, (851964 & 64) != 0 ? resultAppModel.isHidePro : null, (851964 & 128) != 0 ? resultAppModel.risk : null, (851964 & 256) != 0 ? resultAppModel.faqUrl : null, (851964 & 512) != 0 ? resultAppModel.canGoBack : null, (851964 & 1024) != 0 ? resultAppModel.canClose : null, (851964 & 2048) != 0 ? resultAppModel.isFlowSuccess : null, (851964 & 4096) != 0 ? resultAppModel.id : null, (851964 & 8192) != 0 ? resultAppModel.required : null, (851964 & 16384) != 0 ? resultAppModel.version : null, (851964 & 32768) != 0 ? resultAppModel.value : null, (851964 & 65536) != 0 ? resultAppModel.title : str3, (851964 & 131072) != 0 ? resultAppModel.subtitle : subtitle, (851964 & 262144) != 0 ? resultAppModel.pageStack : null, (851964 & 524288) != 0 ? resultAppModel.amplitudeParams : null);
    }

    public final ProcessingAppModel copydefault(ProcessingAppModel processingAppModel, AbExperimentConfig abExperimentConfig, java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set) {
        kotlin.Pair<java.util.List<UIComponentAppModel>, CtaAppModel> pairEZpvd = EZpvd(processingAppModel.getItems(), processingAppModel.getCta(), abExperimentConfig, str, str2, set);
        java.util.List<UIComponentAppModel> listComponent1 = pairEZpvd.component1();
        CtaAppModel ctaAppModelComponent2 = pairEZpvd.component2();
        java.lang.String title = abExperimentConfig.getTitle();
        if (title == null) {
            title = processingAppModel.getTitle();
        }
        java.lang.String str3 = title;
        java.lang.String subtitle = abExperimentConfig.getSubtitle();
        if (subtitle == null) {
            subtitle = processingAppModel.getSubtitle();
        }
        java.lang.String str4 = subtitle;
        java.lang.String pageTitle = abExperimentConfig.getPageTitle();
        if (pageTitle == null) {
            pageTitle = processingAppModel.getPageTitle();
        }
        return processingAppModel.copy((237500 & 1) != 0 ? processingAppModel.items : listComponent1, (237500 & 2) != 0 ? processingAppModel.cta : ctaAppModelComponent2, (237500 & 4) != 0 ? processingAppModel.quit : null, (237500 & 8) != 0 ? processingAppModel.onExit : null, (237500 & 16) != 0 ? processingAppModel.polling : null, (237500 & 32) != 0 ? processingAppModel.onboarding : null, (237500 & 64) != 0 ? processingAppModel.pageTitle : pageTitle, (237500 & 128) != 0 ? processingAppModel.processTimeOut : null, (237500 & 256) != 0 ? processingAppModel.canClose : null, (237500 & 512) != 0 ? processingAppModel.id : null, (237500 & 1024) != 0 ? processingAppModel.required : null, (237500 & 2048) != 0 ? processingAppModel.version : null, (237500 & 4096) != 0 ? processingAppModel.value : null, (237500 & 8192) != 0 ? processingAppModel.title : str3, (237500 & 16384) != 0 ? processingAppModel.subtitle : str4, (237500 & 32768) != 0 ? processingAppModel.pageStack : null, (237500 & 65536) != 0 ? processingAppModel.amplitudeParams : null, (237500 & 131072) != 0 ? processingAppModel.isLocalPolling : null);
    }

    public final SelectWalletVerificationAppModel EZpvd(SelectWalletVerificationAppModel selectWalletVerificationAppModel, AbExperimentConfig abExperimentConfig) {
        java.lang.String title = abExperimentConfig.getTitle();
        if (title == null) {
            title = selectWalletVerificationAppModel.getTitle();
        }
        java.lang.String str = title;
        java.lang.String subtitle = abExperimentConfig.getSubtitle();
        if (subtitle == null) {
            subtitle = selectWalletVerificationAppModel.getSubtitle();
        }
        java.lang.String str2 = subtitle;
        java.lang.String pageTitle = abExperimentConfig.getPageTitle();
        if (pageTitle == null) {
            pageTitle = selectWalletVerificationAppModel.getPageTitle();
        }
        return selectWalletVerificationAppModel.copy((5111 & 1) != 0 ? selectWalletVerificationAppModel.defaultMethod : null, (5111 & 2) != 0 ? selectWalletVerificationAppModel.canClose : null, (5111 & 4) != 0 ? selectWalletVerificationAppModel.canGoBack : null, (5111 & 8) != 0 ? selectWalletVerificationAppModel.pageTitle : pageTitle, (5111 & 16) != 0 ? selectWalletVerificationAppModel.cardChoice : null, (5111 & 32) != 0 ? selectWalletVerificationAppModel.quit : null, (5111 & 64) != 0 ? selectWalletVerificationAppModel.id : null, (5111 & 128) != 0 ? selectWalletVerificationAppModel.required : null, (5111 & 256) != 0 ? selectWalletVerificationAppModel.version : null, (5111 & 512) != 0 ? selectWalletVerificationAppModel.value : null, (5111 & 1024) != 0 ? selectWalletVerificationAppModel.title : str, (5111 & 2048) != 0 ? selectWalletVerificationAppModel.subtitle : str2, (5111 & 4096) != 0 ? selectWalletVerificationAppModel.pageStack : null);
    }

    public final PopUpAppModel OLrzqt(PopUpAppModel popUpAppModel, AbExperimentConfig abExperimentConfig, java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set) {
        java.util.List<PopUpComponentAppModel> items = popUpAppModel.getItems();
        java.util.List<ReplaceConfig> itemsReplace = abExperimentConfig.getItemsReplace();
        if (itemsReplace != null) {
            for (ReplaceConfig replaceConfig : itemsReplace) {
                if (OLrzqt(replaceConfig.getTargetType(), set)) {
                    pUU.valueOf("KYCExperimentRepositoryImpl", "experiment[" + str2 + "] popup itemsReplace skipped by type for pageId=" + str + ", type=" + replaceConfig.getTargetType() + ", index=" + replaceConfig.getTargetIndex());
                } else {
                    PopUpComponentAppModel popUpComponentAppModelEZpvd = EZpvd(replaceConfig.getItem());
                    if (popUpComponentAppModelEZpvd == null) {
                        pUU.valueOf("KYCExperimentRepositoryImpl", "experiment[" + str2 + "] popup itemsReplace empty for pageId=" + str + ", type=" + replaceConfig.getTargetType() + ", index=" + replaceConfig.getTargetIndex());
                    } else {
                        java.util.List<PopUpComponentAppModel> listKWHzl = KWHzl(items, replaceConfig.getTargetType(), replaceConfig.getTargetIndex(), popUpComponentAppModelEZpvd);
                        if (listKWHzl == null) {
                            pUU.valueOf("KYCExperimentRepositoryImpl", "experiment[" + str2 + "] popup itemsReplace target not found for pageId=" + str + ", type=" + replaceConfig.getTargetType() + ", absoluteIndex=" + replaceConfig.getTargetIndex());
                        } else {
                            items = listKWHzl;
                        }
                    }
                }
            }
        }
        java.util.List<PopUpComponentAppModel> listEZpvd = EZpvd(items, abExperimentConfig.getItemsInsert(), str, str2, "popup itemsInsert");
        java.lang.String title = abExperimentConfig.getTitle();
        if (title == null) {
            title = popUpAppModel.getTitle();
        }
        java.lang.String str3 = title;
        java.lang.String subtitle = abExperimentConfig.getSubtitle();
        if (subtitle == null) {
            subtitle = popUpAppModel.getSubtitle();
        }
        return popUpAppModel.copy((CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 & 1) != 0 ? popUpAppModel.items : listEZpvd, (CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 & 2) != 0 ? popUpAppModel.id : null, (CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 & 4) != 0 ? popUpAppModel.required : null, (CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 & 8) != 0 ? popUpAppModel.version : null, (CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 & 16) != 0 ? popUpAppModel.value : null, (CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 & 32) != 0 ? popUpAppModel.title : str3, (CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 & 64) != 0 ? popUpAppModel.subtitle : subtitle, (CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 & 128) != 0 ? popUpAppModel.pageStack : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0563  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.util.List<UIComponentAppModel>, CtaAppModel> EZpvd(java.util.List<? extends UIComponentAppModel> list, CtaAppModel ctaAppModel, AbExperimentConfig abExperimentConfig, java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set) {
        java.util.List<ReplaceConfig> list2;
        java.util.ArrayList arrayList;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.util.List<UIComponentAppModel> list3;
        CtaAppModel ctaAppModel2;
        java.util.List<UIComponentAppModel> list4;
        java.lang.String str6;
        java.lang.Object next;
        java.lang.String str7;
        java.lang.String str8;
        java.util.Iterator it;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.util.List<UIComponentAppModel> list5;
        java.lang.String str12;
        java.util.List<ContainerPathNode> targetContainerPath;
        java.util.List<ContainerPathNode> targetContainerPath2;
        java.util.Set<java.lang.String> set2 = set;
        java.util.List<ReplaceConfig> itemsReplace = abExperimentConfig.getItemsReplace();
        if (itemsReplace != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : itemsReplace) {
                ReplaceConfig replaceConfig = (ReplaceConfig) obj;
                if (replaceConfig.getTargetContainerType() == null && replaceConfig.getTargetContainerIndex() == null && ((targetContainerPath2 = replaceConfig.getTargetContainerPath()) == null || targetContainerPath2.isEmpty())) {
                    arrayList2.add(obj);
                }
            }
            list2 = arrayList2;
        } else {
            list2 = null;
        }
        java.util.List<UIComponentAppModel> listAEQbTJ = AEQbTJ(OLrzqt(list, list2, str, str2, set, "itemsReplace"), abExperimentConfig.getItemsReplace(), str, str2, set);
        java.util.List<InsertConfig> itemsInsert = abExperimentConfig.getItemsInsert();
        if (itemsInsert != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : itemsInsert) {
                InsertConfig insertConfig = (InsertConfig) obj2;
                if (insertConfig.getTargetContainerType() == null && insertConfig.getTargetContainerIndex() == null && ((targetContainerPath = insertConfig.getTargetContainerPath()) == null || targetContainerPath.isEmpty())) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        java.util.List<UIComponentAppModel> listKWHzl = KWHzl(applyInsertBatch$default(this, listAEQbTJ, arrayList, str, str2, "itemsInsert", null, true, 32, null), abExperimentConfig.getItemsInsert(), str, str2);
        java.util.List<ContentListReplaceConfig> contentListReplace = abExperimentConfig.getContentListReplace();
        java.lang.String str13 = "KYCExperimentRepositoryImpl";
        java.lang.String str14 = ", type=";
        java.lang.String str15 = ", targetContainerType=";
        java.lang.String str16 = ", targetContainerIndex=";
        java.lang.String str17 = "experiment[";
        if (contentListReplace != null) {
            java.util.List<UIComponentAppModel> listKWHzl2 = listKWHzl;
            for (ContentListReplaceConfig contentListReplaceConfig : contentListReplace) {
                if (OLrzqt(contentListReplaceConfig.getTargetType(), set2)) {
                    pUU.valueOf("KYCExperimentRepositoryImpl", str17 + str2 + "] contentListReplace skipped by type for pageId=" + str + ", targetContainerType=" + contentListReplaceConfig.getTargetContainerType() + ", targetContainerIndex=" + contentListReplaceConfig.getTargetContainerIndex() + ", type=" + contentListReplaceConfig.getTargetType() + ", index=" + contentListReplaceConfig.getTargetIndex());
                } else {
                    UIComponentAppModel uIComponentAppModelCopydefault = copydefault(listKWHzl2, contentListReplaceConfig.getTargetContainerType(), contentListReplaceConfig.getTargetContainerIndex(), contentListReplaceConfig.getTargetContainerPath());
                    if (uIComponentAppModelCopydefault == null) {
                        pUU.valueOf("KYCExperimentRepositoryImpl", str17 + str2 + "] contentListReplace container not found for pageId=" + str + ", targetContainerType=" + contentListReplaceConfig.getTargetContainerType() + ", targetContainerIndex=" + contentListReplaceConfig.getTargetContainerIndex());
                    } else {
                        java.util.List<UIComponentAppModel> listOLrzqt = OLrzqt(uIComponentAppModelCopydefault);
                        if (listOLrzqt == null) {
                            pUU.valueOf("KYCExperimentRepositoryImpl", str17 + str2 + "] contentListReplace unsupported container for pageId=" + str + ", targetContainerType=" + contentListReplaceConfig.getTargetContainerType() + ", targetContainerIndex=" + contentListReplaceConfig.getTargetContainerIndex());
                        } else {
                            UIComponentAppModel uIComponentAppModelGEmmrt = gEmmrt(contentListReplaceConfig.getItem());
                            if (uIComponentAppModelGEmmrt == null) {
                                pUU.valueOf("KYCExperimentRepositoryImpl", str17 + str2 + "] contentListReplace empty for pageId=" + str + ", targetContainerType=" + contentListReplaceConfig.getTargetContainerType() + ", targetContainerIndex=" + contentListReplaceConfig.getTargetContainerIndex() + ", type=" + contentListReplaceConfig.getTargetType() + ", index=" + contentListReplaceConfig.getTargetIndex());
                            } else {
                                java.util.List<UIComponentAppModel> listAEQbTJ2 = AEQbTJ(listOLrzqt, contentListReplaceConfig.getTargetType(), contentListReplaceConfig.getTargetIndex(), uIComponentAppModelGEmmrt);
                                if (listAEQbTJ2 == null) {
                                    pUU.valueOf("KYCExperimentRepositoryImpl", str17 + str2 + "] contentListReplace target not found for pageId=" + str + ", targetContainerType=" + contentListReplaceConfig.getTargetContainerType() + ", targetContainerIndex=" + contentListReplaceConfig.getTargetContainerIndex() + ", type=" + contentListReplaceConfig.getTargetType() + ", index=" + contentListReplaceConfig.getTargetIndex());
                                } else {
                                    UIComponentAppModel uIComponentAppModelAEQbTJ = AEQbTJ(uIComponentAppModelCopydefault, listAEQbTJ2);
                                    if (uIComponentAppModelAEQbTJ == null) {
                                        pUU.valueOf("KYCExperimentRepositoryImpl", str17 + str2 + "] contentListReplace unsupported container for pageId=" + str + ", targetContainerType=" + contentListReplaceConfig.getTargetContainerType() + ", targetContainerIndex=" + contentListReplaceConfig.getTargetContainerIndex());
                                    } else {
                                        list5 = listKWHzl2;
                                        str12 = str17;
                                        listKWHzl2 = KWHzl(listKWHzl2, uIComponentAppModelAEQbTJ, contentListReplaceConfig.getTargetContainerType(), contentListReplaceConfig.getTargetContainerIndex(), contentListReplaceConfig.getTargetContainerPath());
                                        if (listKWHzl2 == null) {
                                            pUU.valueOf("KYCExperimentRepositoryImpl", str12 + str2 + "] contentListReplace failed to write container for pageId=" + str + ", targetContainerType=" + contentListReplaceConfig.getTargetContainerType() + ", targetContainerIndex=" + contentListReplaceConfig.getTargetContainerIndex());
                                            listKWHzl2 = list5;
                                            set2 = set;
                                            str17 = str12;
                                        } else {
                                            set2 = set;
                                            str17 = str12;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                list5 = listKWHzl2;
                str12 = str17;
                listKWHzl2 = list5;
                set2 = set;
                str17 = str12;
            }
            str3 = str17;
            listKWHzl = listKWHzl2;
        } else {
            str3 = "experiment[";
        }
        java.util.List<ContentListInsertConfig> contentListInsert = abExperimentConfig.getContentListInsert();
        if (contentListInsert != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (java.lang.Object obj3 : contentListInsert) {
                ContentListInsertConfig contentListInsertConfig = (ContentListInsertConfig) obj3;
                Triple triple = new Triple(contentListInsertConfig.getTargetContainerType(), java.lang.Integer.valueOf(contentListInsertConfig.getTargetContainerIndex()), copydefault(contentListInsertConfig.getTargetContainerPath()));
                java.lang.Object arrayList3 = linkedHashMap.get(triple);
                if (arrayList3 == null) {
                    arrayList3 = new java.util.ArrayList();
                    linkedHashMap.put(triple, arrayList3);
                }
                ((java.util.List) arrayList3).add(obj3);
            }
            java.util.Iterator it2 = linkedHashMap.entrySet().iterator();
            list3 = listKWHzl;
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Triple triple2 = (Triple) entry.getKey();
                java.util.List list6 = (java.util.List) entry.getValue();
                java.lang.String str18 = (java.lang.String) triple2.getFirst();
                int iIntValue = ((java.lang.Number) triple2.getSecond()).intValue();
                ContentListInsertConfig contentListInsertConfig2 = (ContentListInsertConfig) CollectionsKt___CollectionsKt.firstOrNull(list6);
                UIComponentAppModel uIComponentAppModelCopydefault2 = copydefault(list3, str18, iIntValue, contentListInsertConfig2 != null ? contentListInsertConfig2.getTargetContainerPath() : null);
                if (uIComponentAppModelCopydefault2 == null) {
                    pUU.valueOf(str13, str3 + str2 + "] contentList target not found for pageId=" + str + str15 + triple2.getFirst() + str16 + triple2.getSecond());
                } else {
                    java.util.List<UIComponentAppModel> listOLrzqt2 = OLrzqt(uIComponentAppModelCopydefault2);
                    if (listOLrzqt2 == null) {
                        pUU.valueOf(str13, str3 + str2 + "] contentList insert unsupported container for pageId=" + str + str15 + triple2.getFirst() + str16 + triple2.getSecond());
                    } else {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(list6, 10));
                        for (java.util.Iterator it3 = list6.iterator(); it3.hasNext(); it3 = it3) {
                            ContentListInsertConfig contentListInsertConfig3 = (ContentListInsertConfig) it3.next();
                            arrayList4.add(new InsertConfig(contentListInsertConfig3.getPosition(), contentListInsertConfig3.getTargetIndex(), contentListInsertConfig3.getTargetContainerType(), java.lang.Integer.valueOf(contentListInsertConfig3.getTargetContainerIndex()), contentListInsertConfig3.getTargetContainerPath(), contentListInsertConfig3.getItems()));
                        }
                        java.lang.String str19 = str16;
                        java.lang.String str20 = str15;
                        str8 = str14;
                        it = it2;
                        str9 = str13;
                        UIComponentAppModel uIComponentAppModelAEQbTJ2 = AEQbTJ(uIComponentAppModelCopydefault2, applyInsertBatch$default(this, listOLrzqt2, arrayList4, str, str2, "contentListInsert targetContainerType=" + triple2.getFirst() + " targetContainerIndex=" + triple2.getSecond(), null, true, 32, null));
                        if (uIComponentAppModelAEQbTJ2 == null) {
                            java.lang.Object first = triple2.getFirst();
                            java.lang.Object second = triple2.getSecond();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(str3);
                            sb.append(str2);
                            sb.append("] contentList insert unsupported container for pageId=");
                            sb.append(str);
                            str11 = str20;
                            sb.append(str11);
                            sb.append(first);
                            str10 = str19;
                            sb.append(str10);
                            sb.append(second);
                            pUU.valueOf(str9, sb.toString());
                        } else {
                            str10 = str19;
                            str11 = str20;
                            java.lang.String str21 = (java.lang.String) triple2.getFirst();
                            int iIntValue2 = ((java.lang.Number) triple2.getSecond()).intValue();
                            ContentListInsertConfig contentListInsertConfig4 = (ContentListInsertConfig) CollectionsKt___CollectionsKt.firstOrNull(list6);
                            java.util.List<UIComponentAppModel> listKWHzl3 = KWHzl(list3, uIComponentAppModelAEQbTJ2, str21, iIntValue2, contentListInsertConfig4 != null ? contentListInsertConfig4.getTargetContainerPath() : null);
                            if (listKWHzl3 == null) {
                                pUU.valueOf(str9, str3 + str2 + "] contentList insert failed to write container for pageId=" + str + str11 + triple2.getFirst() + str10 + triple2.getSecond());
                            } else {
                                list3 = listKWHzl3;
                            }
                        }
                        str13 = str9;
                        str14 = str8;
                        it2 = it;
                        java.lang.String str22 = str10;
                        str15 = str11;
                        str16 = str22;
                    }
                }
                str8 = str14;
                it = it2;
                str9 = str13;
                java.lang.String str23 = str15;
                str10 = str16;
                str11 = str23;
                str13 = str9;
                str14 = str8;
                it2 = it;
                java.lang.String str222 = str10;
                str15 = str11;
                str16 = str222;
            }
            str4 = str14;
            str5 = str13;
        } else {
            str4 = ", type=";
            str5 = "KYCExperimentRepositoryImpl";
            list3 = listKWHzl;
        }
        if (abExperimentConfig.getCtaItemsInsert() == null) {
            ctaAppModel2 = ctaAppModel;
        } else if (ctaAppModel == null) {
            pUU.valueOf(str5, str3 + str2 + "] ctaItemsInsert skipped for pageId=" + str + " because cta is null");
            ctaAppModel2 = ctaAppModel;
        } else {
            list4 = list3;
            str6 = " because cta is null";
            ctaAppModel2 = ctaAppModel;
            ctaAppModel2.setItems(applyInsertBatch$default(this, ctaAppModel.getItems(), abExperimentConfig.getCtaItemsInsert(), str, str2, "ctaItemsInsert", null, true, 32, null));
            if (abExperimentConfig.getCtaItemsReplace() != null) {
                if (ctaAppModel2 == null) {
                    pUU.valueOf(str5, str3 + str2 + "] ctaItemsReplace skipped for pageId=" + str + str6);
                } else {
                    java.util.List<UIComponentAppModel> items = ctaAppModel.getItems();
                    for (CtaReplaceConfig ctaReplaceConfig : abExperimentConfig.getCtaItemsReplace()) {
                        UIComponentAppModel uIComponentAppModel = (UIComponentAppModel) CollectionsKt___CollectionsKt.AkhnZx(items, ctaReplaceConfig.getTargetIndex());
                        java.util.Iterator it4 = C59467zhb.fJNWhG(C59405zgS.EZpvd((java.lang.Object[]) new java.lang.String[]{uIComponentAppModel != null ? AEQbTJ(uIComponentAppModel) : null, copydefault(ctaReplaceConfig.getItem())}), new Function1() { // from class: o.rvt
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj4) {
                                return C43789rvs.OLrzqt(this.KWHzl, (java.lang.String) obj4);
                            }
                        }).iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it4.next();
                            if (set.contains((java.lang.String) next)) {
                                break;
                            }
                        }
                        java.lang.String str24 = (java.lang.String) next;
                        if (str24 != null) {
                            int targetIndex = ctaReplaceConfig.getTargetIndex();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(str3);
                            sb2.append(str2);
                            sb2.append("] ctaItemsReplace skipped by type for pageId=");
                            sb2.append(str);
                            str7 = str4;
                            sb2.append(str7);
                            sb2.append(str24);
                            sb2.append(", absoluteIndex=");
                            sb2.append(targetIndex);
                            pUU.valueOf(str5, sb2.toString());
                        } else {
                            str7 = str4;
                            UIComponentAppModel uIComponentAppModelGEmmrt2 = gEmmrt(ctaReplaceConfig.getItem());
                            if (uIComponentAppModelGEmmrt2 == null) {
                                pUU.valueOf(str5, str3 + str2 + "] ctaItemsReplace empty for pageId=" + str + ", absoluteIndex=" + ctaReplaceConfig.getTargetIndex());
                            } else {
                                java.util.List<UIComponentAppModel> listOLrzqt3 = OLrzqt(items, "", ctaReplaceConfig.getTargetIndex(), uIComponentAppModelGEmmrt2);
                                if (listOLrzqt3 == null) {
                                    pUU.valueOf(str5, str3 + str2 + "] ctaItemsReplace target not found for pageId=" + str + ", absoluteIndex=" + ctaReplaceConfig.getTargetIndex());
                                } else {
                                    items = listOLrzqt3;
                                }
                            }
                        }
                        str4 = str7;
                    }
                    ctaAppModel2.setItems(items);
                }
            }
            return C56390yDp.OLrzqt(list4, ctaAppModel2);
        }
        list4 = list3;
        str6 = " because cta is null";
        if (abExperimentConfig.getCtaItemsReplace() != null) {
        }
        return C56390yDp.OLrzqt(list4, ctaAppModel2);
    }

    public static final java.lang.String OLrzqt(C43789rvs c43789rvs, java.lang.String str) {
        return c43789rvs.AEQbTJ(str);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:75:0x008b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:76:0x008b */
    /* JADX DEBUG: Multi-variable search result rejected for r27v0, resolved type: o.rvs */
    /* JADX DEBUG: Multi-variable search result rejected for r28v0, resolved type: java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List<UIComponentAppModel> KWHzl(java.util.List<? extends UIComponentAppModel> list, java.util.List<InsertConfig> list2, java.lang.String str, java.lang.String str2) {
        if (list2 == null || list2.isEmpty()) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            InsertConfig insertConfig = (InsertConfig) obj;
            java.util.List<ContainerPathNode> targetContainerPath = insertConfig.getTargetContainerPath();
            if ((targetContainerPath != null && !targetContainerPath.isEmpty()) || (insertConfig.getTargetContainerType() != null && insertConfig.getTargetContainerIndex() != null)) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj2 : arrayList) {
            InsertConfig insertConfig2 = (InsertConfig) obj2;
            Triple triple = new Triple(insertConfig2.getTargetContainerType(), insertConfig2.getTargetContainerIndex(), copydefault(insertConfig2.getTargetContainerPath()));
            java.lang.Object arrayList2 = linkedHashMap.get(triple);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
                linkedHashMap.put(triple, arrayList2);
            }
            ((java.util.List) arrayList2).add(obj2);
        }
        java.util.List list3 = list;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Triple triple2 = (Triple) entry.getKey();
            java.util.List list4 = (java.util.List) entry.getValue();
            InsertConfig insertConfig3 = (InsertConfig) CollectionsKt___CollectionsKt.firstOrNull(list4);
            if (insertConfig3 != null) {
                java.lang.String str3 = (java.lang.String) triple2.getFirst();
                if (str3 == null) {
                    str3 = "";
                }
                java.lang.String str4 = str3;
                java.lang.Integer num = (java.lang.Integer) triple2.getSecond();
                int iIntValue = num != null ? num.intValue() : 0;
                UIComponentAppModel uIComponentAppModelCopydefault = copydefault((java.util.List<? extends UIComponentAppModel>) list3, str4, iIntValue, insertConfig3.getTargetContainerPath());
                if (uIComponentAppModelCopydefault == null) {
                    pUU.valueOf("KYCExperimentRepositoryImpl", "experiment[" + str2 + "] nested itemsInsert target not found for pageId=" + str + ", targetContainerType=" + triple2.getFirst() + ", targetContainerIndex=" + triple2.getSecond());
                } else {
                    java.util.List<UIComponentAppModel> listEZpvd = EZpvd(uIComponentAppModelCopydefault);
                    if (listEZpvd == null) {
                        pUU.valueOf("KYCExperimentRepositoryImpl", "experiment[" + str2 + "] nested itemsInsert unsupported container for pageId=" + str + ", targetContainerType=" + triple2.getFirst() + ", targetContainerIndex=" + triple2.getSecond());
                    } else {
                        UIComponentAppModel uIComponentAppModelEZpvd = EZpvd(uIComponentAppModelCopydefault, (java.util.List<? extends UIComponentAppModel>) applyInsertBatch$default(this, listEZpvd, list4, str, str2, "nested itemsInsert targetContainerType=" + triple2.getFirst() + " targetContainerIndex=" + triple2.getSecond(), null, true, 32, null));
                        if (uIComponentAppModelEZpvd == null) {
                            pUU.valueOf("KYCExperimentRepositoryImpl", "experiment[" + str2 + "] nested itemsInsert failed to write container for pageId=" + str + ", targetContainerType=" + triple2.getFirst() + ", targetContainerIndex=" + triple2.getSecond());
                        } else {
                            java.util.List listKWHzl = KWHzl(list3, uIComponentAppModelEZpvd, str4, iIntValue, insertConfig3.getTargetContainerPath());
                            if (listKWHzl == null) {
                                pUU.valueOf("KYCExperimentRepositoryImpl", "experiment[" + str2 + "] nested itemsInsert failed to update hierarchy for pageId=" + str + ", targetContainerType=" + triple2.getFirst() + ", targetContainerIndex=" + triple2.getSecond());
                            } else {
                                list3 = listKWHzl;
                            }
                        }
                    }
                }
            }
        }
        return list3;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x00ec */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x000e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:31:0x000e */
    /* JADX DEBUG: Type inference failed for r10v1. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [o.rvs] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final java.util.List<UIComponentAppModel> OLrzqt(java.util.List<? extends UIComponentAppModel> list, java.util.List<ReplaceConfig> list2, java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set, java.lang.String str3) {
        if (list2 != null && !list2.isEmpty()) {
            for (ReplaceConfig replaceConfig : list2) {
                if (OLrzqt(replaceConfig.getTargetType(), set)) {
                    pUU.valueOf("KYCExperimentRepositoryImpl", "experiment[" + str2 + "] " + str3 + " skipped by type for pageId=" + str + ", type=" + replaceConfig.getTargetType() + ", index=" + replaceConfig.getTargetIndex());
                } else {
                    UIComponentAppModel uIComponentAppModelGEmmrt = gEmmrt(replaceConfig.getItem());
                    if (uIComponentAppModelGEmmrt == null) {
                        pUU.valueOf("KYCExperimentRepositoryImpl", "experiment[" + str2 + "] " + str3 + " empty for pageId=" + str + ", type=" + replaceConfig.getTargetType() + ", index=" + replaceConfig.getTargetIndex());
                    } else {
                        java.util.List<UIComponentAppModel> listOLrzqt = OLrzqt(list, replaceConfig.getTargetType(), replaceConfig.getTargetIndex(), uIComponentAppModelGEmmrt);
                        if (listOLrzqt == null) {
                            pUU.valueOf("KYCExperimentRepositoryImpl", "experiment[" + str2 + "] " + str3 + " target not found for pageId=" + str + ", type=" + replaceConfig.getTargetType() + ", absoluteIndex=" + replaceConfig.getTargetIndex());
                        } else {
                            list = listOLrzqt;
                        }
                    }
                }
            }
        }
        return list;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x0208 */
    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r20v0, types: [o.rvs] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>] */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    public final java.util.List<UIComponentAppModel> AEQbTJ(java.util.List<? extends UIComponentAppModel> list, java.util.List<ReplaceConfig> list2, java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set) {
        java.util.Iterator it;
        ?? r22;
        ?? r11;
        if (list2 == null || list2.isEmpty()) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            ReplaceConfig replaceConfig = (ReplaceConfig) obj;
            java.util.List<ContainerPathNode> targetContainerPath = replaceConfig.getTargetContainerPath();
            if ((targetContainerPath != null && !targetContainerPath.isEmpty()) || (replaceConfig.getTargetContainerType() != null && replaceConfig.getTargetContainerIndex() != null)) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj2 : arrayList) {
            ReplaceConfig replaceConfig2 = (ReplaceConfig) obj2;
            Triple triple = new Triple(replaceConfig2.getTargetContainerType(), replaceConfig2.getTargetContainerIndex(), copydefault(replaceConfig2.getTargetContainerPath()));
            java.lang.Object arrayList2 = linkedHashMap.get(triple);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
                linkedHashMap.put(triple, arrayList2);
            }
            ((java.util.List) arrayList2).add(obj2);
        }
        java.util.Iterator it2 = linkedHashMap.entrySet().iterator();
        ?? r112 = list;
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Triple triple2 = (Triple) entry.getKey();
            java.util.List list3 = (java.util.List) entry.getValue();
            ReplaceConfig replaceConfig3 = (ReplaceConfig) CollectionsKt___CollectionsKt.firstOrNull(list3);
            if (replaceConfig3 != null) {
                java.lang.String str3 = (java.lang.String) triple2.getFirst();
                if (str3 == null) {
                    str3 = "";
                }
                java.lang.String str4 = str3;
                java.lang.Integer num = (java.lang.Integer) triple2.getSecond();
                int iIntValue = num != null ? num.intValue() : 0;
                UIComponentAppModel uIComponentAppModelCopydefault = copydefault(r112, str4, iIntValue, replaceConfig3.getTargetContainerPath());
                if (uIComponentAppModelCopydefault == null) {
                    pUU.valueOf("KYCExperimentRepositoryImpl", "experiment[" + str2 + "] nested itemsReplace target not found for pageId=" + str + ", targetContainerType=" + triple2.getFirst() + ", targetContainerIndex=" + triple2.getSecond());
                } else {
                    java.util.List<UIComponentAppModel> listEZpvd = EZpvd(uIComponentAppModelCopydefault);
                    if (listEZpvd == null) {
                        pUU.valueOf("KYCExperimentRepositoryImpl", "experiment[" + str2 + "] nested itemsReplace unsupported container for pageId=" + str + ", targetContainerType=" + triple2.getFirst() + ", targetContainerIndex=" + triple2.getSecond());
                    } else {
                        it = it2;
                        ?? r222 = r112;
                        UIComponentAppModel uIComponentAppModelEZpvd = EZpvd(uIComponentAppModelCopydefault, OLrzqt(listEZpvd, list3, str, str2, set, "nested itemsReplace targetContainerType=" + triple2.getFirst() + " targetContainerIndex=" + triple2.getSecond()));
                        if (uIComponentAppModelEZpvd == null) {
                            pUU.valueOf("KYCExperimentRepositoryImpl", "experiment[" + str2 + "] nested itemsReplace failed to write container for pageId=" + str + ", targetContainerType=" + triple2.getFirst() + ", targetContainerIndex=" + triple2.getSecond());
                            r22 = r222;
                        } else {
                            java.util.List<UIComponentAppModel> listKWHzl = KWHzl(r222, uIComponentAppModelEZpvd, str4, iIntValue, replaceConfig3.getTargetContainerPath());
                            if (listKWHzl == null) {
                                pUU.valueOf("KYCExperimentRepositoryImpl", "experiment[" + str2 + "] nested itemsReplace failed to update hierarchy for pageId=" + str + ", targetContainerType=" + triple2.getFirst() + ", targetContainerIndex=" + triple2.getSecond());
                                r22 = r222;
                            } else {
                                r11 = listKWHzl;
                            }
                        }
                        r11 = r22;
                    }
                }
                it = it2;
                r22 = r112;
                r11 = r22;
            } else {
                it = it2;
                r22 = r112;
                r11 = r22;
            }
            it2 = it;
            r112 = r11;
        }
        return r112;
    }

    public final AbExperimentConfig AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.Object objM7377constructorimpl;
        AbExperimentConfig abExperimentConfig;
        java.lang.Object next;
        if (str == null || str.length() == 0) {
            return null;
        }
        C42459rTq c42459rTq = C42459rTq.KWHzl;
        java.lang.String strAEQbTJ = c42459rTq.AEQbTJ(c42459rTq.AEQbTJ(str3, str4, str2, str));
        if (strAEQbTJ == null) {
            return null;
        }
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ))) {
            strAEQbTJ = null;
        }
        if (strAEQbTJ == null) {
            return null;
        }
        try {
            Result.Application application = Result.Companion;
            if (C59449zhJ.startsWith$default(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strAEQbTJ).toString(), "[", false, 2, null)) {
                Json json = this.EZpvd;
                json.getSerializersModule();
                java.util.Iterator it = ((java.lang.Iterable) json.decodeFromString(new ArrayListSerializer(AbExperimentConfig.Companion.serializer()), strAEQbTJ)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((AbExperimentConfig) next).getId(), (java.lang.Object) str)) {
                        break;
                    }
                }
                abExperimentConfig = (AbExperimentConfig) next;
            } else {
                Json json2 = this.EZpvd;
                json2.getSerializersModule();
                java.lang.Object objDecodeFromString = json2.decodeFromString(AbExperimentConfig.Companion.serializer(), strAEQbTJ);
                if (!Intrinsics.EZpvd((java.lang.Object) ((AbExperimentConfig) objDecodeFromString).getId(), (java.lang.Object) str)) {
                    objDecodeFromString = null;
                }
                abExperimentConfig = (AbExperimentConfig) objDecodeFromString;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(abExperimentConfig);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (AbExperimentConfig) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final double EZpvd(JsonElement jsonElement, JsonElement jsonElement2) {
        if (AEQbTJ(jsonElement, jsonElement2)) {
            return 1.0d;
        }
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlinx.serialization.json.JsonElement */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean AEQbTJ(JsonElement jsonElement, JsonElement jsonElement2) {
        boolean zAEQbTJ;
        if (jsonElement2 == null) {
            return false;
        }
        if (!(jsonElement instanceof JsonPrimitive)) {
            if (jsonElement instanceof JsonArray) {
                if (jsonElement2 instanceof JsonArray) {
                    JsonArray jsonArray = (JsonArray) jsonElement2;
                    JsonArray jsonArray2 = (JsonArray) jsonElement;
                    if (jsonArray.size() == jsonArray2.size()) {
                        java.lang.Iterable iterableValueOf = yDY.valueOf((java.util.Collection<?>) jsonElement);
                        if (!(iterableValueOf instanceof java.util.Collection) || !((java.util.Collection) iterableValueOf).isEmpty()) {
                            java.util.Iterator it = iterableValueOf.iterator();
                            while (it.hasNext()) {
                                int iNextInt = ((AbstractC56415yEn) it).nextInt();
                                if (!AEQbTJ(jsonArray2.get(iNextInt), jsonArray.get(iNextInt))) {
                                    return false;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            if (!(jsonElement instanceof JsonObject) || !(jsonElement2 instanceof JsonObject)) {
                return false;
            }
            JsonObject jsonObject = (JsonObject) jsonElement;
            java.util.Set<java.lang.String> setKWHzl = KWHzl(jsonObject);
            java.util.Set setEZpvd = yEJ.EZpvd((java.util.Set<? extends java.lang.String>) ((java.util.Set<? extends java.lang.Object>) jsonObject.keySet()), "ignoreValueKeys");
            JsonObject jsonObject2 = (JsonObject) jsonElement2;
            java.util.Set<java.lang.String> setKeySet = jsonObject2.keySet();
            if (!(setKeySet instanceof java.util.Collection) || !setKeySet.isEmpty()) {
                java.util.Iterator<T> it2 = setKeySet.iterator();
                while (it2.hasNext()) {
                    if (!setEZpvd.contains((java.lang.String) it2.next())) {
                        return false;
                    }
                }
            }
            java.util.Set<java.lang.String> set = setEZpvd;
            if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
                for (java.lang.String str : set) {
                    JsonElement jsonElement3 = (JsonElement) jsonObject.get((java.lang.Object) str);
                    if (jsonElement3 == null) {
                        return false;
                    }
                    if (setKWHzl.contains(str)) {
                        zAEQbTJ = jsonObject2.containsKey((java.lang.Object) str);
                    } else {
                        zAEQbTJ = AEQbTJ(jsonElement3, (JsonElement) jsonObject2.get((java.lang.Object) str));
                    }
                    if (!zAEQbTJ) {
                        return false;
                    }
                }
            }
        } else if (!(jsonElement2 instanceof JsonPrimitive) || !Intrinsics.EZpvd(jsonElement, jsonElement2)) {
            return false;
        }
        return true;
    }

    public final java.util.Set<java.lang.String> KWHzl(JsonObject jsonObject) {
        java.lang.Object obj = jsonObject.get("ignoreValueKeys");
        JsonArray jsonArray = obj instanceof JsonArray ? (JsonArray) obj : null;
        if (jsonArray == null) {
            return yEE.copydefault();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (JsonElement jsonElement : jsonArray) {
            JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
            if (jsonPrimitive != null) {
                arrayList.add(jsonPrimitive);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String contentOrNull = JsonElementKt.getContentOrNull((JsonPrimitive) it.next());
            java.lang.String string = contentOrNull != null ? StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) contentOrNull).toString() : null;
            if (string != null) {
                arrayList2.add(string);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList2) {
            if (((java.lang.String) obj2).length() > 0) {
                arrayList3.add(obj2);
            }
        }
        return CollectionsKt___CollectionsKt.OqFWZa(arrayList3);
    }

    public final java.util.List<UIComponentAppModel> AYXKKw(JsonElement jsonElement) {
        java.lang.Object objM7377constructorimpl;
        java.util.List<UIComponentAppModel> listEZpvd;
        if (jsonElement instanceof JsonArray) {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(KWHzl(jsonElement));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.util.List listAhwBna = yDY.AhwBna();
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = listAhwBna;
            }
            return (java.util.List) objM7377constructorimpl;
        }
        if (!(jsonElement instanceof JsonObject)) {
            return yDY.AhwBna();
        }
        UIComponentAppModel uIComponentAppModelGEmmrt = gEmmrt(jsonElement);
        return (uIComponentAppModelGEmmrt == null || (listEZpvd = C56402yEa.EZpvd(uIComponentAppModelGEmmrt)) == null) ? yDY.AhwBna() : listEZpvd;
    }

    public final UIComponentAppModel gEmmrt(JsonElement jsonElement) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            Json jsonCopydefault = C43776rvf.EZpvd.copydefault();
            jsonCopydefault.getSerializersModule();
            objM7377constructorimpl = Result.m7377constructorimpl(((UIComponent) jsonCopydefault.decodeFromJsonElement(UIComponent.Companion.serializer(), jsonElement)).toAppModel());
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        if (objM7377constructorimpl instanceof UIComponentAppModel) {
            return (UIComponentAppModel) objM7377constructorimpl;
        }
        return null;
    }

    public final java.util.List<PopUpComponentAppModel> AhwBna(JsonElement jsonElement) {
        java.lang.Object objM7377constructorimpl;
        java.util.List<PopUpComponentAppModel> listEZpvd;
        if (!(jsonElement instanceof JsonArray)) {
            if (!(jsonElement instanceof JsonObject)) {
                return yDY.AhwBna();
            }
            PopUpComponentAppModel popUpComponentAppModelEZpvd = EZpvd(jsonElement);
            return (popUpComponentAppModelEZpvd == null || (listEZpvd = C56402yEa.EZpvd(popUpComponentAppModelEZpvd)) == null) ? yDY.AhwBna() : listEZpvd;
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C43747rvC.AEQbTJ(jsonElement));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.util.List listAhwBna = yDY.AhwBna();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = listAhwBna;
        }
        return (java.util.List) objM7377constructorimpl;
    }

    public final PopUpComponentAppModel EZpvd(JsonElement jsonElement) {
        return (PopUpComponentAppModel) CollectionsKt___CollectionsKt.firstOrNull(AhwBna(jsonElement));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: o.rvs */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.List applyInsertBatch$default(C43789rvs c43789rvs, java.util.List list, java.util.List list2, java.lang.String str, java.lang.String str2, java.lang.String str3, Function1 function1, boolean z, int i, java.lang.Object obj) {
        return c43789rvs.copydefault(list, list2, str, str2, str3, (i & 32) != 0 ? null : function1, (i & 64) != 0 ? false : z);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:0x016a */
    /* JADX DEBUG: Type inference failed for r13v2. Raw type applied. Possible types: java.lang.Object, ? super com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel */
    /* JADX DEBUG: Type inference failed for r7v0. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.Collection, java.util.List, java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Iterable, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    public final java.util.List<UIComponentAppModel> copydefault(java.util.List<? extends UIComponentAppModel> list, java.util.List<InsertConfig> list2, java.lang.String str, java.lang.String str2, java.lang.String str3, Function1<? super UIComponentAppModel, java.lang.Boolean> function1, boolean z) {
        ?? FJNWhG;
        if (list2 == null || list2.isEmpty()) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (InsertConfig insertConfig : list2) {
            java.util.List<UIComponentAppModel> listAYXKKw = AYXKKw(insertConfig.getItems());
            if (function1 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj : listAYXKKw) {
                    if (function1.invoke(obj).booleanValue()) {
                        arrayList4.add(obj);
                    }
                }
                listAYXKKw = arrayList4;
            }
            if (listAYXKKw.isEmpty()) {
                pUU.valueOf("KYCExperimentRepositoryImpl", "experiment[" + str2 + "] " + str3 + " empty for pageId=" + str + ", position=" + insertConfig.getPosition());
            } else {
                java.lang.Integer targetIndex = z ? insertConfig.getTargetIndex() : null;
                if (targetIndex == null) {
                    int i = Activity.OLrzqt[insertConfig.getPosition().ordinal()];
                    if (i == 1) {
                        arrayList.addAll(listAYXKKw);
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList2.addAll(listAYXKKw);
                    }
                } else if (targetIndex.intValue() < 0 || targetIndex.intValue() > list.size()) {
                    pUU.valueOf("KYCExperimentRepositoryImpl", "experiment[" + str2 + "] " + str3 + " index out of bounds for pageId=" + str + ", index=" + targetIndex);
                } else {
                    arrayList3.add(C56390yDp.OLrzqt(targetIndex, listAYXKKw));
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            java.util.List<IndexedValue> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(CollectionsKt___CollectionsKt.DCJXGO(arrayList3), new Application(new StateListAnimator()));
            FJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
            int size = 0;
            for (IndexedValue indexedValue : listEZpvd) {
                int iIntValue = ((java.lang.Number) ((kotlin.Pair) indexedValue.AEQbTJ()).getFirst()).intValue() + size;
                java.util.List list3 = (java.util.List) ((kotlin.Pair) indexedValue.AEQbTJ()).getSecond();
                if (iIntValue >= 0 && iIntValue <= FJNWhG.size()) {
                    FJNWhG.addAll(iIntValue, list3);
                    size += list3.size();
                }
            }
        } else {
            FJNWhG = list;
        }
        return (arrayList.isEmpty() && arrayList2.isEmpty()) ? FJNWhG : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList, (java.lang.Iterable) FJNWhG), (java.lang.Iterable) arrayList2);
    }

    public final java.lang.Integer KWHzl(java.util.List<? extends UIComponentAppModel> list, java.lang.String str, int i) {
        if (i >= 0 && i < list.size()) {
            java.lang.String lowerCase = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString().toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase.length() == 0) {
                return java.lang.Integer.valueOf(i);
            }
            java.lang.String strAEQbTJ = AEQbTJ(list.get(i));
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            numValueOf.intValue();
            if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) lowerCase)) {
                return numValueOf;
            }
        }
        return null;
    }

    public final UIComponentAppModel copydefault(java.util.List<? extends UIComponentAppModel> list, java.lang.String str, int i, java.util.List<ContainerPathNode> list2) {
        kotlin.Pair<java.lang.String, java.util.List<UIComponentAppModel>> pairKWHzl;
        if (list2 == null || list2.isEmpty()) {
            java.lang.Integer numKWHzl = KWHzl(list, str, i);
            if (numKWHzl != null) {
                return list.get(numKWHzl.intValue());
            }
            return null;
        }
        int i2 = 0;
        UIComponentAppModel uIComponentAppModel = null;
        for (java.lang.Object obj : list2) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            ContainerPathNode containerPathNode = (ContainerPathNode) obj;
            int targetIndex = containerPathNode.getTargetIndex();
            if (targetIndex < 0 || targetIndex >= list.size()) {
                return null;
            }
            UIComponentAppModel uIComponentAppModel2 = list.get(targetIndex);
            java.lang.String lowerCase = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) containerPathNode.getTargetType()).toString().toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) AEQbTJ(uIComponentAppModel2), (java.lang.Object) lowerCase)) {
                return null;
            }
            if (i2 < yDY.AuCTel(list2) && ((pairKWHzl = KWHzl(uIComponentAppModel2)) == null || (list = pairKWHzl.getSecond()) == null)) {
                return null;
            }
            i2++;
            uIComponentAppModel = uIComponentAppModel2;
        }
        return uIComponentAppModel;
    }

    public final java.lang.String copydefault(java.util.List<ContainerPathNode> list) {
        return (list == null || list.isEmpty()) ? "" : CollectionsKt___CollectionsKt.joinToString$default(list, " > ", null, null, 0, null, new Function1() { // from class: o.rvu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43789rvs.copydefault((ContainerPathNode) obj);
            }
        }, 30, null);
    }

    public static final java.lang.CharSequence copydefault(ContainerPathNode containerPathNode) {
        Intrinsics.checkNotNullParameter(containerPathNode, "");
        return containerPathNode.getTargetType() + ":" + containerPathNode.getTargetIndex();
    }

    public final java.util.List<UIComponentAppModel> KWHzl(java.util.List<? extends UIComponentAppModel> list, UIComponentAppModel uIComponentAppModel, java.lang.String str, int i, java.util.List<ContainerPathNode> list2) {
        if (list2 == null || list2.isEmpty()) {
            java.lang.Integer numKWHzl = KWHzl(list, str, i);
            if (numKWHzl == null) {
                return null;
            }
            int iIntValue = numKWHzl.intValue();
            java.util.List<UIComponentAppModel> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
            listFJNWhG.set(iIntValue, uIComponentAppModel);
            return listFJNWhG;
        }
        return copydefault(list, list2, 0, uIComponentAppModel);
    }

    public final java.util.List<UIComponentAppModel> copydefault(java.util.List<? extends UIComponentAppModel> list, java.util.List<ContainerPathNode> list2, int i, UIComponentAppModel uIComponentAppModel) {
        UIComponentAppModel uIComponentAppModelCopydefault;
        if (i >= 0 && i < list2.size()) {
            ContainerPathNode containerPathNode = list2.get(i);
            int size = list.size();
            int targetIndex = containerPathNode.getTargetIndex();
            if (targetIndex >= 0 && targetIndex < size) {
                UIComponentAppModel uIComponentAppModel2 = list.get(containerPathNode.getTargetIndex());
                java.lang.String lowerCase = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) containerPathNode.getTargetType()).toString().toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (lowerCase.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) AEQbTJ(uIComponentAppModel2), (java.lang.Object) lowerCase)) {
                    return null;
                }
                java.util.List<UIComponentAppModel> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
                if (i == yDY.AuCTel(list2)) {
                    listFJNWhG.set(containerPathNode.getTargetIndex(), uIComponentAppModel);
                    return listFJNWhG;
                }
                kotlin.Pair<java.lang.String, java.util.List<UIComponentAppModel>> pairKWHzl = KWHzl(uIComponentAppModel2);
                if (pairKWHzl == null) {
                    return null;
                }
                java.lang.String first = pairKWHzl.getFirst();
                java.util.List<UIComponentAppModel> listCopydefault = copydefault(pairKWHzl.getSecond(), list2, i + 1, uIComponentAppModel);
                if (listCopydefault == null || (uIComponentAppModelCopydefault = copydefault(uIComponentAppModel2, first, listCopydefault)) == null) {
                    return null;
                }
                listFJNWhG.set(containerPathNode.getTargetIndex(), uIComponentAppModelCopydefault);
                return listFJNWhG;
            }
        }
        return null;
    }

    public final java.lang.String AEQbTJ(UIComponentAppModel uIComponentAppModel) {
        return KWHzl((java.lang.Object) uIComponentAppModel);
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        java.lang.String lowerCase;
        java.lang.String string;
        if (str == null || (string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        }
        java.lang.String str2 = lowerCase != null ? lowerCase : "";
        if (str2.length() > 0) {
            return str2;
        }
        return null;
    }

    public final boolean OLrzqt(java.lang.String str, java.util.Set<java.lang.String> set) {
        java.lang.String strAEQbTJ = AEQbTJ(str);
        if (strAEQbTJ == null) {
            return false;
        }
        return set.contains(strAEQbTJ);
    }

    public final java.lang.String copydefault(JsonElement jsonElement) {
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        JsonElement jsonElement2 = jsonObject != null ? (JsonElement) jsonObject.get((java.lang.Object) "type") : null;
        JsonPrimitive jsonPrimitive = jsonElement2 instanceof JsonPrimitive ? (JsonPrimitive) jsonElement2 : null;
        if (jsonPrimitive != null) {
            return JsonElementKt.getContentOrNull(jsonPrimitive);
        }
        return null;
    }

    public final java.lang.String KWHzl(java.lang.Object obj) {
        java.lang.String strValueOf = C56524yIo.AEQbTJ(obj.getClass()).valueOf();
        if (strValueOf == null) {
            return "";
        }
        java.lang.String lowerCase = C59449zhJ.replace$default(new Regex("([a-z0-9])([A-Z])").replace(new Regex("([A-Z]+)([A-Z][a-z])").replace(StringsKt__StringsKt.EZpvd(strValueOf, (java.lang.CharSequence) "AppModel"), "$1-$2"), "$1-$2"), '_', '-', false, 4, (java.lang.Object) null).toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public final java.util.List<UIComponentAppModel> AEQbTJ(java.util.List<? extends UIComponentAppModel> list, java.lang.String str, int i, UIComponentAppModel uIComponentAppModel) {
        java.lang.String lowerCase = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            java.lang.Integer numValueOf = Intrinsics.EZpvd((java.lang.Object) AEQbTJ((UIComponentAppModel) next), (java.lang.Object) lowerCase) ? java.lang.Integer.valueOf(i2) : null;
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
            i2++;
        }
        java.lang.Integer num = (java.lang.Integer) CollectionsKt___CollectionsKt.AkhnZx(arrayList, i);
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        java.util.List<UIComponentAppModel> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
        listFJNWhG.set(iIntValue, uIComponentAppModel);
        return listFJNWhG;
    }

    public final java.util.List<UIComponentAppModel> OLrzqt(java.util.List<? extends UIComponentAppModel> list, java.lang.String str, int i, UIComponentAppModel uIComponentAppModel) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        java.lang.String lowerCase = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (lowerCase.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) AEQbTJ(list.get(i)), (java.lang.Object) lowerCase)) {
            return null;
        }
        java.util.List<UIComponentAppModel> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
        listFJNWhG.set(i, uIComponentAppModel);
        return listFJNWhG;
    }

    public final java.util.List<PopUpComponentAppModel> KWHzl(java.util.List<? extends PopUpComponentAppModel> list, java.lang.String str, int i, PopUpComponentAppModel popUpComponentAppModel) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        java.lang.String lowerCase = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (lowerCase.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) KWHzl(list.get(i)), (java.lang.Object) lowerCase)) {
            return null;
        }
        java.util.List<PopUpComponentAppModel> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
        listFJNWhG.set(i, popUpComponentAppModel);
        return listFJNWhG;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x0131 */
    /* JADX DEBUG: Type inference failed for r12v1. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.Collection, java.util.List, java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel>] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Iterable, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel>] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
    public final java.util.List<PopUpComponentAppModel> EZpvd(java.util.List<? extends PopUpComponentAppModel> list, java.util.List<InsertConfig> list2, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (list2 == null || list2.isEmpty()) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (InsertConfig insertConfig : list2) {
            java.util.List<PopUpComponentAppModel> listAhwBna = AhwBna(insertConfig.getItems());
            if (listAhwBna.isEmpty()) {
                pUU.valueOf("KYCExperimentRepositoryImpl", "experiment[" + str2 + "] " + str3 + " empty for pageId=" + str + ", position=" + insertConfig.getPosition());
            } else {
                java.lang.Integer targetIndex = insertConfig.getTargetIndex();
                if (targetIndex == null) {
                    int i = Activity.OLrzqt[insertConfig.getPosition().ordinal()];
                    if (i == 1) {
                        arrayList.addAll(listAhwBna);
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList2.addAll(listAhwBna);
                    }
                } else if (targetIndex.intValue() < 0 || targetIndex.intValue() > list.size()) {
                    pUU.valueOf("KYCExperimentRepositoryImpl", "experiment[" + str2 + "] " + str3 + " index out of bounds for pageId=" + str + ", index=" + targetIndex);
                } else {
                    arrayList3.add(C56390yDp.OLrzqt(targetIndex, listAhwBna));
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            java.util.List<IndexedValue> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(CollectionsKt___CollectionsKt.DCJXGO(arrayList3), new PendingIntent(new ActionBar()));
            list = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
            int size = 0;
            for (IndexedValue indexedValue : listEZpvd) {
                int iIntValue = ((java.lang.Number) ((kotlin.Pair) indexedValue.AEQbTJ()).getFirst()).intValue() + size;
                java.util.List list3 = (java.util.List) ((kotlin.Pair) indexedValue.AEQbTJ()).getSecond();
                if (iIntValue >= 0 && iIntValue <= list.size()) {
                    list.addAll(iIntValue, list3);
                    size += list3.size();
                }
            }
        }
        return (arrayList.isEmpty() && arrayList2.isEmpty()) ? list : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList, (java.lang.Iterable) list), (java.lang.Iterable) arrayList2);
    }

    public final kotlin.Pair<java.lang.String, java.util.List<UIComponentAppModel>> KWHzl(UIComponentAppModel uIComponentAppModel) {
        java.util.List<UIComponentAppModel> listOLrzqt = OLrzqt(uIComponentAppModel);
        if (listOLrzqt != null) {
            return C56390yDp.OLrzqt("contentList", listOLrzqt);
        }
        java.util.List<UIComponentAppModel> listEZpvd = EZpvd(uIComponentAppModel);
        if (listEZpvd != null) {
            return C56390yDp.OLrzqt("items", listEZpvd);
        }
        return null;
    }

    public final UIComponentAppModel copydefault(UIComponentAppModel uIComponentAppModel, java.lang.String str, java.util.List<? extends UIComponentAppModel> list) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "contentList")) {
            return AEQbTJ(uIComponentAppModel, list);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "items")) {
            return EZpvd(uIComponentAppModel, list);
        }
        return null;
    }

    public final java.util.List<UIComponentAppModel> OLrzqt(UIComponentAppModel uIComponentAppModel) {
        return uIComponentAppModel instanceof CtaCardAppModel ? ((CtaCardAppModel) uIComponentAppModel).getContentList() : uIComponentAppModel instanceof EditCardAppModel ? ((EditCardAppModel) uIComponentAppModel).getContentList() : KWHzl(uIComponentAppModel, "contentList");
    }

    public final UIComponentAppModel AEQbTJ(UIComponentAppModel uIComponentAppModel, java.util.List<? extends UIComponentAppModel> list) {
        UIComponentAppModel uIComponentAppModelCopy$default;
        if (uIComponentAppModel instanceof CtaCardAppModel) {
            uIComponentAppModelCopy$default = CtaCardAppModel.copy$default((CtaCardAppModel) uIComponentAppModel, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279, null);
        } else {
            if (!(uIComponentAppModel instanceof EditCardAppModel)) {
                return AEQbTJ(uIComponentAppModel, "contentList", list);
            }
            uIComponentAppModelCopy$default = EditCardAppModel.copy$default((EditCardAppModel) uIComponentAppModel, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, 65471, null);
        }
        return uIComponentAppModelCopy$default;
    }

    public final java.util.List<UIComponentAppModel> EZpvd(UIComponentAppModel uIComponentAppModel) {
        return KWHzl(uIComponentAppModel, "items");
    }

    public final UIComponentAppModel EZpvd(UIComponentAppModel uIComponentAppModel, java.util.List<? extends UIComponentAppModel> list) {
        return AEQbTJ(uIComponentAppModel, "items", list);
    }

    public final java.util.List<UIComponentAppModel> KWHzl(UIComponentAppModel uIComponentAppModel, java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object next;
        try {
            Result.Application application = Result.Companion;
            java.util.Iterator<T> it = C56524yIo.AEQbTJ(uIComponentAppModel.getClass()).AYXKKw().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                InterfaceC56549yJm interfaceC56549yJm = (InterfaceC56549yJm) next;
                if (Intrinsics.EZpvd((java.lang.Object) interfaceC56549yJm.getName(), (java.lang.Object) str) && (interfaceC56549yJm instanceof InterfaceC56560yJx)) {
                    break;
                }
            }
            InterfaceC56560yJx interfaceC56560yJx = next instanceof InterfaceC56560yJx ? (InterfaceC56560yJx) next : null;
            java.lang.Object obj = interfaceC56560yJx != null ? interfaceC56560yJx.get(uIComponentAppModel) : null;
            java.util.List list = obj instanceof java.util.List ? (java.util.List) obj : null;
            if (list != null && !list.isEmpty()) {
                for (java.lang.Object obj2 : list) {
                    if (obj2 != null && !(obj2 instanceof UIComponentAppModel)) {
                        return null;
                    }
                }
            }
            if (list == null) {
                list = null;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(list);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (java.util.List) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final UIComponentAppModel AEQbTJ(UIComponentAppModel uIComponentAppModel, java.lang.String str, java.util.List<? extends UIComponentAppModel> list) {
        return KWHzl(uIComponentAppModel, str, list) ? uIComponentAppModel : EZpvd(uIComponentAppModel, str, list);
    }

    public final boolean KWHzl(UIComponentAppModel uIComponentAppModel, java.lang.String str, java.util.List<? extends UIComponentAppModel> list) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object next;
        try {
            Result.Application application = Result.Companion;
            java.util.Iterator<T> it = C56524yIo.AEQbTJ(uIComponentAppModel.getClass()).AYXKKw().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                InterfaceC56549yJm interfaceC56549yJm = (InterfaceC56549yJm) next;
                if (Intrinsics.EZpvd((java.lang.Object) interfaceC56549yJm.getName(), (java.lang.Object) str) && (interfaceC56549yJm instanceof InterfaceC56554yJr)) {
                    break;
                }
            }
            InterfaceC56554yJr interfaceC56554yJr = next instanceof InterfaceC56554yJr ? (InterfaceC56554yJr) next : null;
            if (interfaceC56554yJr != null) {
                interfaceC56554yJr.set(uIComponentAppModel, list);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(interfaceC56554yJr != null));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = bool;
        }
        return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v8, resolved type: R */
    /* JADX WARN: Multi-variable type inference failed */
    public final UIComponentAppModel EZpvd(UIComponentAppModel uIComponentAppModel, java.lang.String str, java.util.List<? extends UIComponentAppModel> list) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.Object next3;
        try {
            Result.Application application = Result.Companion;
            java.util.Iterator<T> it = C56524yIo.AEQbTJ(uIComponentAppModel.getClass()).AYXKKw().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((InterfaceC56549yJm) next).getName(), (java.lang.Object) "copy")) {
                    break;
                }
            }
            InterfaceC56555yJs interfaceC56555yJs = next instanceof InterfaceC56555yJs ? (InterfaceC56555yJs) next : null;
            if (interfaceC56555yJs == null) {
                return null;
            }
            java.util.Iterator<T> it2 = interfaceC56555yJs.getParameters().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((KParameter) next2).OLrzqt() == KParameter.Kind.INSTANCE) {
                    break;
                }
            }
            KParameter kParameter = (KParameter) next2;
            if (kParameter == null) {
                return null;
            }
            java.util.Iterator<T> it3 = interfaceC56555yJs.getParameters().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((KParameter) next3).KWHzl(), (java.lang.Object) str)) {
                    break;
                }
            }
            KParameter kParameter2 = (KParameter) next3;
            if (kParameter2 == null) {
                return null;
            }
            R rCallBy = interfaceC56555yJs.callBy(C56424yEw.gEmmrt(C56390yDp.OLrzqt(kParameter, uIComponentAppModel), C56390yDp.OLrzqt(kParameter2, list)));
            objM7377constructorimpl = Result.m7377constructorimpl(rCallBy instanceof UIComponentAppModel ? (UIComponentAppModel) rCallBy : null);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (UIComponentAppModel) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public static /* synthetic */ java.lang.String pageTypeFor$default(C43789rvs c43789rvs, PageComponentAppModel pageComponentAppModel, JsonElement jsonElement, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            jsonElement = null;
        }
        return c43789rvs.copydefault(pageComponentAppModel, jsonElement);
    }

    public final java.lang.String copydefault(PageComponentAppModel pageComponentAppModel, JsonElement jsonElement) {
        if (pageComponentAppModel instanceof FormAppModel) {
            return OLrzqt(jsonElement);
        }
        if (pageComponentAppModel instanceof PopUpAppModel) {
            return "popup";
        }
        if (pageComponentAppModel instanceof ResultAppModel) {
            return "result";
        }
        if (pageComponentAppModel instanceof ProcessingAppModel) {
            return "processing";
        }
        if (pageComponentAppModel instanceof SelectWalletVerificationAppModel) {
            return "selectWalletVerificationMethod";
        }
        return null;
    }

    public final java.lang.String OLrzqt(JsonElement jsonElement) {
        java.lang.String contentOrNull;
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        JsonElement jsonElement2 = jsonObject != null ? (JsonElement) jsonObject.get((java.lang.Object) "type") : null;
        JsonPrimitive jsonPrimitive = jsonElement2 instanceof JsonPrimitive ? (JsonPrimitive) jsonElement2 : null;
        java.lang.String string = (jsonPrimitive == null || (contentOrNull = JsonElementKt.getContentOrNull(jsonPrimitive)) == null) ? null : StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) contentOrNull).toString();
        if (string == null) {
            string = "";
        }
        if (C59449zhJ.gEmmrt(string, "form", true) || C59449zhJ.gEmmrt(string, "verificationCenter", true) || C59449zhJ.gEmmrt(string, "info", true) || C59449zhJ.gEmmrt(string, "updateForm", true) || C59449zhJ.gEmmrt(string, "popup", true)) {
            return string;
        }
        return null;
    }

    public final java.util.List<UIComponentAppModel> KWHzl(JsonElement jsonElement) {
        Json jsonCopydefault = C43776rvf.EZpvd.copydefault();
        jsonCopydefault.getSerializersModule();
        java.lang.Iterable iterable = (java.lang.Iterable) jsonCopydefault.decodeFromJsonElement(new ArrayListSerializer(UIComponent.Companion.serializer()), jsonElement);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((UIComponent) it.next()).toAppModel());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (obj instanceof UIComponentAppModel) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
