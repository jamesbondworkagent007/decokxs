package com.reown.android;

import com.reown.android.internal.common.model.AppMetaDataType;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Core {
    public static final Core INSTANCE = new Core();

    /* JADX INFO: loaded from: classes17.dex */
    public interface Listeners {

        public interface PairingPing extends Listeners {
            void onError(@NotNull Model.Ping.Error error);

            void onSuccess(@NotNull Model.Ping.Success success);
        }
    }

    public static abstract class Model {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.Core.Model.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Model(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Error extends Model {
            public final Throwable throwable;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.throwable;
                }
                return error.copy(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Throwable component1() {
                return this.throwable;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Error copy(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new Error(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.EZpvd(this.throwable, ((Error) obj).throwable);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.throwable.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(throwable=" + this.throwable + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.throwable = th;
            }
        }

        public Model() {
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static abstract class Ping extends Model {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.Core.Model.Ping.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Ping(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: loaded from: classes24.dex */
            public static final class Success extends Ping {
                public final String topic;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = success.topic;
                    }
                    return success.copy(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Success copy(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return new Success(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Success) && Intrinsics.EZpvd((Object) this.topic, (Object) ((Success) obj).topic);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getTopic() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return this.topic.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Success(topic=" + this.topic + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Success(@NotNull String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    this.topic = str;
                }
            }

            public Ping() {
                super(null);
            }

            public static final class Error extends Ping {
                public final Throwable error;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                    if ((i & 1) != 0) {
                        th = error.error;
                    }
                    return error.copy(th);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Throwable component1() {
                    return this.error;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Error copy(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                    return new Error(th);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Error) && Intrinsics.EZpvd(this.error, ((Error) obj).error);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Throwable getError() {
                    return this.error;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return this.error.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Error(error=" + this.error + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Error(@NotNull Throwable th) {
                    super(null);
                    Intrinsics.checkNotNullParameter(th, "");
                    this.error = th;
                }
            }
        }

        public static final class AppMetaData extends Model {
            public final String appLink;
            public final String description;
            public final List<String> icons;
            public final boolean linkMode;
            public final String name;
            public final String redirect;
            public final String url;
            public final String verifyUrl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.description;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.url;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> component4() {
                return this.icons;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component5() {
                return this.redirect;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component6() {
                return this.appLink;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean component7() {
                return this.linkMode;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component8() {
                return this.verifyUrl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AppMetaData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, String str4, String str5, boolean z, String str6) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(list, "");
                return new AppMetaData(str, str2, str3, list, str4, str5, z, str6);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AppMetaData)) {
                    return false;
                }
                AppMetaData appMetaData = (AppMetaData) obj;
                return Intrinsics.EZpvd((Object) this.name, (Object) appMetaData.name) && Intrinsics.EZpvd((Object) this.description, (Object) appMetaData.description) && Intrinsics.EZpvd((Object) this.url, (Object) appMetaData.url) && Intrinsics.EZpvd(this.icons, appMetaData.icons) && Intrinsics.EZpvd((Object) this.redirect, (Object) appMetaData.redirect) && Intrinsics.EZpvd((Object) this.appLink, (Object) appMetaData.appLink) && this.linkMode == appMetaData.linkMode && Intrinsics.EZpvd((Object) this.verifyUrl, (Object) appMetaData.verifyUrl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getAppLink() {
                return this.appLink;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getDescription() {
                return this.description;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> getIcons() {
                return this.icons;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean getLinkMode() {
                return this.linkMode;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getName() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getRedirect() {
                return this.redirect;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getUrl() {
                return this.url;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getVerifyUrl() {
                return this.verifyUrl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.name.hashCode();
                int iHashCode2 = this.description.hashCode();
                int iHashCode3 = this.url.hashCode();
                int iHashCode4 = this.icons.hashCode();
                String str = this.redirect;
                int iHashCode5 = str == null ? 0 : str.hashCode();
                String str2 = this.appLink;
                int iHashCode6 = str2 == null ? 0 : str2.hashCode();
                int iHashCode7 = Boolean.hashCode(this.linkMode);
                String str3 = this.verifyUrl;
                return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str3 != null ? str3.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AppMetaData(name=" + this.name + ", description=" + this.description + ", url=" + this.url + ", icons=" + this.icons + ", redirect=" + this.redirect + ", appLink=" + this.appLink + ", linkMode=" + this.linkMode + ", verifyUrl=" + this.verifyUrl + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0024: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.util.List)
  (r17v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:22) call: com.reown.android.Core.Model.AppMetaData.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
            public /* synthetic */ AppMetaData(String str, String str2, String str3, List list, String str4, String str5, boolean z, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, list, str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : str6);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AppMetaData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, String str4, String str5, boolean z, String str6) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(list, "");
                this.name = str;
                this.description = str2;
                this.url = str3;
                this.icons = list;
                this.redirect = str4;
                this.appLink = str5;
                this.linkMode = z;
                this.verifyUrl = str6;
            }
        }

        public static final class DeletedPairing extends Model {
            public final String reason;
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ DeletedPairing copy$default(DeletedPairing deletedPairing, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = deletedPairing.topic;
                }
                if ((i & 2) != 0) {
                    str2 = deletedPairing.reason;
                }
                return deletedPairing.copy(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DeletedPairing copy(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new DeletedPairing(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DeletedPairing)) {
                    return false;
                }
                DeletedPairing deletedPairing = (DeletedPairing) obj;
                return Intrinsics.EZpvd((Object) this.topic, (Object) deletedPairing.topic) && Intrinsics.EZpvd((Object) this.reason, (Object) deletedPairing.reason);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getReason() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.topic.hashCode() * 31) + this.reason.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "DeletedPairing(topic=" + this.topic + ", reason=" + this.reason + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeletedPairing(@NotNull String str, @NotNull String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.topic = str;
                this.reason = str2;
            }
        }

        public static final class ExpiredPairing extends Model {
            public final Pairing pairing;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ExpiredPairing copy$default(ExpiredPairing expiredPairing, Pairing pairing, int i, Object obj) {
                if ((i & 1) != 0) {
                    pairing = expiredPairing.pairing;
                }
                return expiredPairing.copy(pairing);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Pairing component1() {
                return this.pairing;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ExpiredPairing copy(@NotNull Pairing pairing) {
                Intrinsics.checkNotNullParameter(pairing, "");
                return new ExpiredPairing(pairing);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExpiredPairing) && Intrinsics.EZpvd(this.pairing, ((ExpiredPairing) obj).pairing);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Pairing getPairing() {
                return this.pairing;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.pairing.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ExpiredPairing(pairing=" + this.pairing + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExpiredPairing(@NotNull Pairing pairing) {
                super(null);
                Intrinsics.checkNotNullParameter(pairing, "");
                this.pairing = pairing;
            }
        }

        public static final class PairingState extends Model {
            public final boolean isPairingState;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ PairingState copy$default(PairingState pairingState, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = pairingState.isPairingState;
                }
                return pairingState.copy(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean component1() {
                return this.isPairingState;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PairingState copy(boolean z) {
                return new PairingState(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PairingState) && this.isPairingState == ((PairingState) obj).isPairingState;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Boolean.hashCode(this.isPairingState);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean isPairingState() {
                return this.isPairingState;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "PairingState(isPairingState=" + this.isPairingState + ")";
            }

            public PairingState(boolean z) {
                super(null);
                this.isPairingState = z;
            }
        }

        public static final class Pairing extends Model {
            public final long expiry;
            public final boolean isActive;
            public final AppMetaData peerAppMetaData;
            public final String registeredMethods;
            public final String relayData;
            public final String relayProtocol;
            public final String topic;
            public final String uri;

            public static /* synthetic */ void isActive$annotations() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long component2() {
                return this.expiry;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AppMetaData component3() {
                return this.peerAppMetaData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component4() {
                return this.relayProtocol;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component5() {
                return this.relayData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component6() {
                return this.uri;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean component7() {
                return this.isActive;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component8() {
                return this.registeredMethods;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Pairing copy(@NotNull String str, long j, AppMetaData appMetaData, @NotNull String str2, String str3, @NotNull String str4, boolean z, @NotNull String str5) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                return new Pairing(str, j, appMetaData, str2, str3, str4, z, str5);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Pairing)) {
                    return false;
                }
                Pairing pairing = (Pairing) obj;
                return Intrinsics.EZpvd((Object) this.topic, (Object) pairing.topic) && this.expiry == pairing.expiry && Intrinsics.EZpvd(this.peerAppMetaData, pairing.peerAppMetaData) && Intrinsics.EZpvd((Object) this.relayProtocol, (Object) pairing.relayProtocol) && Intrinsics.EZpvd((Object) this.relayData, (Object) pairing.relayData) && Intrinsics.EZpvd((Object) this.uri, (Object) pairing.uri) && this.isActive == pairing.isActive && Intrinsics.EZpvd((Object) this.registeredMethods, (Object) pairing.registeredMethods);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long getExpiry() {
                return this.expiry;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AppMetaData getPeerAppMetaData() {
                return this.peerAppMetaData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getRegisteredMethods() {
                return this.registeredMethods;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getRelayData() {
                return this.relayData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getRelayProtocol() {
                return this.relayProtocol;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getUri() {
                return this.uri;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.topic.hashCode();
                int iHashCode2 = Long.hashCode(this.expiry);
                AppMetaData appMetaData = this.peerAppMetaData;
                int iHashCode3 = appMetaData == null ? 0 : appMetaData.hashCode();
                int iHashCode4 = this.relayProtocol.hashCode();
                String str = this.relayData;
                return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.uri.hashCode()) * 31) + Boolean.hashCode(this.isActive)) * 31) + this.registeredMethods.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean isActive() {
                return this.isActive;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Pairing(topic=" + this.topic + ", expiry=" + this.expiry + ", peerAppMetaData=" + this.peerAppMetaData + ", relayProtocol=" + this.relayProtocol + ", relayData=" + this.relayData + ", uri=" + this.uri + ", isActive=" + this.isActive + ", registeredMethods=" + this.registeredMethods + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (r13v0 long)
  (wrap:com.reown.android.Core$Model$AppMetaData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.reown.android.Core$Model$AppMetaData) : (r15v0 com.reown.android.Core$Model$AppMetaData))
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 boolean)
  (r20v0 java.lang.String)
 A[MD:(java.lang.String, long, com.reown.android.Core$Model$AppMetaData, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:40) call: com.reown.android.Core.Model.Pairing.<init>(java.lang.String, long, com.reown.android.Core$Model$AppMetaData, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
            public /* synthetic */ Pairing(String str, long j, AppMetaData appMetaData, String str2, String str3, String str4, boolean z, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, j, (i & 4) != 0 ? null : appMetaData, str2, str3, str4, z, str5);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Pairing(@NotNull String str, long j, AppMetaData appMetaData, @NotNull String str2, String str3, @NotNull String str4, boolean z, @NotNull String str5) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                this.topic = str;
                this.expiry = j;
                this.peerAppMetaData = appMetaData;
                this.relayProtocol = str2;
                this.relayData = str3;
                this.uri = str4;
                this.isActive = z;
                this.registeredMethods = str5;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static abstract class Namespace extends Model {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.Core.Model.Namespace.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Namespace(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Namespace() {
                super(null);
            }

            public static final class Proposal extends Namespace {
                public final List<String> chains;
                public final List<String> events;
                public final List<String> methods;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.Core$Model$Namespace$Proposal */
                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Proposal copy$default(Proposal proposal, List list, List list2, List list3, int i, Object obj) {
                    if ((i & 1) != 0) {
                        list = proposal.chains;
                    }
                    if ((i & 2) != 0) {
                        list2 = proposal.methods;
                    }
                    if ((i & 4) != 0) {
                        list3 = proposal.events;
                    }
                    return proposal.copy(list, list2, list3);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component1() {
                    return this.chains;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component2() {
                    return this.methods;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component3() {
                    return this.events;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Proposal copy(List<String> list, @NotNull List<String> list2, @NotNull List<String> list3) {
                    Intrinsics.checkNotNullParameter(list2, "");
                    Intrinsics.checkNotNullParameter(list3, "");
                    return new Proposal(list, list2, list3);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Proposal)) {
                        return false;
                    }
                    Proposal proposal = (Proposal) obj;
                    return Intrinsics.EZpvd(this.chains, proposal.chains) && Intrinsics.EZpvd(this.methods, proposal.methods) && Intrinsics.EZpvd(this.events, proposal.events);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getChains() {
                    return this.chains;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getEvents() {
                    return this.events;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getMethods() {
                    return this.methods;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    List<String> list = this.chains;
                    return ((((list == null ? 0 : list.hashCode()) * 31) + this.methods.hashCode()) * 31) + this.events.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Proposal(chains=" + this.chains + ", methods=" + this.methods + ", events=" + this.events + ")";
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
  (r2v0 java.util.List)
  (r3v0 java.util.List)
 A[MD:(java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:55) call: com.reown.android.Core.Model.Namespace.Proposal.<init>(java.util.List, java.util.List, java.util.List):void type: THIS */
                public /* synthetic */ Proposal(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : list, list2, list3);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Proposal(List<String> list, @NotNull List<String> list2, @NotNull List<String> list3) {
                    super(null);
                    Intrinsics.checkNotNullParameter(list2, "");
                    Intrinsics.checkNotNullParameter(list3, "");
                    this.chains = list;
                    this.methods = list2;
                    this.events = list3;
                }
            }

            /* JADX INFO: loaded from: classes24.dex */
            public static final class Session extends Namespace {
                public final List<String> accounts;
                public final List<String> chains;
                public final List<String> events;
                public final List<String> methods;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.Core$Model$Namespace$Session */
                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Session copy$default(Session session, List list, List list2, List list3, List list4, int i, Object obj) {
                    if ((i & 1) != 0) {
                        list = session.chains;
                    }
                    if ((i & 2) != 0) {
                        list2 = session.accounts;
                    }
                    if ((i & 4) != 0) {
                        list3 = session.methods;
                    }
                    if ((i & 8) != 0) {
                        list4 = session.events;
                    }
                    return session.copy(list, list2, list3, list4);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component1() {
                    return this.chains;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component2() {
                    return this.accounts;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component3() {
                    return this.methods;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component4() {
                    return this.events;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Session copy(List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4) {
                    Intrinsics.checkNotNullParameter(list2, "");
                    Intrinsics.checkNotNullParameter(list3, "");
                    Intrinsics.checkNotNullParameter(list4, "");
                    return new Session(list, list2, list3, list4);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Session)) {
                        return false;
                    }
                    Session session = (Session) obj;
                    return Intrinsics.EZpvd(this.chains, session.chains) && Intrinsics.EZpvd(this.accounts, session.accounts) && Intrinsics.EZpvd(this.methods, session.methods) && Intrinsics.EZpvd(this.events, session.events);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getAccounts() {
                    return this.accounts;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getChains() {
                    return this.chains;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getEvents() {
                    return this.events;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getMethods() {
                    return this.methods;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    List<String> list = this.chains;
                    return ((((((list == null ? 0 : list.hashCode()) * 31) + this.accounts.hashCode()) * 31) + this.methods.hashCode()) * 31) + this.events.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Session(chains=" + this.chains + ", accounts=" + this.accounts + ", methods=" + this.methods + ", events=" + this.events + ")";
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
  (r2v0 java.util.List)
  (r3v0 java.util.List)
  (r4v0 java.util.List)
 A[MD:(java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:61) call: com.reown.android.Core.Model.Namespace.Session.<init>(java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
                public /* synthetic */ Session(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : list, list2, list3, list4);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Session(List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4) {
                    super(null);
                    Intrinsics.checkNotNullParameter(list2, "");
                    Intrinsics.checkNotNullParameter(list3, "");
                    Intrinsics.checkNotNullParameter(list4, "");
                    this.chains = list;
                    this.accounts = list2;
                    this.methods = list3;
                    this.events = list4;
                }
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static abstract class Message extends Model {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.Core.Model.Message.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Message() {
                super(null);
            }

            /* JADX INFO: loaded from: classes24.dex */
            public static final class Simple extends Message {
                public final String body;
                public final String title;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Simple copy$default(Simple simple, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = simple.title;
                    }
                    if ((i & 2) != 0) {
                        str2 = simple.body;
                    }
                    return simple.copy(str, str2);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.title;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.body;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Simple copy(@NotNull String str, @NotNull String str2) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    return new Simple(str, str2);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Simple)) {
                        return false;
                    }
                    Simple simple = (Simple) obj;
                    return Intrinsics.EZpvd((Object) this.title, (Object) simple.title) && Intrinsics.EZpvd((Object) this.body, (Object) simple.body);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getBody() {
                    return this.body;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getTitle() {
                    return this.title;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (this.title.hashCode() * 31) + this.body.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Simple(title=" + this.title + ", body=" + this.body + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Simple(@NotNull String str, @NotNull String str2) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    this.title = str;
                    this.body = str2;
                }
            }

            /* JADX INFO: loaded from: classes24.dex */
            public static final class Notify extends Message {
                public final String body;
                public final String title;
                public final String topic;
                public final String type;
                public final String url;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Notify copy$default(Notify notify, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = notify.title;
                    }
                    if ((i & 2) != 0) {
                        str2 = notify.body;
                    }
                    String str6 = str2;
                    if ((i & 4) != 0) {
                        str3 = notify.url;
                    }
                    String str7 = str3;
                    if ((i & 8) != 0) {
                        str4 = notify.type;
                    }
                    String str8 = str4;
                    if ((i & 16) != 0) {
                        str5 = notify.topic;
                    }
                    return notify.copy(str, str6, str7, str8, str5);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.title;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.body;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component3() {
                    return this.url;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component4() {
                    return this.type;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component5() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Notify copy(@NotNull String str, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str4, "");
                    Intrinsics.checkNotNullParameter(str5, "");
                    return new Notify(str, str2, str3, str4, str5);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Notify)) {
                        return false;
                    }
                    Notify notify = (Notify) obj;
                    return Intrinsics.EZpvd((Object) this.title, (Object) notify.title) && Intrinsics.EZpvd((Object) this.body, (Object) notify.body) && Intrinsics.EZpvd((Object) this.url, (Object) notify.url) && Intrinsics.EZpvd((Object) this.type, (Object) notify.type) && Intrinsics.EZpvd((Object) this.topic, (Object) notify.topic);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getBody() {
                    return this.body;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getTitle() {
                    return this.title;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getTopic() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getType() {
                    return this.type;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getUrl() {
                    return this.url;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = this.title.hashCode();
                    int iHashCode2 = this.body.hashCode();
                    String str = this.url;
                    return (((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode()) * 31) + this.topic.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Notify(title=" + this.title + ", body=" + this.body + ", url=" + this.url + ", type=" + this.type + ", topic=" + this.topic + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Notify(@NotNull String str, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str4, "");
                    Intrinsics.checkNotNullParameter(str5, "");
                    this.title = str;
                    this.body = str2;
                    this.url = str3;
                    this.type = str4;
                    this.topic = str5;
                }
            }

            public static final class SessionProposal extends Message {
                public final String description;
                public final List<String> icons;
                public final long id;
                public final String name;
                public final Map<String, Namespace.Proposal> optionalNamespaces;
                public final String pairingTopic;
                public final Map<String, String> properties;
                public final String proposerPublicKey;
                public final String redirect;
                public final String relayData;
                public final String relayProtocol;
                public final Map<String, Namespace.Proposal> requiredNamespaces;
                public final String url;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long component1() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, String> component10() {
                    return this.properties;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component11() {
                    return this.proposerPublicKey;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component12() {
                    return this.relayProtocol;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component13() {
                    return this.relayData;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.pairingTopic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component3() {
                    return this.name;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component4() {
                    return this.description;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component5() {
                    return this.url;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component6() {
                    return this.icons;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component7() {
                    return this.redirect;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, Namespace.Proposal> component8() {
                    return this.requiredNamespaces;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, Namespace.Proposal> component9() {
                    return this.optionalNamespaces;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final SessionProposal copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, @NotNull String str5, @NotNull Map<String, Namespace.Proposal> map, @NotNull Map<String, Namespace.Proposal> map2, Map<String, String> map3, @NotNull String str6, @NotNull String str7, String str8) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    Intrinsics.checkNotNullParameter(str4, "");
                    Intrinsics.checkNotNullParameter(list, "");
                    Intrinsics.checkNotNullParameter(str5, "");
                    Intrinsics.checkNotNullParameter(map, "");
                    Intrinsics.checkNotNullParameter(map2, "");
                    Intrinsics.checkNotNullParameter(str6, "");
                    Intrinsics.checkNotNullParameter(str7, "");
                    return new SessionProposal(j, str, str2, str3, str4, list, str5, map, map2, map3, str6, str7, str8);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SessionProposal)) {
                        return false;
                    }
                    SessionProposal sessionProposal = (SessionProposal) obj;
                    return this.id == sessionProposal.id && Intrinsics.EZpvd((Object) this.pairingTopic, (Object) sessionProposal.pairingTopic) && Intrinsics.EZpvd((Object) this.name, (Object) sessionProposal.name) && Intrinsics.EZpvd((Object) this.description, (Object) sessionProposal.description) && Intrinsics.EZpvd((Object) this.url, (Object) sessionProposal.url) && Intrinsics.EZpvd(this.icons, sessionProposal.icons) && Intrinsics.EZpvd((Object) this.redirect, (Object) sessionProposal.redirect) && Intrinsics.EZpvd(this.requiredNamespaces, sessionProposal.requiredNamespaces) && Intrinsics.EZpvd(this.optionalNamespaces, sessionProposal.optionalNamespaces) && Intrinsics.EZpvd(this.properties, sessionProposal.properties) && Intrinsics.EZpvd((Object) this.proposerPublicKey, (Object) sessionProposal.proposerPublicKey) && Intrinsics.EZpvd((Object) this.relayProtocol, (Object) sessionProposal.relayProtocol) && Intrinsics.EZpvd((Object) this.relayData, (Object) sessionProposal.relayData);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getDescription() {
                    return this.description;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getIcons() {
                    return this.icons;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long getId() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getName() {
                    return this.name;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, Namespace.Proposal> getOptionalNamespaces() {
                    return this.optionalNamespaces;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getPairingTopic() {
                    return this.pairingTopic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, String> getProperties() {
                    return this.properties;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getProposerPublicKey() {
                    return this.proposerPublicKey;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getRedirect() {
                    return this.redirect;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getRelayData() {
                    return this.relayData;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getRelayProtocol() {
                    return this.relayProtocol;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, Namespace.Proposal> getRequiredNamespaces() {
                    return this.requiredNamespaces;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getUrl() {
                    return this.url;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = Long.hashCode(this.id);
                    int iHashCode2 = this.pairingTopic.hashCode();
                    int iHashCode3 = this.name.hashCode();
                    int iHashCode4 = this.description.hashCode();
                    int iHashCode5 = this.url.hashCode();
                    int iHashCode6 = this.icons.hashCode();
                    int iHashCode7 = this.redirect.hashCode();
                    int iHashCode8 = this.requiredNamespaces.hashCode();
                    int iHashCode9 = this.optionalNamespaces.hashCode();
                    Map<String, String> map = this.properties;
                    int iHashCode10 = map == null ? 0 : map.hashCode();
                    int iHashCode11 = this.proposerPublicKey.hashCode();
                    int iHashCode12 = this.relayProtocol.hashCode();
                    String str = this.relayData;
                    return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str != null ? str.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "SessionProposal(id=" + this.id + ", pairingTopic=" + this.pairingTopic + ", name=" + this.name + ", description=" + this.description + ", url=" + this.url + ", icons=" + this.icons + ", redirect=" + this.redirect + ", requiredNamespaces=" + this.requiredNamespaces + ", optionalNamespaces=" + this.optionalNamespaces + ", properties=" + this.properties + ", proposerPublicKey=" + this.proposerPublicKey + ", relayProtocol=" + this.relayProtocol + ", relayData=" + this.relayData + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SessionProposal(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, @NotNull String str5, @NotNull Map<String, Namespace.Proposal> map, @NotNull Map<String, Namespace.Proposal> map2, Map<String, String> map3, @NotNull String str6, @NotNull String str7, String str8) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    Intrinsics.checkNotNullParameter(str4, "");
                    Intrinsics.checkNotNullParameter(list, "");
                    Intrinsics.checkNotNullParameter(str5, "");
                    Intrinsics.checkNotNullParameter(map, "");
                    Intrinsics.checkNotNullParameter(map2, "");
                    Intrinsics.checkNotNullParameter(str6, "");
                    Intrinsics.checkNotNullParameter(str7, "");
                    this.id = j;
                    this.pairingTopic = str;
                    this.name = str2;
                    this.description = str3;
                    this.url = str4;
                    this.icons = list;
                    this.redirect = str5;
                    this.requiredNamespaces = map;
                    this.optionalNamespaces = map2;
                    this.properties = map3;
                    this.proposerPublicKey = str6;
                    this.relayProtocol = str7;
                    this.relayData = str8;
                }
            }

            public static final class SessionRequest extends Message {
                public final String chainId;
                public final AppMetaData peerMetaData;
                public final JSONRPCRequest request;
                public final String topic;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ SessionRequest copy$default(SessionRequest sessionRequest, String str, String str2, AppMetaData appMetaData, JSONRPCRequest jSONRPCRequest, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = sessionRequest.topic;
                    }
                    if ((i & 2) != 0) {
                        str2 = sessionRequest.chainId;
                    }
                    if ((i & 4) != 0) {
                        appMetaData = sessionRequest.peerMetaData;
                    }
                    if ((i & 8) != 0) {
                        jSONRPCRequest = sessionRequest.request;
                    }
                    return sessionRequest.copy(str, str2, appMetaData, jSONRPCRequest);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.chainId;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final AppMetaData component3() {
                    return this.peerMetaData;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final JSONRPCRequest component4() {
                    return this.request;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final SessionRequest copy(@NotNull String str, String str2, AppMetaData appMetaData, @NotNull JSONRPCRequest jSONRPCRequest) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(jSONRPCRequest, "");
                    return new SessionRequest(str, str2, appMetaData, jSONRPCRequest);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SessionRequest)) {
                        return false;
                    }
                    SessionRequest sessionRequest = (SessionRequest) obj;
                    return Intrinsics.EZpvd((Object) this.topic, (Object) sessionRequest.topic) && Intrinsics.EZpvd((Object) this.chainId, (Object) sessionRequest.chainId) && Intrinsics.EZpvd(this.peerMetaData, sessionRequest.peerMetaData) && Intrinsics.EZpvd(this.request, sessionRequest.request);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getChainId() {
                    return this.chainId;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final AppMetaData getPeerMetaData() {
                    return this.peerMetaData;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final JSONRPCRequest getRequest() {
                    return this.request;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getTopic() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = this.topic.hashCode();
                    String str = this.chainId;
                    int iHashCode2 = str == null ? 0 : str.hashCode();
                    AppMetaData appMetaData = this.peerMetaData;
                    return (((((iHashCode * 31) + iHashCode2) * 31) + (appMetaData != null ? appMetaData.hashCode() : 0)) * 31) + this.request.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "SessionRequest(topic=" + this.topic + ", chainId=" + this.chainId + ", peerMetaData=" + this.peerMetaData + ", request=" + this.request + ")";
                }

                public static final class JSONRPCRequest {
                    public final long id;
                    public final String method;
                    public final String params;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public static /* synthetic */ JSONRPCRequest copy$default(JSONRPCRequest jSONRPCRequest, long j, String str, String str2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            j = jSONRPCRequest.id;
                        }
                        if ((i & 2) != 0) {
                            str = jSONRPCRequest.method;
                        }
                        if ((i & 4) != 0) {
                            str2 = jSONRPCRequest.params;
                        }
                        return jSONRPCRequest.copy(j, str, str2);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final long component1() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component2() {
                        return this.method;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component3() {
                        return this.params;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final JSONRPCRequest copy(long j, @NotNull String str, @NotNull String str2) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        return new JSONRPCRequest(j, str, str2);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof JSONRPCRequest)) {
                            return false;
                        }
                        JSONRPCRequest jSONRPCRequest = (JSONRPCRequest) obj;
                        return this.id == jSONRPCRequest.id && Intrinsics.EZpvd((Object) this.method, (Object) jSONRPCRequest.method) && Intrinsics.EZpvd((Object) this.params, (Object) jSONRPCRequest.params);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final long getId() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getMethod() {
                        return this.method;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getParams() {
                        return this.params;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public int hashCode() {
                        return (((Long.hashCode(this.id) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public String toString() {
                        return "JSONRPCRequest(id=" + this.id + ", method=" + this.method + ", params=" + this.params + ")";
                    }

                    public JSONRPCRequest(long j, @NotNull String str, @NotNull String str2) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        this.id = j;
                        this.method = str;
                        this.params = str2;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SessionRequest(@NotNull String str, String str2, AppMetaData appMetaData, @NotNull JSONRPCRequest jSONRPCRequest) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(jSONRPCRequest, "");
                    this.topic = str;
                    this.chainId = str2;
                    this.peerMetaData = appMetaData;
                    this.request = jSONRPCRequest;
                }
            }

            public static final class SessionAuthenticate extends Message {
                public final long expiry;
                public final long id;
                public final AppMetaData metadata;
                public final PayloadParams payloadParams;
                public final String topic;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long component1() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final AppMetaData component3() {
                    return this.metadata;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final PayloadParams component4() {
                    return this.payloadParams;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long component5() {
                    return this.expiry;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final SessionAuthenticate copy(long j, @NotNull String str, @NotNull AppMetaData appMetaData, @NotNull PayloadParams payloadParams, long j2) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(appMetaData, "");
                    Intrinsics.checkNotNullParameter(payloadParams, "");
                    return new SessionAuthenticate(j, str, appMetaData, payloadParams, j2);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof SessionAuthenticate)) {
                        return false;
                    }
                    SessionAuthenticate sessionAuthenticate = (SessionAuthenticate) obj;
                    return this.id == sessionAuthenticate.id && Intrinsics.EZpvd((Object) this.topic, (Object) sessionAuthenticate.topic) && Intrinsics.EZpvd(this.metadata, sessionAuthenticate.metadata) && Intrinsics.EZpvd(this.payloadParams, sessionAuthenticate.payloadParams) && this.expiry == sessionAuthenticate.expiry;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long getExpiry() {
                    return this.expiry;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long getId() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final AppMetaData getMetadata() {
                    return this.metadata;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final PayloadParams getPayloadParams() {
                    return this.payloadParams;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getTopic() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (((((((Long.hashCode(this.id) * 31) + this.topic.hashCode()) * 31) + this.metadata.hashCode()) * 31) + this.payloadParams.hashCode()) * 31) + Long.hashCode(this.expiry);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "SessionAuthenticate(id=" + this.id + ", topic=" + this.topic + ", metadata=" + this.metadata + ", payloadParams=" + this.payloadParams + ", expiry=" + this.expiry + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SessionAuthenticate(long j, @NotNull String str, @NotNull AppMetaData appMetaData, @NotNull PayloadParams payloadParams, long j2) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(appMetaData, "");
                    Intrinsics.checkNotNullParameter(payloadParams, "");
                    this.id = j;
                    this.topic = str;
                    this.metadata = appMetaData;
                    this.payloadParams = payloadParams;
                    this.expiry = j2;
                }

                public static final class PayloadParams extends Model {
                    public final String aud;
                    public final List<String> chains;
                    public final String domain;
                    public final String exp;
                    public final String iat;
                    public final String nbf;
                    public final String nonce;
                    public final String requestId;
                    public List<String> resources;
                    public final String statement;
                    public final String type;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final List<String> component1() {
                        return this.chains;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final List<String> component10() {
                        return this.resources;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component11() {
                        return this.iat;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component2() {
                        return this.domain;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component3() {
                        return this.nonce;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component4() {
                        return this.aud;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component5() {
                        return this.type;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component6() {
                        return this.nbf;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component7() {
                        return this.exp;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component8() {
                        return this.statement;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component9() {
                        return this.requestId;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final PayloadParams copy(@NotNull List<String> list, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, String str7, String str8, List<String> list2, @NotNull String str9) {
                        Intrinsics.checkNotNullParameter(list, "");
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        Intrinsics.checkNotNullParameter(str3, "");
                        Intrinsics.checkNotNullParameter(str9, "");
                        return new PayloadParams(list, str, str2, str3, str4, str5, str6, str7, str8, list2, str9);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof PayloadParams)) {
                            return false;
                        }
                        PayloadParams payloadParams = (PayloadParams) obj;
                        return Intrinsics.EZpvd(this.chains, payloadParams.chains) && Intrinsics.EZpvd((Object) this.domain, (Object) payloadParams.domain) && Intrinsics.EZpvd((Object) this.nonce, (Object) payloadParams.nonce) && Intrinsics.EZpvd((Object) this.aud, (Object) payloadParams.aud) && Intrinsics.EZpvd((Object) this.type, (Object) payloadParams.type) && Intrinsics.EZpvd((Object) this.nbf, (Object) payloadParams.nbf) && Intrinsics.EZpvd((Object) this.exp, (Object) payloadParams.exp) && Intrinsics.EZpvd((Object) this.statement, (Object) payloadParams.statement) && Intrinsics.EZpvd((Object) this.requestId, (Object) payloadParams.requestId) && Intrinsics.EZpvd(this.resources, payloadParams.resources) && Intrinsics.EZpvd((Object) this.iat, (Object) payloadParams.iat);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getAud() {
                        return this.aud;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final List<String> getChains() {
                        return this.chains;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getDomain() {
                        return this.domain;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getExp() {
                        return this.exp;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getIat() {
                        return this.iat;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getNbf() {
                        return this.nbf;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getNonce() {
                        return this.nonce;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getRequestId() {
                        return this.requestId;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final List<String> getResources() {
                        return this.resources;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getStatement() {
                        return this.statement;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getType() {
                        return this.type;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public int hashCode() {
                        int iHashCode = this.chains.hashCode();
                        int iHashCode2 = this.domain.hashCode();
                        int iHashCode3 = this.nonce.hashCode();
                        int iHashCode4 = this.aud.hashCode();
                        String str = this.type;
                        int iHashCode5 = str == null ? 0 : str.hashCode();
                        String str2 = this.nbf;
                        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
                        String str3 = this.exp;
                        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
                        String str4 = this.statement;
                        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
                        String str5 = this.requestId;
                        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
                        List<String> list = this.resources;
                        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.iat.hashCode();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final void setResources(List<String> list) {
                        this.resources = list;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public String toString() {
                        return "PayloadParams(chains=" + this.chains + ", domain=" + this.domain + ", nonce=" + this.nonce + ", aud=" + this.aud + ", type=" + this.type + ", nbf=" + this.nbf + ", exp=" + this.exp + ", statement=" + this.statement + ", requestId=" + this.requestId + ", resources=" + this.resources + ", iat=" + this.iat + ")";
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public PayloadParams(@NotNull List<String> list, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, String str7, String str8, List<String> list2, @NotNull String str9) {
                        super(null);
                        Intrinsics.checkNotNullParameter(list, "");
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        Intrinsics.checkNotNullParameter(str3, "");
                        Intrinsics.checkNotNullParameter(str9, "");
                        this.chains = list;
                        this.domain = str;
                        this.nonce = str2;
                        this.aud = str3;
                        this.type = str4;
                        this.nbf = str5;
                        this.exp = str6;
                        this.statement = str7;
                        this.requestId = str8;
                        this.resources = list2;
                        this.iat = str9;
                    }
                }
            }
        }
    }

    public static abstract class Params {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.Core.Params.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Params(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Params() {
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Ping extends Params {
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Ping copy$default(Ping ping, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = ping.topic;
                }
                return ping.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Ping copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Ping(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Ping) && Intrinsics.EZpvd((Object) this.topic, (Object) ((Ping) obj).topic);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.topic.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Ping(topic=" + this.topic + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ping(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.topic = str;
            }
        }

        public static final class Pair extends Params {
            public final String uri;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Pair copy$default(Pair pair, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = pair.uri;
                }
                return pair.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.uri;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Pair copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Pair(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Pair) && Intrinsics.EZpvd((Object) this.uri, (Object) ((Pair) obj).uri);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getUri() {
                return this.uri;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.uri.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Pair(uri=" + this.uri + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Pair(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.uri = str;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Disconnect extends Params {
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Disconnect copy$default(Disconnect disconnect, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = disconnect.topic;
                }
                return disconnect.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Disconnect copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Disconnect(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Disconnect) && Intrinsics.EZpvd((Object) this.topic, (Object) ((Disconnect) obj).topic);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.topic.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Disconnect(topic=" + this.topic + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Disconnect(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.topic = str;
            }
        }

        public static final class Delete extends Params {
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Delete copy$default(Delete delete, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = delete.topic;
                }
                return delete.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Delete copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Delete(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Delete) && Intrinsics.EZpvd((Object) this.topic, (Object) ((Delete) obj).topic);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.topic.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Delete(topic=" + this.topic + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Delete(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.topic = str;
            }
        }

        public static final class RequestReceived extends Params {
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ RequestReceived copy$default(RequestReceived requestReceived, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = requestReceived.topic;
                }
                return requestReceived.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RequestReceived copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new RequestReceived(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RequestReceived) && Intrinsics.EZpvd((Object) this.topic, (Object) ((RequestReceived) obj).topic);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.topic.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RequestReceived(topic=" + this.topic + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RequestReceived(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.topic = str;
            }
        }

        public static final class UpdateMetadata extends Params {
            public final AppMetaDataType metaDataType;
            public final Model.AppMetaData metadata;
            public final String topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ UpdateMetadata copy$default(UpdateMetadata updateMetadata, String str, Model.AppMetaData appMetaData, AppMetaDataType appMetaDataType, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = updateMetadata.topic;
                }
                if ((i & 2) != 0) {
                    appMetaData = updateMetadata.metadata;
                }
                if ((i & 4) != 0) {
                    appMetaDataType = updateMetadata.metaDataType;
                }
                return updateMetadata.copy(str, appMetaData, appMetaDataType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Model.AppMetaData component2() {
                return this.metadata;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AppMetaDataType component3() {
                return this.metaDataType;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UpdateMetadata copy(@NotNull String str, @NotNull Model.AppMetaData appMetaData, @NotNull AppMetaDataType appMetaDataType) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(appMetaData, "");
                Intrinsics.checkNotNullParameter(appMetaDataType, "");
                return new UpdateMetadata(str, appMetaData, appMetaDataType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UpdateMetadata)) {
                    return false;
                }
                UpdateMetadata updateMetadata = (UpdateMetadata) obj;
                return Intrinsics.EZpvd((Object) this.topic, (Object) updateMetadata.topic) && Intrinsics.EZpvd(this.metadata, updateMetadata.metadata) && this.metaDataType == updateMetadata.metaDataType;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AppMetaDataType getMetaDataType() {
                return this.metaDataType;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Model.AppMetaData getMetadata() {
                return this.metadata;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.topic.hashCode() * 31) + this.metadata.hashCode()) * 31) + this.metaDataType.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UpdateMetadata(topic=" + this.topic + ", metadata=" + this.metadata + ", metaDataType=" + this.metaDataType + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateMetadata(@NotNull String str, @NotNull Model.AppMetaData appMetaData, @NotNull AppMetaDataType appMetaDataType) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(appMetaData, "");
                Intrinsics.checkNotNullParameter(appMetaDataType, "");
                this.topic = str;
                this.metadata = appMetaData;
                this.metaDataType = appMetaDataType;
            }
        }
    }
}
