package com.okinc.oklive.app.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.okinc.okimcore.model.im.OKCustomMessage;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import o.C56391yDq;
import o.sJU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class OKLiveStreamUpdateMessage extends OKCustomMessage implements sJU<OKLiveStreamUpdateMessage> {
    private LiveStreamUpdateMessage liveStreamUpdate;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OKLiveStreamUpdateMessage> CREATOR = new Parcelable.Creator<OKLiveStreamUpdateMessage>() { // from class: com.okinc.oklive.app.domain.model.OKLiveStreamUpdateMessage$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKLiveStreamUpdateMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKLiveStreamUpdateMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKLiveStreamUpdateMessage[] newArray(int i) {
            return new OKLiveStreamUpdateMessage[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String encodeToRCJson() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveStreamUpdateMessage getLiveStreamUpdate() {
        return this.liveStreamUpdate;
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage
    public boolean isAllowInAppPush() {
        return false;
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage
    public boolean isSystemMessage() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiveStreamUpdate(LiveStreamUpdateMessage liveStreamUpdateMessage) {
        this.liveStreamUpdate = liveStreamUpdateMessage;
    }

    public OKLiveStreamUpdateMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKLiveStreamUpdateMessage(@NotNull Parcel parcel) {
        Object objM7377constructorimpl;
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        String string = parcel.readString();
        LiveStreamUpdateMessage liveStreamUpdateMessage = null;
        liveStreamUpdateMessage = null;
        if (string != null) {
            string = StringsKt__StringsKt.fARcdN((CharSequence) string) ^ true ? string : null;
            if (string != null) {
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl((LiveStreamUpdateMessage) new Gson().fromJson(string, LiveStreamUpdateMessage.class));
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                liveStreamUpdateMessage = (LiveStreamUpdateMessage) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            }
        }
        this.liveStreamUpdate = liveStreamUpdateMessage;
    }

    @Override // com.okinc.okimcore.model.im.OKCustomMessage, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        String json;
        String str = "";
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        LiveStreamUpdateMessage liveStreamUpdateMessage = this.liveStreamUpdate;
        if (liveStreamUpdateMessage != null && (json = new Gson().toJson(liveStreamUpdateMessage)) != null) {
            str = json;
        }
        parcel.writeString(str);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.domain.model.OKLiveStreamUpdateMessage.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: decodeFromRcJson(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: decodeFromRcJson, reason: merged with bridge method [inline-methods] */
    public OKLiveStreamUpdateMessage m6914decodeFromRcJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OKLiveStreamUpdateMessage();
    }

    private final String toUtf8ContentString(String str) {
        Object objM7377constructorimpl;
        if (str == null) {
            return null;
        }
        try {
            Result.Application application = Result.Companion;
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "");
            objM7377constructorimpl = Result.m7377constructorimpl(new String(bytes, charset));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    @Override // o.sJU
    public String encodeToInHouseCustomContent() {
        String utf8ContentString;
        String content = getContent();
        return (content == null || (utf8ContentString = toUtf8ContentString(content)) == null) ? "" : utf8ContentString;
    }

    /* JADX DEBUG: Method merged with bridge method: decodeFromInHouseCustomContent(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.sJU
    public OKLiveStreamUpdateMessage decodeFromInHouseCustomContent(String str) {
        String utf8ContentString;
        Object objM7377constructorimpl;
        if (str == null || (utf8ContentString = toUtf8ContentString(str)) == null) {
            utf8ContentString = "";
        }
        setContent(utf8ContentString);
        LiveStreamUpdateMessage liveStreamUpdateMessage = null;
        if (!StringsKt__StringsKt.fARcdN((CharSequence) utf8ContentString)) {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl((LiveStreamUpdateMessage) new Gson().fromJson(utf8ContentString, LiveStreamUpdateMessage.class));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            liveStreamUpdateMessage = (LiveStreamUpdateMessage) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        }
        this.liveStreamUpdate = liveStreamUpdateMessage;
        return this;
    }
}
