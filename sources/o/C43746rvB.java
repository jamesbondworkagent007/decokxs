package o;

import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderFildValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlifaceResultResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlifaceTokenResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AssetDetail;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AssetValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AutoCompleteAddresses;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ChinaAddressBean;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ChoiceSubInput;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FieldDisplay;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FileReq;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FilesUploadAuthenticationResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FilesUploadResultResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FormatCompleteAddresses;
import com.okinc.ok_kyc_core.data.remote.networkmodel.GroupList;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeSubmitValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MergeAccountResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorTokenResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorVerifyResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OkxGroupedValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OkxValues;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OssImageUrlResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PairInputValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SingleFileUploadResultReq;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SingleFileUploadResultResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Value;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName;
import com.okinc.ok_kyc_core.data.remote.networkmodel.WCResultResp;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$addInfoFormEntry$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$addInfoFormEntry$3$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$deleteInfoFormEntry$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$deleteInfoFormEntry$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getAlifaceAccountToken$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getAlifaceAccountToken$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getAlifaceGlobalResult$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getAlifaceGlobalResult$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getAlifaceResult$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getAlifaceResult$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getAlifaceToken$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getAlifaceToken$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getAuthForFilesUpload$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getAuthForFilesUpload$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getAutoCompleteAddresses$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getAutoCompleteAddresses$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getChinaAddresses$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getChinaAddresses$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getFilesUploadResult$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getFilesUploadResult$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getFormatCompleteAddresses$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getFormatCompleteAddresses$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getInfoFormEntryDetail$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getInfoFormEntryDetail$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getMergeAccountResultNew$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getMergeAccountResultNew$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getMergeAccountSessionId$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getMergeAccountSessionId$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getMultiVendorInformation$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getMultiVendorInformation$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getMultiVendorToken$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getMultiVendorToken$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getOKXGroup$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getOKXGroup$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getOKXGroupedValues$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getOKXGroupedValues$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getOKXValues$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getOKXValues$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getOnboardingInfo$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getOnboardingInfo$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getOssImageUrl$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getOssImageUrl$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getSingleFileUploadOcrResult$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getSingleFileUploadOcrResult$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getSingleFileUploadResult$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getSingleFileUploadResult$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getValues$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getValues$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getWCResult$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$getWCResult$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$kycProgressExit$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$kycProgressExit$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$postEncryptVerify$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$postEncryptVerify$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$postMultiVendorVerify$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$postMultiVendorVerify$2$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$postOnboardingInfo$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$postOnboardingInfo$4$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$postOnboardingInfo$5;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$postOnboardingInfo$8$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$updateInfoFormEntry$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$updateInfoFormEntry$3$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$updateKycInfo$1;
import com.okinc.ok_kyc_core.data.repository.KYCRepositoryImpl$updateKycInfo$2$1;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import o.AbstractC43728ruk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rvB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C43746rvB implements InterfaceC41969rBm {
    public final Function0<InterfaceC41967rBk> EZpvd;
    public final rAQ KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC43709ruR copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends o.rBk> */
    /* JADX WARN: Multi-variable type inference failed */
    public C43746rvB(@NotNull rAQ raq, @NotNull InterfaceC43709ruR interfaceC43709ruR, Function0<? extends InterfaceC41967rBk> function0) {
        Intrinsics.checkNotNullParameter(raq, "");
        Intrinsics.checkNotNullParameter(interfaceC43709ruR, "");
        this.KWHzl = raq;
        this.copydefault = interfaceC43709ruR;
        this.EZpvd = function0;
        this.OLrzqt = C56392yDr.EZpvd(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: o.rvy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43746rvB.KWHzl(this.KWHzl);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.rAQ)
  (r2v0 o.ruR)
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r3v0 kotlin.jvm.functions.Function0))
 A[MD:(o.rAQ, o.ruR, kotlin.jvm.functions.Function0<? extends o.rBk>):void (m)] (LINE:40) call: o.rvB.<init>(o.rAQ, o.ruR, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C43746rvB(rAQ raq, InterfaceC43709ruR interfaceC43709ruR, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(raq, interfaceC43709ruR, (i & 4) != 0 ? null : function0);
    }

    /* JADX INFO: renamed from: o.rvB$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rvB.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final InterfaceC41967rBk copydefault() {
        return (InterfaceC41967rBk) this.OLrzqt.getValue();
    }

    public static final InterfaceC41967rBk KWHzl(C43746rvB c43746rvB) {
        return c43746rvB.AEQbTJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str3, java.lang.String str4, @NotNull Continuation<? super AbstractC43728ruk<OnDemandKYCAppModel, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getOnboardingInfo$1 kYCRepositoryImpl$getOnboardingInfo$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$getOnboardingInfo$1) {
            kYCRepositoryImpl$getOnboardingInfo$1 = (KYCRepositoryImpl$getOnboardingInfo$1) continuation;
            int i = kYCRepositoryImpl$getOnboardingInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getOnboardingInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getOnboardingInfo$1 = new KYCRepositoryImpl$getOnboardingInfo$1(this, continuation);
            }
        }
        KYCRepositoryImpl$getOnboardingInfo$1 kYCRepositoryImpl$getOnboardingInfo$12 = kYCRepositoryImpl$getOnboardingInfo$1;
        java.lang.Object objWithContext = kYCRepositoryImpl$getOnboardingInfo$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getOnboardingInfo$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getOnboardingInfo$2$1 kYCRepositoryImpl$getOnboardingInfo$2$1 = new KYCRepositoryImpl$getOnboardingInfo$2$1(this, str2, str, map, str3, str4, null);
                kYCRepositoryImpl$getOnboardingInfo$12.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getOnboardingInfo$2$1, kYCRepositoryImpl$getOnboardingInfo$12);
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
                java.lang.String str5 = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str5, message2 == null ? "" : message2, null, 8, null));
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

    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v27, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.Map<java.lang.String, java.lang.Object> OLrzqt(java.util.List<? extends rAX<?>> list) {
        java.lang.String str;
        java.lang.String value;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            rAX rax = (rAX) it.next();
            java.lang.String strOLrzqt = rax.OLrzqt();
            java.util.List listSplit$default = strOLrzqt != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strOLrzqt, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : null;
            java.lang.String str2 = "";
            if (listSplit$default == null) {
                str = "";
            } else {
                if (listSplit$default.size() == 3) {
                    str = (java.lang.String) listSplit$default.get(1);
                } else {
                    str = (java.lang.String) listSplit$default.get(0);
                }
                if (str == null) {
                }
            }
            T value2 = rax.getValue();
            if (value2 instanceof java.lang.String) {
                java.lang.String strOLrzqt2 = rax.OLrzqt();
                if (strOLrzqt2 != null && strOLrzqt2.length() != 0) {
                    T value3 = rax.getValue();
                    Intrinsics.copydefault(value3, "");
                    linkedHashMap.put(str, (java.lang.String) value3);
                }
            } else if (value2 instanceof java.lang.Boolean) {
                if (rax.OLrzqt() != null) {
                    linkedHashMap.put(str, value2);
                }
            } else if (value2 instanceof Date) {
                if (rax.OLrzqt() != null) {
                    linkedHashMap.put(str, C43699ruH.KWHzl.OLrzqt((Date) value2));
                }
            } else if (value2 instanceof Value) {
                if (rax.OLrzqt() != null) {
                    T value4 = rax.getValue();
                    Intrinsics.copydefault(value4, "");
                    Value value5 = (Value) value4;
                    java.lang.String value6 = value5.getValue();
                    SubInput subInput = value5.getSubInput();
                    if (subInput != null && (value = subInput.getValue()) != null) {
                        str2 = value;
                    }
                    linkedHashMap.put(str, new ChoiceSubInput(value6, str2));
                }
            } else if (value2 instanceof InputDateRangeValue) {
                if (rax.OLrzqt() != null) {
                    T value7 = rax.getValue();
                    Intrinsics.copydefault(value7, "");
                    InputDateRangeValue inputDateRangeValue = (InputDateRangeValue) value7;
                    java.lang.Long start = inputDateRangeValue.getStart();
                    java.lang.String strOLrzqt3 = start != null ? C43699ruH.KWHzl.OLrzqt(new Date(start.longValue())) : null;
                    java.lang.Long end = inputDateRangeValue.getEnd();
                    linkedHashMap.put(str, new InputDateRangeSubmitValue(strOLrzqt3, end != null ? C43699ruH.KWHzl.OLrzqt(new Date(end.longValue())) : null, inputDateRangeValue.getToPresent()));
                }
            } else if (value2 instanceof AddressCascaderFildValue) {
                if (rax.OLrzqt() != null) {
                    T value8 = rax.getValue();
                    Intrinsics.copydefault(value8, "");
                    linkedHashMap.put(str, (AddressCascaderFildValue) value8);
                }
            } else if (value2 instanceof PairInputValue) {
                if (rax.OLrzqt() != null) {
                    T value9 = rax.getValue();
                    Intrinsics.copydefault(value9, "");
                    linkedHashMap.put(str, (PairInputValue) value9);
                }
            } else if (value2 instanceof java.util.List) {
                T value10 = rax.getValue();
                Intrinsics.copydefault(value10, "");
                java.util.List list2 = (java.util.List) value10;
                if (C33129mqd.KWHzl((java.util.Collection) list2) && (CollectionsKt___CollectionsKt.AuCTelauCTel(list2) instanceof com.okinc.ok_kyc_core.data.remote.networkmodel.File)) {
                    if (rax.OLrzqt() != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj : list2) {
                            Intrinsics.copydefault(obj, "");
                            com.okinc.ok_kyc_core.data.remote.networkmodel.File file = (com.okinc.ok_kyc_core.data.remote.networkmodel.File) obj;
                            arrayList.add(new FileReq(file.getImageId(), file.getImageType(), file.getName()));
                        }
                        linkedHashMap.put(str, arrayList);
                    }
                } else if (C33129mqd.KWHzl((java.util.Collection) list2) && (CollectionsKt___CollectionsKt.AuCTelauCTel(list2) instanceof java.lang.String)) {
                    if (rax.OLrzqt() != null) {
                        linkedHashMap.put(str, list2);
                    }
                } else if (C33129mqd.KWHzl((java.util.Collection) list2) && (CollectionsKt___CollectionsKt.AuCTelauCTel(list2) instanceof FieldDisplay) && rax.OLrzqt() != null) {
                    linkedHashMap.put(str, java.lang.Integer.valueOf(list2.size()));
                }
            } else if (value2 instanceof AssetValue) {
                if (rax.OLrzqt() != null) {
                    T value11 = rax.getValue();
                    Intrinsics.copydefault(value11, "");
                    java.util.ArrayList<AssetDetail> assetList = ((AssetValue) value11).getAssetList();
                    Intrinsics.copydefault(assetList, "");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator<T> it2 = assetList.iterator();
                    while (it2.hasNext()) {
                        java.lang.String id = ((AssetDetail) it2.next()).getId();
                        if (id == null) {
                            id = "";
                        }
                        arrayList2.add(id);
                    }
                    linkedHashMap.put(str, arrayList2);
                }
            } else if (rax.OLrzqt() != null && rax.getValue() != 0) {
                linkedHashMap.put(str, java.lang.String.valueOf(rax.getValue()));
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str4, @NotNull C41957rBa c41957rBa, @NotNull java.util.Map<java.lang.String, java.lang.String> map2, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, @NotNull Continuation<? super AbstractC43728ruk<OnDemandKYCAppModel, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$postOnboardingInfo$1 kYCRepositoryImpl$postOnboardingInfo$1;
        java.lang.String str9;
        java.util.List listSplit$default;
        if (continuation instanceof KYCRepositoryImpl$postOnboardingInfo$1) {
            kYCRepositoryImpl$postOnboardingInfo$1 = (KYCRepositoryImpl$postOnboardingInfo$1) continuation;
            int i = kYCRepositoryImpl$postOnboardingInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$postOnboardingInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$postOnboardingInfo$1 = new KYCRepositoryImpl$postOnboardingInfo$1(this, continuation);
            }
        }
        KYCRepositoryImpl$postOnboardingInfo$1 kYCRepositoryImpl$postOnboardingInfo$12 = kYCRepositoryImpl$postOnboardingInfo$1;
        java.lang.Object objWithContext = kYCRepositoryImpl$postOnboardingInfo$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$postOnboardingInfo$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                java.util.ArrayList<rAX<?>> arrayListOLrzqt = c41957rBa.OLrzqt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (java.lang.Object obj : arrayListOLrzqt) {
                    java.lang.String strEZpvd = ((rAX) obj).EZpvd();
                    if (strEZpvd == null) {
                        strEZpvd = "";
                    }
                    java.lang.Object arrayList = linkedHashMap2.get(strEZpvd);
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                        linkedHashMap2.put(strEZpvd, arrayList);
                    }
                    ((java.util.List) arrayList).add(obj);
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) entry.getKey())) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (java.lang.Object obj2 : iterable) {
                            java.lang.String strOLrzqt = ((rAX) obj2).OLrzqt();
                            if (strOLrzqt == null || (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) strOLrzqt, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null)) == null || (str9 = (java.lang.String) listSplit$default.get(2)) == null) {
                                str9 = "";
                            }
                            java.lang.Object arrayList3 = linkedHashMap3.get(str9);
                            if (arrayList3 == null) {
                                arrayList3 = new java.util.ArrayList();
                                linkedHashMap3.put(str9, arrayList3);
                            }
                            ((java.util.List) arrayList3).add(obj2);
                        }
                        java.util.Iterator it = linkedHashMap3.entrySet().iterator();
                        while (it.hasNext()) {
                            arrayList2.add(OLrzqt((java.util.List<? extends rAX<?>>) ((Map.Entry) it.next()).getValue()));
                        }
                        linkedHashMap.put(entry.getKey(), arrayList2);
                    } else {
                        for (Map.Entry<java.lang.String, java.lang.Object> entry2 : OLrzqt((java.util.List<? extends rAX<?>>) entry.getValue()).entrySet()) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
                if (map != null) {
                    for (Map.Entry<java.lang.String, java.lang.String> entry3 : map.entrySet()) {
                        linkedHashMap.put(entry3.getKey(), entry3.getValue());
                        if (Intrinsics.EZpvd((java.lang.Object) entry3.getKey(), (java.lang.Object) "useEnteredValues")) {
                            try {
                                linkedHashMap.put(entry3.getKey(), C56443yFo.KWHzl(java.lang.Boolean.parseBoolean(entry3.getValue())));
                            } catch (java.lang.Exception e) {
                                pUU.AEQbTJ("useEnteredValues e=" + e);
                            }
                        }
                    }
                }
                if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "kycOneSelectIdV31")) {
                    C43693ruB.copydefault("KYC_New_Flow_IDType_Submit", C56424yEw.AYXKKw(C56390yDp.OLrzqt("id_type", C33129mqd.gEmmrt(linkedHashMap.get("certificateType")))));
                    C43693ruB.copydefault("KYC_NewFlow_IDTypeSubmit_Click", C56424yEw.AYXKKw(C56390yDp.OLrzqt("id_type", C33129mqd.gEmmrt(linkedHashMap.get("certificateType")))));
                }
                if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "kycSelectId")) {
                    C43693ruB.copydefault("KYC_Old_Flow_IDType_Submit", C56424yEw.AYXKKw(C56390yDp.OLrzqt("id_type", C33129mqd.gEmmrt(linkedHashMap.get("certificateType")))));
                }
                if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "eddRevampSofSelect")) {
                    C43693ruB.copydefault("EddRevampSofSelect_Full_Page_Click", C56424yEw.AYXKKw(C56390yDp.OLrzqt("option", C33129mqd.gEmmrt(linkedHashMap.get("sourceOfFund")))));
                }
                if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "eddRevampSowSelect")) {
                    C43693ruB.copydefault("EddRevampSowSelect_Full_Page_Click", C56424yEw.AYXKKw(C56390yDp.OLrzqt("option", C33129mqd.gEmmrt(linkedHashMap.get("eddOccupation")))));
                }
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$postOnboardingInfo$4$1 kYCRepositoryImpl$postOnboardingInfo$4$1 = new KYCRepositoryImpl$postOnboardingInfo$4$1(str4, str3, map2, this, str, str2, linkedHashMap, str5, str7, str8, str6, null);
                kYCRepositoryImpl$postOnboardingInfo$12.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$postOnboardingInfo$4$1, kYCRepositoryImpl$postOnboardingInfo$12);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43728ruk.ActionBar(data);
            }
            pUU.KWHzl("qjf", "response = " + responseData);
            return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), null, 8, null));
        } catch (java.lang.Throwable th) {
            if (th instanceof OKServerException) {
                pUU.KWHzl("FileUpload", "response = OKServerException");
                int code = th.getCode();
                java.lang.String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                java.lang.String message2 = th.getMessage();
                if (message2 == null) {
                    message2 = "";
                }
                return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, message, message2, null, 8, null));
            }
            pUU.KWHzl("FileUpload", "response = else");
            java.lang.String strValueOf = java.lang.String.valueOf(th.getCause());
            java.lang.String message3 = th.getMessage();
            if (message3 == null) {
                message3 = "";
            }
            return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(0, message3, strValueOf, null, 9, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str4, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map2, @NotNull java.util.Map<java.lang.String, java.lang.String> map3, java.lang.String str5, java.lang.String str6, @NotNull Continuation<? super AbstractC43728ruk<OnDemandKYCAppModel, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$postOnboardingInfo$5 kYCRepositoryImpl$postOnboardingInfo$5;
        if (continuation instanceof KYCRepositoryImpl$postOnboardingInfo$5) {
            kYCRepositoryImpl$postOnboardingInfo$5 = (KYCRepositoryImpl$postOnboardingInfo$5) continuation;
            int i = kYCRepositoryImpl$postOnboardingInfo$5.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$postOnboardingInfo$5.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$postOnboardingInfo$5 = new KYCRepositoryImpl$postOnboardingInfo$5(this, continuation);
            }
        }
        KYCRepositoryImpl$postOnboardingInfo$5 kYCRepositoryImpl$postOnboardingInfo$52 = kYCRepositoryImpl$postOnboardingInfo$5;
        java.lang.Object objWithContext = kYCRepositoryImpl$postOnboardingInfo$52.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$postOnboardingInfo$52.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map2.entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                for (Map.Entry<java.lang.String, java.lang.String> entry2 : map.entrySet()) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$postOnboardingInfo$8$1 kYCRepositoryImpl$postOnboardingInfo$8$1 = new KYCRepositoryImpl$postOnboardingInfo$8$1(str4, str3, map3, this, str, str2, linkedHashMap, str5, str6, null);
                kYCRepositoryImpl$postOnboardingInfo$52.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$postOnboardingInfo$8$1, kYCRepositoryImpl$postOnboardingInfo$52);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43728ruk.ActionBar(data);
            }
            pUU.KWHzl("qjf", "response = " + responseData);
            return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), null, 8, null));
        } catch (java.lang.Throwable th) {
            if (th instanceof OKServerException) {
                pUU.KWHzl("FileUpload", "response = OKServerException");
                int code = th.getCode();
                java.lang.String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                java.lang.String message2 = th.getMessage();
                if (message2 == null) {
                    message2 = "";
                }
                return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, message, message2, null, 8, null));
            }
            pUU.KWHzl("FileUpload", "response = else");
            java.lang.String strValueOf = java.lang.String.valueOf(th.getCause());
            java.lang.String message3 = th.getMessage();
            if (message3 == null) {
                message3 = "";
            }
            return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(0, message3, strValueOf, null, 9, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull SingleFileUploadResultReq singleFileUploadResultReq, @NotNull Continuation<? super AbstractC43728ruk<SingleFileUploadResultResp, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getSingleFileUploadResult$1 kYCRepositoryImpl$getSingleFileUploadResult$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$getSingleFileUploadResult$1) {
            kYCRepositoryImpl$getSingleFileUploadResult$1 = (KYCRepositoryImpl$getSingleFileUploadResult$1) continuation;
            int i = kYCRepositoryImpl$getSingleFileUploadResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getSingleFileUploadResult$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getSingleFileUploadResult$1 = new KYCRepositoryImpl$getSingleFileUploadResult$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getSingleFileUploadResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getSingleFileUploadResult$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getSingleFileUploadResult$2$1 kYCRepositoryImpl$getSingleFileUploadResult$2$1 = new KYCRepositoryImpl$getSingleFileUploadResult$2$1(this, singleFileUploadResultReq, null);
                kYCRepositoryImpl$getSingleFileUploadResult$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getSingleFileUploadResult$2$1, kYCRepositoryImpl$getSingleFileUploadResult$1);
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
                java.lang.String str = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str, message2 == null ? "" : message2, null, 8, null));
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull SingleFileUploadResultReq singleFileUploadResultReq, @NotNull Continuation<? super AbstractC43728ruk<SingleFileUploadResultResp, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getSingleFileUploadOcrResult$1 kYCRepositoryImpl$getSingleFileUploadOcrResult$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$getSingleFileUploadOcrResult$1) {
            kYCRepositoryImpl$getSingleFileUploadOcrResult$1 = (KYCRepositoryImpl$getSingleFileUploadOcrResult$1) continuation;
            int i = kYCRepositoryImpl$getSingleFileUploadOcrResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getSingleFileUploadOcrResult$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getSingleFileUploadOcrResult$1 = new KYCRepositoryImpl$getSingleFileUploadOcrResult$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getSingleFileUploadOcrResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getSingleFileUploadOcrResult$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getSingleFileUploadOcrResult$2$1 kYCRepositoryImpl$getSingleFileUploadOcrResult$2$1 = new KYCRepositoryImpl$getSingleFileUploadOcrResult$2$1(this, singleFileUploadResultReq, null);
                kYCRepositoryImpl$getSingleFileUploadOcrResult$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getSingleFileUploadOcrResult$2$1, kYCRepositoryImpl$getSingleFileUploadOcrResult$1);
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
                java.lang.String str = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str, message2 == null ? "" : message2, null, 8, null));
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(int i, @NotNull Continuation<? super AbstractC43728ruk<FilesUploadAuthenticationResp, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getAuthForFilesUpload$1 kYCRepositoryImpl$getAuthForFilesUpload$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$getAuthForFilesUpload$1) {
            kYCRepositoryImpl$getAuthForFilesUpload$1 = (KYCRepositoryImpl$getAuthForFilesUpload$1) continuation;
            int i2 = kYCRepositoryImpl$getAuthForFilesUpload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getAuthForFilesUpload$1.label = i2 - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getAuthForFilesUpload$1 = new KYCRepositoryImpl$getAuthForFilesUpload$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getAuthForFilesUpload$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = kYCRepositoryImpl$getAuthForFilesUpload$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getAuthForFilesUpload$2$1 kYCRepositoryImpl$getAuthForFilesUpload$2$1 = new KYCRepositoryImpl$getAuthForFilesUpload$2$1(this, i, null);
                kYCRepositoryImpl$getAuthForFilesUpload$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getAuthForFilesUpload$2$1, kYCRepositoryImpl$getAuthForFilesUpload$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
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
                java.lang.String str = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str, message2 == null ? "" : message2, null, 8, null));
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.util.List<SingleFileUploadResultReq> list, @NotNull Continuation<? super AbstractC43728ruk<FilesUploadResultResp, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getFilesUploadResult$1 kYCRepositoryImpl$getFilesUploadResult$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$getFilesUploadResult$1) {
            kYCRepositoryImpl$getFilesUploadResult$1 = (KYCRepositoryImpl$getFilesUploadResult$1) continuation;
            int i = kYCRepositoryImpl$getFilesUploadResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getFilesUploadResult$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getFilesUploadResult$1 = new KYCRepositoryImpl$getFilesUploadResult$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getFilesUploadResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getFilesUploadResult$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getFilesUploadResult$2$1 kYCRepositoryImpl$getFilesUploadResult$2$1 = new KYCRepositoryImpl$getFilesUploadResult$2$1(this, list, null);
                kYCRepositoryImpl$getFilesUploadResult$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getFilesUploadResult$2$1, kYCRepositoryImpl$getFilesUploadResult$1);
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
                java.lang.String str = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str, message2 == null ? "" : message2, null, 8, null));
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AhwBna(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43728ruk<? extends java.util.List<Value>, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getValues$1 kYCRepositoryImpl$getValues$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$getValues$1) {
            kYCRepositoryImpl$getValues$1 = (KYCRepositoryImpl$getValues$1) continuation;
            int i = kYCRepositoryImpl$getValues$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getValues$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getValues$1 = new KYCRepositoryImpl$getValues$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getValues$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getValues$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getValues$2$1 kYCRepositoryImpl$getValues$2$1 = new KYCRepositoryImpl$getValues$2$1(this, str, map, null);
                kYCRepositoryImpl$getValues$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getValues$2$1, kYCRepositoryImpl$getValues$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43728ruk<OkxValues, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getOKXValues$1 kYCRepositoryImpl$getOKXValues$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$getOKXValues$1) {
            kYCRepositoryImpl$getOKXValues$1 = (KYCRepositoryImpl$getOKXValues$1) continuation;
            int i = kYCRepositoryImpl$getOKXValues$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getOKXValues$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getOKXValues$1 = new KYCRepositoryImpl$getOKXValues$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getOKXValues$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getOKXValues$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getOKXValues$2$1 kYCRepositoryImpl$getOKXValues$2$1 = new KYCRepositoryImpl$getOKXValues$2$1(this, str, map, null);
                kYCRepositoryImpl$getOKXValues$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getOKXValues$2$1, kYCRepositoryImpl$getOKXValues$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43728ruk<GroupList, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getOKXGroup$1 kYCRepositoryImpl$getOKXGroup$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$getOKXGroup$1) {
            kYCRepositoryImpl$getOKXGroup$1 = (KYCRepositoryImpl$getOKXGroup$1) continuation;
            int i = kYCRepositoryImpl$getOKXGroup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getOKXGroup$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getOKXGroup$1 = new KYCRepositoryImpl$getOKXGroup$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getOKXGroup$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getOKXGroup$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getOKXGroup$2$1 kYCRepositoryImpl$getOKXGroup$2$1 = new KYCRepositoryImpl$getOKXGroup$2$1(this, str, map, null);
                kYCRepositoryImpl$getOKXGroup$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getOKXGroup$2$1, kYCRepositoryImpl$getOKXGroup$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43728ruk<OkxGroupedValue, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getOKXGroupedValues$1 kYCRepositoryImpl$getOKXGroupedValues$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$getOKXGroupedValues$1) {
            kYCRepositoryImpl$getOKXGroupedValues$1 = (KYCRepositoryImpl$getOKXGroupedValues$1) continuation;
            int i = kYCRepositoryImpl$getOKXGroupedValues$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getOKXGroupedValues$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getOKXGroupedValues$1 = new KYCRepositoryImpl$getOKXGroupedValues$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getOKXGroupedValues$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getOKXGroupedValues$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getOKXGroupedValues$2$1 kYCRepositoryImpl$getOKXGroupedValues$2$1 = new KYCRepositoryImpl$getOKXGroupedValues$2$1(this, str, map, null);
                kYCRepositoryImpl$getOKXGroupedValues$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getOKXGroupedValues$2$1, kYCRepositoryImpl$getOKXGroupedValues$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43728ruk<? extends java.util.HashMap<java.lang.String, ValueAndName>, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getInfoFormEntryDetail$1 kYCRepositoryImpl$getInfoFormEntryDetail$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$getInfoFormEntryDetail$1) {
            kYCRepositoryImpl$getInfoFormEntryDetail$1 = (KYCRepositoryImpl$getInfoFormEntryDetail$1) continuation;
            int i = kYCRepositoryImpl$getInfoFormEntryDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getInfoFormEntryDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getInfoFormEntryDetail$1 = new KYCRepositoryImpl$getInfoFormEntryDetail$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getInfoFormEntryDetail$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getInfoFormEntryDetail$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getInfoFormEntryDetail$2$1 kYCRepositoryImpl$getInfoFormEntryDetail$2$1 = new KYCRepositoryImpl$getInfoFormEntryDetail$2$1(this, str, str2, map, null);
                kYCRepositoryImpl$getInfoFormEntryDetail$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getInfoFormEntryDetail$2$1, kYCRepositoryImpl$getInfoFormEntryDetail$1);
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
                java.lang.String str3 = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str3, message2 == null ? "" : message2, null, 8, null));
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull C41957rBa c41957rBa, @NotNull Continuation<? super AbstractC43728ruk<? extends java.util.ArrayList<FieldDisplay>, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$addInfoFormEntry$1 kYCRepositoryImpl$addInfoFormEntry$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        java.lang.String str2;
        java.util.List listSplit$default;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$addInfoFormEntry$1) {
            kYCRepositoryImpl$addInfoFormEntry$1 = (KYCRepositoryImpl$addInfoFormEntry$1) continuation;
            int i = kYCRepositoryImpl$addInfoFormEntry$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$addInfoFormEntry$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$addInfoFormEntry$1 = new KYCRepositoryImpl$addInfoFormEntry$1(this, continuation);
            }
        }
        KYCRepositoryImpl$addInfoFormEntry$1 kYCRepositoryImpl$addInfoFormEntry$12 = kYCRepositoryImpl$addInfoFormEntry$1;
        java.lang.Object objWithContext = kYCRepositoryImpl$addInfoFormEntry$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$addInfoFormEntry$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                java.util.ArrayList<rAX<?>> arrayListOLrzqt = c41957rBa.OLrzqt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (java.lang.Object obj : arrayListOLrzqt) {
                    java.lang.String strEZpvd = ((rAX) obj).EZpvd();
                    if (strEZpvd == null) {
                        strEZpvd = "";
                    }
                    java.lang.Object arrayList = linkedHashMap2.get(strEZpvd);
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                        linkedHashMap2.put(strEZpvd, arrayList);
                    }
                    ((java.util.List) arrayList).add(obj);
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) entry.getKey())) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (java.lang.Object obj2 : iterable) {
                            java.lang.String strOLrzqt = ((rAX) obj2).OLrzqt();
                            if (strOLrzqt == null || (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) strOLrzqt, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null)) == null || (str2 = (java.lang.String) listSplit$default.get(2)) == null) {
                                str2 = "";
                            }
                            java.lang.Object arrayList3 = linkedHashMap3.get(str2);
                            if (arrayList3 == null) {
                                arrayList3 = new java.util.ArrayList();
                                linkedHashMap3.put(str2, arrayList3);
                            }
                            ((java.util.List) arrayList3).add(obj2);
                        }
                        java.util.Iterator it = linkedHashMap3.entrySet().iterator();
                        while (it.hasNext()) {
                            arrayList2.add(OLrzqt((java.util.List<? extends rAX<?>>) ((Map.Entry) it.next()).getValue()));
                        }
                        linkedHashMap.put(entry.getKey(), arrayList2);
                    } else {
                        for (Map.Entry<java.lang.String, java.lang.Object> entry2 : OLrzqt((java.util.List<? extends rAX<?>>) entry.getValue()).entrySet()) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$addInfoFormEntry$3$1 kYCRepositoryImpl$addInfoFormEntry$3$1 = new KYCRepositoryImpl$addInfoFormEntry$3$1(this, str, linkedHashMap, map, null);
                kYCRepositoryImpl$addInfoFormEntry$12.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$addInfoFormEntry$3$1, kYCRepositoryImpl$addInfoFormEntry$12);
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
                java.lang.String str3 = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str3, message2 == null ? "" : message2, null, 8, null));
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull C41957rBa c41957rBa, @NotNull Continuation<? super AbstractC43728ruk<? extends java.util.ArrayList<FieldDisplay>, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$updateInfoFormEntry$1 kYCRepositoryImpl$updateInfoFormEntry$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        java.lang.String str3;
        java.util.List listSplit$default;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$updateInfoFormEntry$1) {
            kYCRepositoryImpl$updateInfoFormEntry$1 = (KYCRepositoryImpl$updateInfoFormEntry$1) continuation;
            int i = kYCRepositoryImpl$updateInfoFormEntry$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$updateInfoFormEntry$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$updateInfoFormEntry$1 = new KYCRepositoryImpl$updateInfoFormEntry$1(this, continuation);
            }
        }
        KYCRepositoryImpl$updateInfoFormEntry$1 kYCRepositoryImpl$updateInfoFormEntry$12 = kYCRepositoryImpl$updateInfoFormEntry$1;
        java.lang.Object objWithContext = kYCRepositoryImpl$updateInfoFormEntry$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$updateInfoFormEntry$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                java.util.ArrayList<rAX<?>> arrayListOLrzqt = c41957rBa.OLrzqt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (java.lang.Object obj : arrayListOLrzqt) {
                    java.lang.String strEZpvd = ((rAX) obj).EZpvd();
                    if (strEZpvd == null) {
                        strEZpvd = "";
                    }
                    java.lang.Object arrayList = linkedHashMap2.get(strEZpvd);
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                        linkedHashMap2.put(strEZpvd, arrayList);
                    }
                    ((java.util.List) arrayList).add(obj);
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) entry.getKey())) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (java.lang.Object obj2 : iterable) {
                            java.lang.String strOLrzqt = ((rAX) obj2).OLrzqt();
                            if (strOLrzqt == null || (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) strOLrzqt, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null)) == null || (str3 = (java.lang.String) listSplit$default.get(2)) == null) {
                                str3 = "";
                            }
                            java.lang.Object arrayList3 = linkedHashMap3.get(str3);
                            if (arrayList3 == null) {
                                arrayList3 = new java.util.ArrayList();
                                linkedHashMap3.put(str3, arrayList3);
                            }
                            ((java.util.List) arrayList3).add(obj2);
                        }
                        java.util.Iterator it = linkedHashMap3.entrySet().iterator();
                        while (it.hasNext()) {
                            arrayList2.add(OLrzqt((java.util.List<? extends rAX<?>>) ((Map.Entry) it.next()).getValue()));
                        }
                        linkedHashMap.put(entry.getKey(), arrayList2);
                    } else {
                        for (Map.Entry<java.lang.String, java.lang.Object> entry2 : OLrzqt((java.util.List<? extends rAX<?>>) entry.getValue()).entrySet()) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$updateInfoFormEntry$3$1 kYCRepositoryImpl$updateInfoFormEntry$3$1 = new KYCRepositoryImpl$updateInfoFormEntry$3$1(this, str, str2, linkedHashMap, map, null);
                kYCRepositoryImpl$updateInfoFormEntry$12.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$updateInfoFormEntry$3$1, kYCRepositoryImpl$updateInfoFormEntry$12);
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
                java.lang.String str4 = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str4, message2 == null ? "" : message2, null, 8, null));
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43728ruk<? extends java.util.ArrayList<FieldDisplay>, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$deleteInfoFormEntry$1 kYCRepositoryImpl$deleteInfoFormEntry$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$deleteInfoFormEntry$1) {
            kYCRepositoryImpl$deleteInfoFormEntry$1 = (KYCRepositoryImpl$deleteInfoFormEntry$1) continuation;
            int i = kYCRepositoryImpl$deleteInfoFormEntry$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$deleteInfoFormEntry$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$deleteInfoFormEntry$1 = new KYCRepositoryImpl$deleteInfoFormEntry$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$deleteInfoFormEntry$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$deleteInfoFormEntry$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$deleteInfoFormEntry$2$1 kYCRepositoryImpl$deleteInfoFormEntry$2$1 = new KYCRepositoryImpl$deleteInfoFormEntry$2$1(this, str, str2, map, null);
                kYCRepositoryImpl$deleteInfoFormEntry$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$deleteInfoFormEntry$2$1, kYCRepositoryImpl$deleteInfoFormEntry$1);
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
                java.lang.String str3 = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str3, message2 == null ? "" : message2, null, 8, null));
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43728ruk<AutoCompleteAddresses, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getAutoCompleteAddresses$1 kYCRepositoryImpl$getAutoCompleteAddresses$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$getAutoCompleteAddresses$1) {
            kYCRepositoryImpl$getAutoCompleteAddresses$1 = (KYCRepositoryImpl$getAutoCompleteAddresses$1) continuation;
            int i = kYCRepositoryImpl$getAutoCompleteAddresses$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getAutoCompleteAddresses$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getAutoCompleteAddresses$1 = new KYCRepositoryImpl$getAutoCompleteAddresses$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getAutoCompleteAddresses$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getAutoCompleteAddresses$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getAutoCompleteAddresses$2$1 kYCRepositoryImpl$getAutoCompleteAddresses$2$1 = new KYCRepositoryImpl$getAutoCompleteAddresses$2$1(this, str, map, null);
                kYCRepositoryImpl$getAutoCompleteAddresses$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getAutoCompleteAddresses$2$1, kYCRepositoryImpl$getAutoCompleteAddresses$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super AbstractC43728ruk<? extends java.util.ArrayList<ChinaAddressBean>, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getChinaAddresses$1 kYCRepositoryImpl$getChinaAddresses$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$getChinaAddresses$1) {
            kYCRepositoryImpl$getChinaAddresses$1 = (KYCRepositoryImpl$getChinaAddresses$1) continuation;
            int i = kYCRepositoryImpl$getChinaAddresses$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getChinaAddresses$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getChinaAddresses$1 = new KYCRepositoryImpl$getChinaAddresses$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getChinaAddresses$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getChinaAddresses$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getChinaAddresses$2$1 kYCRepositoryImpl$getChinaAddresses$2$1 = new KYCRepositoryImpl$getChinaAddresses$2$1(this, str, str2, null);
                kYCRepositoryImpl$getChinaAddresses$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getChinaAddresses$2$1, kYCRepositoryImpl$getChinaAddresses$1);
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
                java.lang.String str3 = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str3, message2 == null ? "" : message2, null, 8, null));
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43728ruk<? extends java.util.List<FormatCompleteAddresses>, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getFormatCompleteAddresses$1 kYCRepositoryImpl$getFormatCompleteAddresses$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$getFormatCompleteAddresses$1) {
            kYCRepositoryImpl$getFormatCompleteAddresses$1 = (KYCRepositoryImpl$getFormatCompleteAddresses$1) continuation;
            int i = kYCRepositoryImpl$getFormatCompleteAddresses$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getFormatCompleteAddresses$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getFormatCompleteAddresses$1 = new KYCRepositoryImpl$getFormatCompleteAddresses$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getFormatCompleteAddresses$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getFormatCompleteAddresses$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getFormatCompleteAddresses$2$1 kYCRepositoryImpl$getFormatCompleteAddresses$2$1 = new KYCRepositoryImpl$getFormatCompleteAddresses$2$1(this, str, map, null);
                kYCRepositoryImpl$getFormatCompleteAddresses$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getFormatCompleteAddresses$2$1, kYCRepositoryImpl$getFormatCompleteAddresses$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object djBIcL(@NotNull java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43728ruk<WCResultResp, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getWCResult$1 kYCRepositoryImpl$getWCResult$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$getWCResult$1) {
            kYCRepositoryImpl$getWCResult$1 = (KYCRepositoryImpl$getWCResult$1) continuation;
            int i = kYCRepositoryImpl$getWCResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getWCResult$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getWCResult$1 = new KYCRepositoryImpl$getWCResult$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getWCResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getWCResult$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getWCResult$2$1 kYCRepositoryImpl$getWCResult$2$1 = new KYCRepositoryImpl$getWCResult$2$1(this, str, map, null);
                kYCRepositoryImpl$getWCResult$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getWCResult$2$1, kYCRepositoryImpl$getWCResult$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43728ruk<java.lang.String, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$kycProgressExit$1 kYCRepositoryImpl$kycProgressExit$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$kycProgressExit$1) {
            kYCRepositoryImpl$kycProgressExit$1 = (KYCRepositoryImpl$kycProgressExit$1) continuation;
            int i = kYCRepositoryImpl$kycProgressExit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$kycProgressExit$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$kycProgressExit$1 = new KYCRepositoryImpl$kycProgressExit$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$kycProgressExit$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$kycProgressExit$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$kycProgressExit$2$1 kYCRepositoryImpl$kycProgressExit$2$1 = new KYCRepositoryImpl$kycProgressExit$2$1(this, map, null);
                kYCRepositoryImpl$kycProgressExit$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$kycProgressExit$2$1, kYCRepositoryImpl$kycProgressExit$1);
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
                java.lang.String str = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str, message2 == null ? "" : message2, null, 8, null));
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$updateKycInfo$1 kYCRepositoryImpl$updateKycInfo$1;
        if (continuation instanceof KYCRepositoryImpl$updateKycInfo$1) {
            kYCRepositoryImpl$updateKycInfo$1 = (KYCRepositoryImpl$updateKycInfo$1) continuation;
            int i = kYCRepositoryImpl$updateKycInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$updateKycInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$updateKycInfo$1 = new KYCRepositoryImpl$updateKycInfo$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$updateKycInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$updateKycInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$updateKycInfo$2$1 kYCRepositoryImpl$updateKycInfo$2$1 = new KYCRepositoryImpl$updateKycInfo$2$1(null);
                kYCRepositoryImpl$updateKycInfo$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$updateKycInfo$2$1, kYCRepositoryImpl$updateKycInfo$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                new AbstractC43728ruk.ActionBar(data);
            } else {
                pUU.KWHzl("qjf", "response = " + responseData);
                new AbstractC43728ruk.TaskDescription(new ResponseFailedException(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            if (th instanceof OKServerException) {
                pUU.KWHzl("FileUpload", "response = OKServerException");
                int code = th.getCode();
                java.lang.String message = th.getMessage();
                java.lang.String str = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str, message2 == null ? "" : message2, null, 8, null));
            } else {
                pUU.KWHzl("FileUpload", "response = else");
                java.lang.String strValueOf = java.lang.String.valueOf(th.getCause());
                java.lang.String message3 = th.getMessage();
                new AbstractC43728ruk.TaskDescription(new ResponseFailedException(0, message3 == null ? "" : message3, strValueOf, null, 9, null));
            }
        }
        return Unit.INSTANCE;
    }

    public final PageComponentAppModel AEQbTJ(JsonElement jsonElement, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (jsonElement == null) {
            return null;
        }
        PageComponentAppModel pageComponentAppModelCopydefault = copydefault(jsonElement);
        PageComponentAppModel pageComponentAppModelKWHzl = KWHzl(pageComponentAppModelCopydefault, jsonElement, str, str2, str3);
        return pageComponentAppModelKWHzl == null ? pageComponentAppModelCopydefault : pageComponentAppModelKWHzl;
    }

    public final PageComponentAppModel KWHzl(PageComponentAppModel pageComponentAppModel, JsonElement jsonElement, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String id;
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            pUU.KWHzl("KYCRepositoryImpl", "Skip experiment: cor/language unavailable, fallback to old flow");
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            if (pageComponentAppModel == null || (id = pageComponentAppModel.getId()) == null) {
                id = "unknown";
            }
            pairArr[0] = C56390yDp.OLrzqt("page_id", id);
            pairArr[1] = C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_NAME, (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? "cor_null" : "language_null");
            pairArr[2] = C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_DETAIL, (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? EopTrackEvent.KEY_COR : "language");
            C43693ruB.copydefault("KYC_Rapidfire_ExperimentFallback_View", C56424yEw.AYXKKw(pairArr));
            return pageComponentAppModel;
        }
        return copydefault().AEQbTJ(pageComponentAppModel, jsonElement, str, str2, str3);
    }

    public final InterfaceC41967rBk AEQbTJ() {
        InterfaceC41967rBk interfaceC41967rBkInvoke;
        Function0<InterfaceC41967rBk> function0 = this.EZpvd;
        return (function0 == null || (interfaceC41967rBkInvoke = function0.invoke()) == null) ? new C43789rvs(this.KWHzl, null, 2, 0 == true ? 1 : 0) : interfaceC41967rBkInvoke;
    }

    public final PageComponentAppModel copydefault(JsonElement jsonElement) {
        Json jsonAEQbTJ = C43776rvf.EZpvd.AEQbTJ();
        jsonAEQbTJ.getSerializersModule();
        return ((PageComponent) jsonAEQbTJ.decodeFromJsonElement(PageComponent.Companion.serializer(), jsonElement)).toAppModel();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43728ruk<MultiVendorTokenResp, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getMultiVendorToken$1 kYCRepositoryImpl$getMultiVendorToken$1;
        if (continuation instanceof KYCRepositoryImpl$getMultiVendorToken$1) {
            kYCRepositoryImpl$getMultiVendorToken$1 = (KYCRepositoryImpl$getMultiVendorToken$1) continuation;
            int i = kYCRepositoryImpl$getMultiVendorToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getMultiVendorToken$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getMultiVendorToken$1 = new KYCRepositoryImpl$getMultiVendorToken$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getMultiVendorToken$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getMultiVendorToken$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getMultiVendorToken$2$1 kYCRepositoryImpl$getMultiVendorToken$2$1 = new KYCRepositoryImpl$getMultiVendorToken$2$1(this, null);
                kYCRepositoryImpl$getMultiVendorToken$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getMultiVendorToken$2$1, kYCRepositoryImpl$getMultiVendorToken$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43728ruk.ActionBar(data);
            }
            pUU.KWHzl("qjf", "response = " + responseData);
            return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), null, 8, null));
        } catch (java.lang.Throwable th) {
            if (th instanceof OKServerException) {
                pUU.KWHzl("FileUpload", "response = OKServerException");
                int code = th.getCode();
                java.lang.String message = th.getMessage();
                java.lang.String str = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str, message2 == null ? "" : message2, null, 8, null));
            }
            pUU.KWHzl("FileUpload", "response = else");
            java.lang.String strValueOf = java.lang.String.valueOf(th.getCause());
            java.lang.String message3 = th.getMessage();
            return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(0, message3 == null ? "" : message3, strValueOf, null, 9, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43728ruk<VendorConfig, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getMultiVendorInformation$1 kYCRepositoryImpl$getMultiVendorInformation$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$getMultiVendorInformation$1) {
            kYCRepositoryImpl$getMultiVendorInformation$1 = (KYCRepositoryImpl$getMultiVendorInformation$1) continuation;
            int i = kYCRepositoryImpl$getMultiVendorInformation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getMultiVendorInformation$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getMultiVendorInformation$1 = new KYCRepositoryImpl$getMultiVendorInformation$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getMultiVendorInformation$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getMultiVendorInformation$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getMultiVendorInformation$2$1 kYCRepositoryImpl$getMultiVendorInformation$2$1 = new KYCRepositoryImpl$getMultiVendorInformation$2$1(this, str, null);
                kYCRepositoryImpl$getMultiVendorInformation$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getMultiVendorInformation$2$1, kYCRepositoryImpl$getMultiVendorInformation$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.util.List<SingleFileUploadUseCase.UploadedFile> list, int i, int i2, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43728ruk<MultiVendorVerifyResponse, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$postMultiVendorVerify$1 kYCRepositoryImpl$postMultiVendorVerify$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$postMultiVendorVerify$1) {
            kYCRepositoryImpl$postMultiVendorVerify$1 = (KYCRepositoryImpl$postMultiVendorVerify$1) continuation;
            int i3 = kYCRepositoryImpl$postMultiVendorVerify$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$postMultiVendorVerify$1.label = i3 - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$postMultiVendorVerify$1 = new KYCRepositoryImpl$postMultiVendorVerify$1(this, continuation);
            }
        }
        KYCRepositoryImpl$postMultiVendorVerify$1 kYCRepositoryImpl$postMultiVendorVerify$12 = kYCRepositoryImpl$postMultiVendorVerify$1;
        java.lang.Object objWithContext = kYCRepositoryImpl$postMultiVendorVerify$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = kYCRepositoryImpl$postMultiVendorVerify$12.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$postMultiVendorVerify$2$1 kYCRepositoryImpl$postMultiVendorVerify$2$1 = new KYCRepositoryImpl$postMultiVendorVerify$2$1(list, i, i2, str, this, null);
                kYCRepositoryImpl$postMultiVendorVerify$12.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$postMultiVendorVerify$2$1, kYCRepositoryImpl$postMultiVendorVerify$12);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i4 != 1) {
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.util.List<SingleFileUploadUseCase.UploadedFile> list, int i, int i2, @NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super AbstractC43728ruk<MultiVendorVerifyResponse, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$postEncryptVerify$1 kYCRepositoryImpl$postEncryptVerify$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$postEncryptVerify$1) {
            kYCRepositoryImpl$postEncryptVerify$1 = (KYCRepositoryImpl$postEncryptVerify$1) continuation;
            int i3 = kYCRepositoryImpl$postEncryptVerify$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$postEncryptVerify$1.label = i3 - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$postEncryptVerify$1 = new KYCRepositoryImpl$postEncryptVerify$1(this, continuation);
            }
        }
        KYCRepositoryImpl$postEncryptVerify$1 kYCRepositoryImpl$postEncryptVerify$12 = kYCRepositoryImpl$postEncryptVerify$1;
        java.lang.Object objWithContext = kYCRepositoryImpl$postEncryptVerify$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = kYCRepositoryImpl$postEncryptVerify$12.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$postEncryptVerify$2$1 kYCRepositoryImpl$postEncryptVerify$2$1 = new KYCRepositoryImpl$postEncryptVerify$2$1(list, i, i2, str, str2, this, null);
                kYCRepositoryImpl$postEncryptVerify$12.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$postEncryptVerify$2$1, kYCRepositoryImpl$postEncryptVerify$12);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i4 != 1) {
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
                java.lang.String str3 = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str3, message2 == null ? "" : message2, null, 8, null));
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC43728ruk<AlifaceTokenResp, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getAlifaceToken$1 kYCRepositoryImpl$getAlifaceToken$1;
        if (continuation instanceof KYCRepositoryImpl$getAlifaceToken$1) {
            kYCRepositoryImpl$getAlifaceToken$1 = (KYCRepositoryImpl$getAlifaceToken$1) continuation;
            int i = kYCRepositoryImpl$getAlifaceToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getAlifaceToken$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getAlifaceToken$1 = new KYCRepositoryImpl$getAlifaceToken$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getAlifaceToken$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getAlifaceToken$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getAlifaceToken$2$1 kYCRepositoryImpl$getAlifaceToken$2$1 = new KYCRepositoryImpl$getAlifaceToken$2$1(this, null);
                kYCRepositoryImpl$getAlifaceToken$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getAlifaceToken$2$1, kYCRepositoryImpl$getAlifaceToken$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43728ruk.ActionBar(data);
            }
            pUU.KWHzl("qjf", "response = " + responseData);
            return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), null, 8, null));
        } catch (java.lang.Throwable th) {
            if (th instanceof OKServerException) {
                pUU.KWHzl("FileUpload", "response = OKServerException");
                int code = th.getCode();
                java.lang.String message = th.getMessage();
                java.lang.String str = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str, message2 == null ? "" : message2, null, 8, null));
            }
            pUU.KWHzl("FileUpload", "response = else");
            java.lang.String strValueOf = java.lang.String.valueOf(th.getCause());
            java.lang.String message3 = th.getMessage();
            return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(0, message3 == null ? "" : message3, strValueOf, null, 9, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43728ruk<AlifaceTokenResp, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getAlifaceAccountToken$1 kYCRepositoryImpl$getAlifaceAccountToken$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$getAlifaceAccountToken$1) {
            kYCRepositoryImpl$getAlifaceAccountToken$1 = (KYCRepositoryImpl$getAlifaceAccountToken$1) continuation;
            int i = kYCRepositoryImpl$getAlifaceAccountToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getAlifaceAccountToken$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getAlifaceAccountToken$1 = new KYCRepositoryImpl$getAlifaceAccountToken$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getAlifaceAccountToken$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getAlifaceAccountToken$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getAlifaceAccountToken$2$1 kYCRepositoryImpl$getAlifaceAccountToken$2$1 = new KYCRepositoryImpl$getAlifaceAccountToken$2$1(this, str, str2, null);
                kYCRepositoryImpl$getAlifaceAccountToken$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getAlifaceAccountToken$2$1, kYCRepositoryImpl$getAlifaceAccountToken$1);
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
                java.lang.String str3 = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str3, message2 == null ? "" : message2, null, 8, null));
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super AbstractC43728ruk<MergeAccountResponse, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getMergeAccountSessionId$1 kYCRepositoryImpl$getMergeAccountSessionId$1;
        if (continuation instanceof KYCRepositoryImpl$getMergeAccountSessionId$1) {
            kYCRepositoryImpl$getMergeAccountSessionId$1 = (KYCRepositoryImpl$getMergeAccountSessionId$1) continuation;
            int i = kYCRepositoryImpl$getMergeAccountSessionId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getMergeAccountSessionId$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getMergeAccountSessionId$1 = new KYCRepositoryImpl$getMergeAccountSessionId$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getMergeAccountSessionId$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getMergeAccountSessionId$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getMergeAccountSessionId$2$1 kYCRepositoryImpl$getMergeAccountSessionId$2$1 = new KYCRepositoryImpl$getMergeAccountSessionId$2$1(this, null);
                kYCRepositoryImpl$getMergeAccountSessionId$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getMergeAccountSessionId$2$1, kYCRepositoryImpl$getMergeAccountSessionId$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43728ruk.ActionBar(data);
            }
            pUU.KWHzl("qjf", "response = " + responseData);
            return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), null, 8, null));
        } catch (java.lang.Throwable th) {
            if (th instanceof OKServerException) {
                pUU.KWHzl("FileUpload", "response = OKServerException");
                int code = th.getCode();
                java.lang.String message = th.getMessage();
                java.lang.String str = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str, message2 == null ? "" : message2, null, 8, null));
            }
            pUU.KWHzl("FileUpload", "response = else");
            java.lang.String strValueOf = java.lang.String.valueOf(th.getCause());
            java.lang.String message3 = th.getMessage();
            return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(0, message3 == null ? "" : message3, strValueOf, null, 9, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC43728ruk<OnDemandKYCAppModel, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getMergeAccountResultNew$1 kYCRepositoryImpl$getMergeAccountResultNew$1;
        if (continuation instanceof KYCRepositoryImpl$getMergeAccountResultNew$1) {
            kYCRepositoryImpl$getMergeAccountResultNew$1 = (KYCRepositoryImpl$getMergeAccountResultNew$1) continuation;
            int i = kYCRepositoryImpl$getMergeAccountResultNew$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getMergeAccountResultNew$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getMergeAccountResultNew$1 = new KYCRepositoryImpl$getMergeAccountResultNew$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getMergeAccountResultNew$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getMergeAccountResultNew$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getMergeAccountResultNew$2$1 kYCRepositoryImpl$getMergeAccountResultNew$2$1 = new KYCRepositoryImpl$getMergeAccountResultNew$2$1(this, null);
                kYCRepositoryImpl$getMergeAccountResultNew$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getMergeAccountResultNew$2$1, kYCRepositoryImpl$getMergeAccountResultNew$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43728ruk.ActionBar(data);
            }
            pUU.KWHzl("qjf", "response = " + responseData);
            return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), null, 8, null));
        } catch (java.lang.Throwable th) {
            if (th instanceof OKServerException) {
                pUU.KWHzl("FileUpload", "response = OKServerException");
                int code = th.getCode();
                java.lang.String message = th.getMessage();
                java.lang.String str = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str, message2 == null ? "" : message2, null, 8, null));
            }
            pUU.KWHzl("FileUpload", "response = else");
            java.lang.String strValueOf = java.lang.String.valueOf(th.getCause());
            java.lang.String message3 = th.getMessage();
            return new AbstractC43728ruk.TaskDescription(new ResponseFailedException(0, message3 == null ? "" : message3, strValueOf, null, 9, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43728ruk<AlifaceResultResp, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getAlifaceResult$1 kYCRepositoryImpl$getAlifaceResult$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$getAlifaceResult$1) {
            kYCRepositoryImpl$getAlifaceResult$1 = (KYCRepositoryImpl$getAlifaceResult$1) continuation;
            int i = kYCRepositoryImpl$getAlifaceResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getAlifaceResult$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getAlifaceResult$1 = new KYCRepositoryImpl$getAlifaceResult$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getAlifaceResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getAlifaceResult$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getAlifaceResult$2$1 kYCRepositoryImpl$getAlifaceResult$2$1 = new KYCRepositoryImpl$getAlifaceResult$2$1(this, str, null);
                kYCRepositoryImpl$getAlifaceResult$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getAlifaceResult$2$1, kYCRepositoryImpl$getAlifaceResult$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(long j, @NotNull Continuation<? super AbstractC43728ruk<OssImageUrlResp, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getOssImageUrl$1 kYCRepositoryImpl$getOssImageUrl$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$getOssImageUrl$1) {
            kYCRepositoryImpl$getOssImageUrl$1 = (KYCRepositoryImpl$getOssImageUrl$1) continuation;
            int i = kYCRepositoryImpl$getOssImageUrl$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getOssImageUrl$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getOssImageUrl$1 = new KYCRepositoryImpl$getOssImageUrl$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getOssImageUrl$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getOssImageUrl$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getOssImageUrl$2$1 kYCRepositoryImpl$getOssImageUrl$2$1 = new KYCRepositoryImpl$getOssImageUrl$2$1(this, j, null);
                kYCRepositoryImpl$getOssImageUrl$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getOssImageUrl$2$1, kYCRepositoryImpl$getOssImageUrl$1);
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
                java.lang.String str = message == null ? "" : message;
                java.lang.String message2 = th.getMessage();
                taskDescription = new AbstractC43728ruk.TaskDescription(new ResponseFailedException(code, str, message2 == null ? "" : message2, null, 8, null));
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC41969rBm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43728ruk<AlifaceResultResp, ResponseFailedException>> continuation) throws java.lang.Throwable {
        KYCRepositoryImpl$getAlifaceGlobalResult$1 kYCRepositoryImpl$getAlifaceGlobalResult$1;
        AbstractC43728ruk.TaskDescription taskDescription;
        ResponseData responseData;
        if (continuation instanceof KYCRepositoryImpl$getAlifaceGlobalResult$1) {
            kYCRepositoryImpl$getAlifaceGlobalResult$1 = (KYCRepositoryImpl$getAlifaceGlobalResult$1) continuation;
            int i = kYCRepositoryImpl$getAlifaceGlobalResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kYCRepositoryImpl$getAlifaceGlobalResult$1.label = i - Integer.MIN_VALUE;
            } else {
                kYCRepositoryImpl$getAlifaceGlobalResult$1 = new KYCRepositoryImpl$getAlifaceGlobalResult$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = kYCRepositoryImpl$getAlifaceGlobalResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kYCRepositoryImpl$getAlifaceGlobalResult$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcherAEQbTJ = this.KWHzl.AEQbTJ();
                KYCRepositoryImpl$getAlifaceGlobalResult$2$1 kYCRepositoryImpl$getAlifaceGlobalResult$2$1 = new KYCRepositoryImpl$getAlifaceGlobalResult$2$1(this, str, null);
                kYCRepositoryImpl$getAlifaceGlobalResult$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, kYCRepositoryImpl$getAlifaceGlobalResult$2$1, kYCRepositoryImpl$getAlifaceGlobalResult$1);
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
}
