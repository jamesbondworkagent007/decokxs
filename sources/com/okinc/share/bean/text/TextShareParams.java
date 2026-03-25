package com.okinc.share.bean.text;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.share.api.params.BaseShareParams;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.text.TextShareParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class TextShareParams extends BaseShareParams {
    public static final int $stable = 0;
    private final ShareType shareType;
    public static final Application Companion = new Application(null);
    public static final Parcelable.Creator<TextShareParams> CREATOR = new Parcelable.Creator<TextShareParams>() { // from class: com.okinc.share.bean.text.TextShareParams$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TextShareParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TextShareParams(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TextShareParams[] newArray(int i) {
            return new TextShareParams[i];
        }
    };

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.text.TextShareParams.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TextShareParams(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.params.IShareParams
    public ShareType getShareType() {
        return this.shareType;
    }

    private TextShareParams() {
        this.shareType = ShareType.SHARE_TEXT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextShareParams(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.shareType = ShareType.SHARE_TEXT;
    }

    @Override // com.okinc.share.api.params.BaseShareParams, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.text.TextShareParams.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static final Unit copydefault(TextShareParams textShareParams) {
            Intrinsics.checkNotNullParameter(textShareParams, "");
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.share.bean.text.TextShareParams$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TextShareParams create$default(Application application, String str, String str2, Function1 function1, int i, Object obj) {
            if ((i & 4) != 0) {
                function1 = new Function1() { // from class: o.ufV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return TextShareParams.Application.copydefault((TextShareParams) obj2);
                    }
                };
            }
            return application.KWHzl(str, str2, function1);
        }

        public final TextShareParams KWHzl(@NotNull String str, @NotNull String str2, @NotNull Function1<? super TextShareParams, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            TextShareParams textShareParams = new TextShareParams((DefaultConstructorMarker) null);
            textShareParams.setTitle(str);
            textShareParams.setBody(str2);
            function1.invoke(textShareParams);
            return textShareParams;
        }
    }
}
