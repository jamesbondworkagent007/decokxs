package o;

import androidx.activity.OnBackPressedCallback;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultStatus;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorVerifyResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.ok_kyc_core.domain.usecase.GetMultiVendorVerifyResultUseCase$invoke$1;
import com.okinc.ok_kyc_core.domain.usecase.GetMultiVendorVerifyResultUseCase$invoke$2$1;
import com.okinc.ok_kyc_core.domain.usecase.GetMultiVendorVerifyResultUseCase$postEncryptVerify$1;
import com.okinc.ok_kyc_core.domain.usecase.GetMultiVendorVerifyResultUseCase$postEncryptVerify$2$1;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractC43728ruk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rBz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41982rBz {
    public final OnBackPressedCallback KWHzl;
    public final InterfaceC41969rBm OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnBackPressedCallback copydefault() {
        return this.KWHzl;
    }

    public C41982rBz(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.OLrzqt = interfaceC41969rBm;
        this.KWHzl = new StateListAnimator();
    }

    /* JADX INFO: renamed from: o.rBz$StateListAnimator */
    public static final class StateListAnimator extends OnBackPressedCallback {
        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
        }

        public StateListAnimator() {
            super(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x014a A[Catch: all -> 0x01c7, TryCatch #0 {all -> 0x01c7, blocks: (B:13:0x0037, B:53:0x0144, B:55:0x014a, B:57:0x0162, B:59:0x0184, B:61:0x0193, B:63:0x0197, B:66:0x01a9, B:18:0x0066, B:26:0x00b2, B:28:0x00c3, B:33:0x00d2, B:35:0x00d9, B:38:0x00e1, B:40:0x00e8, B:43:0x00f4, B:45:0x010e, B:49:0x011b, B:22:0x0070), top: B:73:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0193 A[Catch: all -> 0x01c7, TryCatch #0 {all -> 0x01c7, blocks: (B:13:0x0037, B:53:0x0144, B:55:0x014a, B:57:0x0162, B:59:0x0184, B:61:0x0193, B:63:0x0197, B:66:0x01a9, B:18:0x0066, B:26:0x00b2, B:28:0x00c3, B:33:0x00d2, B:35:0x00d9, B:38:0x00e1, B:40:0x00e8, B:43:0x00f4, B:45:0x010e, B:49:0x011b, B:22:0x0070), top: B:73:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(long j, @NotNull java.util.List<SingleFileUploadUseCase.UploadedFile> list, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, androidx.fragment.app.Fragment fragment, PageComponentProfile pageComponentProfile, java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43728ruk<MultiVendorResultResp, ResponseFailedException>> continuation) throws java.lang.Throwable {
        GetMultiVendorVerifyResultUseCase$invoke$1 getMultiVendorVerifyResultUseCase$invoke$1;
        PageComponentProfile pageComponentProfile2;
        java.util.List<SingleFileUploadUseCase.UploadedFile> list2;
        java.util.HashMap<java.lang.String, java.lang.String> map2;
        C41982rBz c41982rBz;
        java.lang.String str2;
        java.lang.Integer num3;
        int i;
        java.lang.Integer num4;
        long j2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String certificateType;
        java.lang.String str5;
        C41982rBz c41982rBz2;
        long j3;
        java.lang.String countryOfResidence;
        AbstractC43728ruk abstractC43728ruk;
        if (continuation instanceof GetMultiVendorVerifyResultUseCase$invoke$1) {
            getMultiVendorVerifyResultUseCase$invoke$1 = (GetMultiVendorVerifyResultUseCase$invoke$1) continuation;
            int i2 = getMultiVendorVerifyResultUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getMultiVendorVerifyResultUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getMultiVendorVerifyResultUseCase$invoke$1 = new GetMultiVendorVerifyResultUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getMultiVendorVerifyResultUseCase$invoke$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i3 = getMultiVendorVerifyResultUseCase$invoke$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                if (num != null) {
                    int iIntValue = num.intValue();
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    GetMultiVendorVerifyResultUseCase$invoke$2$1 getMultiVendorVerifyResultUseCase$invoke$2$1 = new GetMultiVendorVerifyResultUseCase$invoke$2$1(fragment, this, null);
                    getMultiVendorVerifyResultUseCase$invoke$1.L$0 = this;
                    getMultiVendorVerifyResultUseCase$invoke$1.L$1 = list;
                    getMultiVendorVerifyResultUseCase$invoke$1.L$2 = num;
                    getMultiVendorVerifyResultUseCase$invoke$1.L$3 = num2;
                    getMultiVendorVerifyResultUseCase$invoke$1.L$4 = str;
                    pageComponentProfile2 = pageComponentProfile;
                    getMultiVendorVerifyResultUseCase$invoke$1.L$5 = pageComponentProfile2;
                    getMultiVendorVerifyResultUseCase$invoke$1.L$6 = map;
                    getMultiVendorVerifyResultUseCase$invoke$1.J$0 = j;
                    getMultiVendorVerifyResultUseCase$invoke$1.I$0 = iIntValue;
                    getMultiVendorVerifyResultUseCase$invoke$1.label = 1;
                    if (BuildersKt.withContext(main, getMultiVendorVerifyResultUseCase$invoke$2$1, getMultiVendorVerifyResultUseCase$invoke$1) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    list2 = list;
                    map2 = map;
                    c41982rBz = this;
                    str2 = str;
                    num3 = num;
                    i = iIntValue;
                    num4 = num2;
                    j2 = j;
                }
                return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(0, "Au10tix verify failed", null, null, 13, null));
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = getMultiVendorVerifyResultUseCase$invoke$1.J$0;
                c41982rBz2 = (C41982rBz) getMultiVendorVerifyResultUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                str4 = "";
                abstractC43728ruk = (AbstractC43728ruk) objCopydefault;
                if (!(abstractC43728ruk instanceof AbstractC43728ruk.ActionBar)) {
                    MultiVendorVerifyResponse multiVendorVerifyResponse = (MultiVendorVerifyResponse) ((AbstractC43728ruk.ActionBar) abstractC43728ruk).KWHzl();
                    c41982rBz2.KWHzl.setEnabled(false);
                    if (multiVendorVerifyResponse.getBizId() < 0) {
                        return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(12345, "Received invalid bizId", null, null, 12, null));
                    }
                    return new AbstractC43728ruk.ActionBar(new MultiVendorResultResp(MultiVendorResultStatus.Timeout, j3, "Verification Timed out"));
                }
                if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
                    java.lang.String message = ((ResponseFailedException) ((AbstractC43728ruk.TaskDescription) abstractC43728ruk).OLrzqt()).getMessage();
                    if (message == null) {
                        message = str4;
                    }
                    return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(12345, message, null, null, 12, null));
                }
                return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(0, "Au10tix verify failed", null, null, 13, null));
            }
            i = getMultiVendorVerifyResultUseCase$invoke$1.I$0;
            j2 = getMultiVendorVerifyResultUseCase$invoke$1.J$0;
            map2 = (java.util.HashMap) getMultiVendorVerifyResultUseCase$invoke$1.L$6;
            pageComponentProfile2 = (PageComponentProfile) getMultiVendorVerifyResultUseCase$invoke$1.L$5;
            str2 = (java.lang.String) getMultiVendorVerifyResultUseCase$invoke$1.L$4;
            num4 = (java.lang.Integer) getMultiVendorVerifyResultUseCase$invoke$1.L$3;
            num3 = (java.lang.Integer) getMultiVendorVerifyResultUseCase$invoke$1.L$2;
            list2 = (java.util.List) getMultiVendorVerifyResultUseCase$invoke$1.L$1;
            c41982rBz = (C41982rBz) getMultiVendorVerifyResultUseCase$invoke$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            EventData eventData = new EventData();
            eventData.setAct("event_kyc_flow_submit");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (pageComponentProfile2 == null || (countryOfResidence = pageComponentProfile2.getCountryOfResidence()) == null) {
                str3 = "";
                str4 = str3;
            } else {
                str3 = countryOfResidence;
                str4 = "";
            }
            linkedHashMap.put("attr_1", str3);
            if (pageComponentProfile2 == null || (certificateType = pageComponentProfile2.getCertificateType()) == null) {
                certificateType = str4;
            }
            linkedHashMap.put("attr_2", certificateType);
            if (map2 == null || (str5 = map2.get("refreshType")) == null) {
                str5 = str4;
            }
            linkedHashMap.put("attr_3", str5);
            linkedHashMap.put("attr_5", C33129mqd.gEmmrt(num3));
            eventData.setAttrs(linkedHashMap);
            ReportManager.AEQbTJ.EZpvd(eventData);
            InterfaceC41969rBm interfaceC41969rBm = c41982rBz.OLrzqt;
            int iIntValue2 = num4 != null ? num4.intValue() : 1;
            if (str2 == null) {
                str2 = str4;
            }
            getMultiVendorVerifyResultUseCase$invoke$1.L$0 = c41982rBz;
            getMultiVendorVerifyResultUseCase$invoke$1.L$1 = null;
            getMultiVendorVerifyResultUseCase$invoke$1.L$2 = null;
            getMultiVendorVerifyResultUseCase$invoke$1.L$3 = null;
            getMultiVendorVerifyResultUseCase$invoke$1.L$4 = null;
            getMultiVendorVerifyResultUseCase$invoke$1.L$5 = null;
            getMultiVendorVerifyResultUseCase$invoke$1.L$6 = null;
            getMultiVendorVerifyResultUseCase$invoke$1.J$0 = j2;
            getMultiVendorVerifyResultUseCase$invoke$1.label = 2;
            objCopydefault = interfaceC41969rBm.copydefault(list2, i, iIntValue2, str2, getMultiVendorVerifyResultUseCase$invoke$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c41982rBz2 = c41982rBz;
            j3 = j2;
            abstractC43728ruk = (AbstractC43728ruk) objCopydefault;
            if (!(abstractC43728ruk instanceof AbstractC43728ruk.ActionBar)) {
            }
        } catch (java.lang.Throwable th) {
            return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(0, java.lang.String.valueOf(th.getMessage()), null, null, 13, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0161 A[Catch: all -> 0x01de, TryCatch #0 {all -> 0x01de, blocks: (B:13:0x0036, B:53:0x015b, B:55:0x0161, B:57:0x0179, B:59:0x019b, B:61:0x01aa, B:63:0x01ae, B:66:0x01c0, B:18:0x0069, B:26:0x00be, B:28:0x00cf, B:33:0x00e3, B:35:0x00ea, B:38:0x00f2, B:40:0x00f9, B:43:0x0105, B:45:0x011f, B:49:0x012c, B:22:0x0078), top: B:73:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01aa A[Catch: all -> 0x01de, TryCatch #0 {all -> 0x01de, blocks: (B:13:0x0036, B:53:0x015b, B:55:0x0161, B:57:0x0179, B:59:0x019b, B:61:0x01aa, B:63:0x01ae, B:66:0x01c0, B:18:0x0069, B:26:0x00be, B:28:0x00cf, B:33:0x00e3, B:35:0x00ea, B:38:0x00f2, B:40:0x00f9, B:43:0x0105, B:45:0x011f, B:49:0x012c, B:22:0x0078), top: B:73:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(long j, @NotNull java.util.List<SingleFileUploadUseCase.UploadedFile> list, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, androidx.fragment.app.Fragment fragment, PageComponentProfile pageComponentProfile, java.util.HashMap<java.lang.String, java.lang.String> map, java.lang.String str2, @NotNull Continuation<? super AbstractC43728ruk<MultiVendorResultResp, ResponseFailedException>> continuation) throws java.lang.Throwable {
        GetMultiVendorVerifyResultUseCase$postEncryptVerify$1 getMultiVendorVerifyResultUseCase$postEncryptVerify$1;
        int iIntValue;
        java.util.List<SingleFileUploadUseCase.UploadedFile> list2;
        java.lang.Integer num3;
        java.util.HashMap<java.lang.String, java.lang.String> map2;
        java.lang.Integer num4;
        java.lang.String str3;
        PageComponentProfile pageComponentProfile2;
        C41982rBz c41982rBz;
        java.lang.String str4;
        long j2;
        java.lang.Object obj;
        java.lang.String str5;
        java.lang.String certificateType;
        java.lang.String str6;
        long j3;
        C41982rBz c41982rBz2;
        java.lang.String countryOfResidence;
        AbstractC43728ruk abstractC43728ruk;
        if (continuation instanceof GetMultiVendorVerifyResultUseCase$postEncryptVerify$1) {
            getMultiVendorVerifyResultUseCase$postEncryptVerify$1 = (GetMultiVendorVerifyResultUseCase$postEncryptVerify$1) continuation;
            int i = getMultiVendorVerifyResultUseCase$postEncryptVerify$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMultiVendorVerifyResultUseCase$postEncryptVerify$1.label = i - Integer.MIN_VALUE;
            } else {
                getMultiVendorVerifyResultUseCase$postEncryptVerify$1 = new GetMultiVendorVerifyResultUseCase$postEncryptVerify$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = getMultiVendorVerifyResultUseCase$postEncryptVerify$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMultiVendorVerifyResultUseCase$postEncryptVerify$1.label;
        java.lang.String str7 = "";
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                if (num != null) {
                    iIntValue = num.intValue();
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    GetMultiVendorVerifyResultUseCase$postEncryptVerify$2$1 getMultiVendorVerifyResultUseCase$postEncryptVerify$2$1 = new GetMultiVendorVerifyResultUseCase$postEncryptVerify$2$1(fragment, this, null);
                    getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$0 = this;
                    list2 = list;
                    getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$1 = list2;
                    getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$2 = num;
                    num3 = num2;
                    getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$3 = num3;
                    getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$4 = str;
                    getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$5 = pageComponentProfile;
                    map2 = map;
                    getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$6 = map2;
                    getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$7 = str2;
                    getMultiVendorVerifyResultUseCase$postEncryptVerify$1.J$0 = j;
                    getMultiVendorVerifyResultUseCase$postEncryptVerify$1.I$0 = iIntValue;
                    getMultiVendorVerifyResultUseCase$postEncryptVerify$1.label = 1;
                    if (BuildersKt.withContext(main, getMultiVendorVerifyResultUseCase$postEncryptVerify$2$1, getMultiVendorVerifyResultUseCase$postEncryptVerify$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    num4 = num;
                    str3 = str2;
                    pageComponentProfile2 = pageComponentProfile;
                    c41982rBz = this;
                    str4 = str;
                    j2 = j;
                }
                return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(0, "Au10tix verify failed", null, null, 13, null));
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = getMultiVendorVerifyResultUseCase$postEncryptVerify$1.J$0;
                c41982rBz2 = (C41982rBz) getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                str5 = "";
                abstractC43728ruk = (AbstractC43728ruk) objAEQbTJ;
                if (!(abstractC43728ruk instanceof AbstractC43728ruk.ActionBar)) {
                    MultiVendorVerifyResponse multiVendorVerifyResponse = (MultiVendorVerifyResponse) ((AbstractC43728ruk.ActionBar) abstractC43728ruk).KWHzl();
                    c41982rBz2.KWHzl.setEnabled(false);
                    if (multiVendorVerifyResponse.getBizId() < 0) {
                        return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(12345, "Received invalid bizId", null, null, 12, null));
                    }
                    return new AbstractC43728ruk.ActionBar(new MultiVendorResultResp(MultiVendorResultStatus.Timeout, j3, "Verification Timed out"));
                }
                if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
                    java.lang.String message = ((ResponseFailedException) ((AbstractC43728ruk.TaskDescription) abstractC43728ruk).OLrzqt()).getMessage();
                    if (message == null) {
                        message = str5;
                    }
                    return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(12345, message, null, null, 12, null));
                }
                return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(0, "Au10tix verify failed", null, null, 13, null));
            }
            int i3 = getMultiVendorVerifyResultUseCase$postEncryptVerify$1.I$0;
            j2 = getMultiVendorVerifyResultUseCase$postEncryptVerify$1.J$0;
            str3 = (java.lang.String) getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$7;
            map2 = (java.util.HashMap) getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$6;
            pageComponentProfile2 = (PageComponentProfile) getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$5;
            str4 = (java.lang.String) getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$4;
            java.lang.Integer num5 = (java.lang.Integer) getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$3;
            num4 = (java.lang.Integer) getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$2;
            list2 = (java.util.List) getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$1;
            C41982rBz c41982rBz3 = (C41982rBz) getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
            iIntValue = i3;
            c41982rBz = c41982rBz3;
            num3 = num5;
            EventData eventData = new EventData();
            eventData.setAct("event_kyc_flow_submit");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (pageComponentProfile2 == null || (countryOfResidence = pageComponentProfile2.getCountryOfResidence()) == null) {
                obj = objCopydefault;
                str5 = "";
            } else {
                obj = objCopydefault;
                str5 = "";
                str7 = countryOfResidence;
            }
            linkedHashMap.put("attr_1", str7);
            if (pageComponentProfile2 == null || (certificateType = pageComponentProfile2.getCertificateType()) == null) {
                certificateType = str5;
            }
            linkedHashMap.put("attr_2", certificateType);
            if (map2 == null || (str6 = map2.get("refreshType")) == null) {
                str6 = str5;
            }
            linkedHashMap.put("attr_3", str6);
            linkedHashMap.put("attr_5", C33129mqd.gEmmrt(num4));
            eventData.setAttrs(linkedHashMap);
            ReportManager.AEQbTJ.EZpvd(eventData);
            InterfaceC41969rBm interfaceC41969rBm = c41982rBz.OLrzqt;
            int iIntValue2 = num3 != null ? num3.intValue() : 1;
            if (str4 == null) {
                str4 = str5;
            }
            getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$0 = c41982rBz;
            getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$1 = null;
            getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$2 = null;
            getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$3 = null;
            getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$4 = null;
            getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$5 = null;
            getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$6 = null;
            getMultiVendorVerifyResultUseCase$postEncryptVerify$1.L$7 = null;
            getMultiVendorVerifyResultUseCase$postEncryptVerify$1.J$0 = j2;
            getMultiVendorVerifyResultUseCase$postEncryptVerify$1.label = 2;
            objAEQbTJ = interfaceC41969rBm.AEQbTJ(list2, iIntValue, iIntValue2, str4, str3, getMultiVendorVerifyResultUseCase$postEncryptVerify$1);
            java.lang.Object obj2 = obj;
            if (objAEQbTJ == obj2) {
                return obj2;
            }
            j3 = j2;
            c41982rBz2 = c41982rBz;
            abstractC43728ruk = (AbstractC43728ruk) objAEQbTJ;
            if (!(abstractC43728ruk instanceof AbstractC43728ruk.ActionBar)) {
            }
        } catch (java.lang.Throwable th) {
            return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(0, java.lang.String.valueOf(th.getMessage()), null, null, 13, null));
        }
    }

    /* JADX INFO: renamed from: o.rBz$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rBz.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
