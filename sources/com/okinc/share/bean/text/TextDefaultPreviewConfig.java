package com.okinc.share.bean.text;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.share.api.preview.BasePreviewConfig;
import com.okinc.share.bean.SharePreviewMode;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.image.ImageSource;
import com.okinc.share.bean.text.TextDefaultPreviewConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class TextDefaultPreviewConfig extends BasePreviewConfig {
    public static final int $stable = 0;
    private final SharePreviewMode sharePreviewMode;
    private final ShareType shareType;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final Parcelable.Creator<TextDefaultPreviewConfig> CREATOR = new Parcelable.Creator<TextDefaultPreviewConfig>() { // from class: com.okinc.share.bean.text.TextDefaultPreviewConfig$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TextDefaultPreviewConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TextDefaultPreviewConfig(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TextDefaultPreviewConfig[] newArray(int i) {
            return new TextDefaultPreviewConfig[i];
        }
    };

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.text.TextDefaultPreviewConfig.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TextDefaultPreviewConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.okinc.share.api.preview.BasePreviewConfig, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.preview.ISharePreviewConfig
    public SharePreviewMode getSharePreviewMode() {
        return this.sharePreviewMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.preview.ISharePreviewConfig
    public ShareType getShareType() {
        return this.shareType;
    }

    private TextDefaultPreviewConfig() {
        this.shareType = ShareType.SHARE_TEXT;
        this.sharePreviewMode = SharePreviewMode.DEFAULT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextDefaultPreviewConfig(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.shareType = ShareType.SHARE_TEXT;
        this.sharePreviewMode = SharePreviewMode.DEFAULT;
    }

    @Override // com.okinc.share.api.preview.BasePreviewConfig, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.text.TextDefaultPreviewConfig.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static final Unit OLrzqt(TextDefaultPreviewConfig textDefaultPreviewConfig) {
            Intrinsics.checkNotNullParameter(textDefaultPreviewConfig, "");
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.share.bean.text.TextDefaultPreviewConfig$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TextDefaultPreviewConfig create$default(TaskDescription taskDescription, String str, String str2, ImageSource imageSource, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                imageSource = null;
            }
            if ((i & 8) != 0) {
                function1 = new Function1() { // from class: o.ufR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return TextDefaultPreviewConfig.TaskDescription.OLrzqt((TextDefaultPreviewConfig) obj2);
                    }
                };
            }
            return taskDescription.OLrzqt(str, str2, imageSource, function1);
        }

        public final TextDefaultPreviewConfig OLrzqt(String str, String str2, ImageSource imageSource, @NotNull Function1<? super TextDefaultPreviewConfig, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            TextDefaultPreviewConfig textDefaultPreviewConfig = new TextDefaultPreviewConfig((DefaultConstructorMarker) null);
            textDefaultPreviewConfig.setPreviewTitle(str);
            textDefaultPreviewConfig.setPreviewContent(str2);
            textDefaultPreviewConfig.setPreviewIcon(imageSource);
            function1.invoke(textDefaultPreviewConfig);
            return textDefaultPreviewConfig;
        }
    }
}
