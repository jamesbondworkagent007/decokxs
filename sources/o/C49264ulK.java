package o;

import com.okinc.share.platforms.SharePlatform;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48931uew;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ulK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49264ulK extends AbstractC43310rmq<SharePlatform, AbstractC49032ugr> {
    public static final Activity Companion = new Activity(null);

    /* JADX INFO: renamed from: o.ulK$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SharePlatform.values().length];
            try {
                iArr[SharePlatform.MORE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SharePlatform.SAVE_IMAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SharePlatform.LINK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C48931uew.Application.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C48927ues.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.ulK$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ulK.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC49032ugr> c43312rms, @NotNull SharePlatform sharePlatform) {
        java.lang.CharSequence charSequenceOLrzqt;
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        super.onBindViewHolder((C43312rms) c43312rms, sharePlatform);
        android.content.Context context = c43312rms.itemView.getContext();
        android.view.View view = c43312rms.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        OLrzqt(sharePlatform, view);
        InterfaceC49121uia interfaceC49121uiaAEQbTJ = C49098uiD.OLrzqt.AEQbTJ(sharePlatform);
        AbstractC49032ugr abstractC49032ugr = (AbstractC49032ugr) c43312rms.OLrzqt();
        android.widget.TextView textView = abstractC49032ugr.AEQbTJ;
        android.graphics.drawable.Drawable drawableAEQbTJ = null;
        if (interfaceC49121uiaAEQbTJ != null) {
            Intrinsics.copydefault(context);
            charSequenceOLrzqt = interfaceC49121uiaAEQbTJ.OLrzqt(context);
        } else {
            charSequenceOLrzqt = null;
        }
        textView.setText(charSequenceOLrzqt);
        android.widget.ImageView imageView = abstractC49032ugr.OLrzqt;
        if (interfaceC49121uiaAEQbTJ != null) {
            Intrinsics.copydefault(context);
            drawableAEQbTJ = interfaceC49121uiaAEQbTJ.AEQbTJ(context);
        }
        imageView.setImageDrawable(drawableAEQbTJ);
    }

    public final void OLrzqt(SharePlatform sharePlatform, android.view.View view) {
        int i = Application.KWHzl[sharePlatform.ordinal()];
        if (i == 1) {
            view.setContentDescription("moreItem");
            return;
        }
        if (i == 2) {
            view.setContentDescription("saveImageItem");
        } else if (i == 3) {
            view.setContentDescription("copyLinkItem");
        } else {
            view.setContentDescription(null);
        }
    }
}
