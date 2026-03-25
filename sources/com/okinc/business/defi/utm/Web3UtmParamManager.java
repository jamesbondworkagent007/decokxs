package com.okinc.business.defi.utm;

import android.content.Context;
import com.okinc.core.util.SPUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import o.C13458dMb;
import o.C48787ucK;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56424yEw;
import o.C9678baC;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class Web3UtmParamManager {
    public static final TaskDescription Companion = new TaskDescription(null);

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.utm.Web3UtmParamManager.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ Web3UtmParamManager getInstance$default(TaskDescription taskDescription, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return taskDescription.EZpvd(context);
        }

        public final Web3UtmParamManager EZpvd(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).UeEOUB();
        }
    }

    public final void KWHzl(@NotNull UTMParamCachedBean uTMParamCachedBean) {
        Intrinsics.checkNotNullParameter(uTMParamCachedBean, "");
        try {
            pUU.EZpvd("Web3UtmParamManager", "UTM params update");
            SPUtils.put("SP_KEY_WEB3_UTM_PARAMS", uTMParamCachedBean.toJson(), "Web3UTMParams");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void copydefault() {
        try {
            SPUtils.remove("SP_KEY_WEB3_UTM_PARAMS", "Web3UTMParams");
            pUU.EZpvd("Web3UtmParamManager", "UTM params cache cleared");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final UTMParamCachedBean OLrzqt() {
        try {
            String string = SPUtils.getString("SP_KEY_WEB3_UTM_PARAMS", "", "Web3UTMParams");
            pUU.EZpvd("Web3UtmParamManager", "getUTMParams: content = " + string);
            UTMParamCachedBean.Companion companion = UTMParamCachedBean.Companion;
            Intrinsics.copydefault((Object) string);
            UTMParamCachedBean uTMParamCachedBeanCopydefault = companion.copydefault(string);
            if (uTMParamCachedBeanCopydefault == null) {
                return null;
            }
            long j = 60;
            if (System.currentTimeMillis() - uTMParamCachedBeanCopydefault.getCreatedTime() <= C48787ucK.AEQbTJ.OLrzqt("web3_analytics_strategy.expire", 720L) * j * j * 1000) {
                return uTMParamCachedBeanCopydefault;
            }
            pUU.EZpvd("Web3UtmParamManager", "UTM params expired, clearing cache");
            copydefault();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Serializable
    public static final class UTMParamCachedBean {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final long createdTime;
        private final String ref;
        private final String url;
        private final String utmCampaign;
        private final String utmContent;
        private final String utmMedium;
        private final String utmSource;
        private final String utmTerm;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.utmMedium;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.utmSource;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.utmCampaign;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.utmContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.utmTerm;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component6() {
            return this.createdTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.url;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.ref;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UTMParamCachedBean copy(String str, String str2, String str3, String str4, String str5, long j, @NotNull String str6, String str7) {
            Intrinsics.checkNotNullParameter(str6, "");
            return new UTMParamCachedBean(str, str2, str3, str4, str5, j, str6, str7);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UTMParamCachedBean)) {
                return false;
            }
            UTMParamCachedBean uTMParamCachedBean = (UTMParamCachedBean) obj;
            return Intrinsics.EZpvd((Object) this.utmMedium, (Object) uTMParamCachedBean.utmMedium) && Intrinsics.EZpvd((Object) this.utmSource, (Object) uTMParamCachedBean.utmSource) && Intrinsics.EZpvd((Object) this.utmCampaign, (Object) uTMParamCachedBean.utmCampaign) && Intrinsics.EZpvd((Object) this.utmContent, (Object) uTMParamCachedBean.utmContent) && Intrinsics.EZpvd((Object) this.utmTerm, (Object) uTMParamCachedBean.utmTerm) && this.createdTime == uTMParamCachedBean.createdTime && Intrinsics.EZpvd((Object) this.url, (Object) uTMParamCachedBean.url) && Intrinsics.EZpvd((Object) this.ref, (Object) uTMParamCachedBean.ref);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getCreatedTime() {
            return this.createdTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRef() {
            return this.ref;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUrl() {
            return this.url;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUtmCampaign() {
            return this.utmCampaign;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUtmContent() {
            return this.utmContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUtmMedium() {
            return this.utmMedium;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUtmSource() {
            return this.utmSource;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUtmTerm() {
            return this.utmTerm;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.utmMedium;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.utmSource;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.utmCampaign;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.utmContent;
            int iHashCode4 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.utmTerm;
            int iHashCode5 = str5 == null ? 0 : str5.hashCode();
            int iHashCode6 = Long.hashCode(this.createdTime);
            int iHashCode7 = this.url.hashCode();
            String str6 = this.ref;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str6 != null ? str6.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UTMParamCachedBean(utmMedium=" + this.utmMedium + ", utmSource=" + this.utmSource + ", utmCampaign=" + this.utmCampaign + ", utmContent=" + this.utmContent + ", utmTerm=" + this.utmTerm + ", createdTime=" + this.createdTime + ", url=" + this.url + ", ref=" + this.ref + ")";
        }

        public /* synthetic */ UTMParamCachedBean(int i, String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
            if (96 != (i & 96)) {
                PluginExceptionsKt.throwMissingFieldException(i, 96, Web3UtmParamManager$UTMParamCachedBean$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.utmMedium = null;
            } else {
                this.utmMedium = str;
            }
            if ((i & 2) == 0) {
                this.utmSource = null;
            } else {
                this.utmSource = str2;
            }
            if ((i & 4) == 0) {
                this.utmCampaign = null;
            } else {
                this.utmCampaign = str3;
            }
            if ((i & 8) == 0) {
                this.utmContent = null;
            } else {
                this.utmContent = str4;
            }
            if ((i & 16) == 0) {
                this.utmTerm = null;
            } else {
                this.utmTerm = str5;
            }
            this.createdTime = j;
            this.url = str6;
            if ((i & 128) == 0) {
                this.ref = null;
            } else {
                this.ref = str7;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(UTMParamCachedBean uTMParamCachedBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || uTMParamCachedBean.utmMedium != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, uTMParamCachedBean.utmMedium);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || uTMParamCachedBean.utmSource != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, uTMParamCachedBean.utmSource);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || uTMParamCachedBean.utmCampaign != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, uTMParamCachedBean.utmCampaign);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || uTMParamCachedBean.utmContent != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, uTMParamCachedBean.utmContent);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || uTMParamCachedBean.utmTerm != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, uTMParamCachedBean.utmTerm);
            }
            compositeEncoder.encodeLongElement(serialDescriptor, 5, uTMParamCachedBean.createdTime);
            compositeEncoder.encodeStringElement(serialDescriptor, 6, uTMParamCachedBean.url);
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && uTMParamCachedBean.ref == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, uTMParamCachedBean.ref);
        }

        public UTMParamCachedBean(String str, String str2, String str3, String str4, String str5, long j, @NotNull String str6, String str7) {
            Intrinsics.checkNotNullParameter(str6, "");
            this.utmMedium = str;
            this.utmSource = str2;
            this.utmCampaign = str3;
            this.utmContent = str4;
            this.utmTerm = str5;
            this.createdTime = j;
            this.url = str6;
            this.ref = str7;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (r19v0 long)
  (r21v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String):void (m)] (LINE:91) call: com.okinc.business.defi.utm.Web3UtmParamManager.UTMParamCachedBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ UTMParamCachedBean(String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, j, str6, (i & 128) != 0 ? null : str7);
        }

        public final String toJson() {
            Json.Default r0 = Json.Default;
            r0.getSerializersModule();
            return r0.encodeToString(Companion.serializer(), this);
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.utm.Web3UtmParamManager.UTMParamCachedBean.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<UTMParamCachedBean> serializer() {
                return Web3UtmParamManager$UTMParamCachedBean$$serializer.INSTANCE;
            }

            public final UTMParamCachedBean copydefault(@NotNull String str) {
                Object objM7377constructorimpl;
                Intrinsics.checkNotNullParameter(str, "");
                try {
                    Result.Application application = Result.Companion;
                    Json.Default r0 = Json.Default;
                    r0.getSerializersModule();
                    objM7377constructorimpl = Result.m7377constructorimpl((UTMParamCachedBean) r0.decodeFromString(UTMParamCachedBean.Companion.serializer(), str));
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                return (UTMParamCachedBean) objM7377constructorimpl;
            }
        }

        public final Map<String, String> toUTMMap() {
            Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("utm_medium", this.utmMedium), C56390yDp.OLrzqt("utm_source", this.utmSource), C56390yDp.OLrzqt("utm_campaign", this.utmCampaign), C56390yDp.OLrzqt("utm_content", this.utmContent), C56390yDp.OLrzqt("utm_term", this.utmTerm), C56390yDp.OLrzqt("web3_ref", this.ref));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapGEmmrt.entrySet()) {
                if (((String) entry.getValue()) != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                Intrinsics.copydefault(value);
                linkedHashMap2.put(key, (String) value);
            }
            return linkedHashMap2;
        }
    }
}
