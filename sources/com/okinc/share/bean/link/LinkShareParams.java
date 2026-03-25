package com.okinc.share.bean.link;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.share.api.params.BaseShareParams;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.image.ImageSource;
import com.okinc.share.bean.link.LinkShareParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class LinkShareParams extends BaseShareParams {
    private ImageSource linkIconImageSource;
    public String linkUrl;
    private final ShareType shareType;
    public static final Activity Companion = new Activity(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LinkShareParams> CREATOR = new Parcelable.Creator<LinkShareParams>() { // from class: com.okinc.share.bean.link.LinkShareParams$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LinkShareParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LinkShareParams(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LinkShareParams[] newArray(int i) {
            return new LinkShareParams[i];
        }
    };

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.link.LinkShareParams.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LinkShareParams(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageSource getLinkIconImageSource() {
        return this.linkIconImageSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.share.api.params.IShareParams
    public ShareType getShareType() {
        return this.shareType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinkIconImageSource(ImageSource imageSource) {
        this.linkIconImageSource = imageSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinkUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.linkUrl = str;
    }

    public final String getLinkUrl() {
        String str = this.linkUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    private LinkShareParams() {
        this.shareType = ShareType.SHARE_WEBPAGE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkShareParams(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.shareType = ShareType.SHARE_WEBPAGE;
        String string = parcel.readString();
        setLinkUrl(string != null ? string : "");
        this.linkIconImageSource = (ImageSource) parcel.readParcelable(ImageSource.class.getClassLoader());
    }

    @Override // com.okinc.share.api.params.BaseShareParams, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(getLinkUrl());
        parcel.writeParcelable(this.linkIconImageSource, i);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.link.LinkShareParams.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static final Unit AEQbTJ(LinkShareParams linkShareParams) {
            Intrinsics.checkNotNullParameter(linkShareParams, "");
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.share.bean.link.LinkShareParams$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LinkShareParams create$default(Activity activity, String str, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                function1 = new Function1() { // from class: o.ufQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return LinkShareParams.Activity.AEQbTJ((LinkShareParams) obj2);
                    }
                };
            }
            return activity.AEQbTJ(str, function1);
        }

        public final LinkShareParams AEQbTJ(@NotNull String str, @NotNull Function1<? super LinkShareParams, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            LinkShareParams linkShareParams = new LinkShareParams((DefaultConstructorMarker) null);
            linkShareParams.setLinkUrl(str);
            function1.invoke(linkShareParams);
            return linkShareParams;
        }
    }
}
