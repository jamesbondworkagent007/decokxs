package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.okinc.nft.ui.mediapicker.data.bean.MediaInfo;
import com.okinc.nft.ui.mediapicker.data.constants.MediaPickerType;
import kotlin.jvm.internal.Intrinsics;
import o.C43471rps;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rtx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C43688rtx extends AbstractC43310rmq<MediaInfo, AbstractC43436rpJ> {
    public final java.lang.String AEQbTJ;
    public final int AYXKKw;
    public final int AhwBna;
    public final android.content.Context EZpvd;
    public InterfaceC43645rtG KWHzl;
    public final FragmentActivity OLrzqt;
    public java.lang.Integer copydefault;
    public java.lang.String djBIcL;
    public final C43644rtF valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C43471rps.TaskDescription.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C43468rpp.KWHzl;
    }

    public C43688rtx(int i, java.lang.String str, android.content.Context context, @NotNull C43644rtF c43644rtF, FragmentActivity fragmentActivity, int i2, InterfaceC43645rtG interfaceC43645rtG) {
        Intrinsics.checkNotNullParameter(c43644rtF, "");
        this.AYXKKw = i;
        this.AEQbTJ = str;
        this.EZpvd = context;
        this.valueOf = c43644rtF;
        this.OLrzqt = fragmentActivity;
        this.AhwBna = i2;
        this.copydefault = 1;
        this.djBIcL = str;
        this.copydefault = java.lang.Integer.valueOf(i);
        this.KWHzl = interfaceC43645rtG;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC43436rpJ> c43312rms, @NotNull final MediaInfo mediaInfo) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(mediaInfo, "");
        super.onBindViewHolder((C43312rms) c43312rms, mediaInfo);
        ViewGroup.LayoutParams layoutParams = ((AbstractC43436rpJ) c43312rms.OLrzqt()).AEQbTJ.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams, "");
        int i = this.AhwBna;
        layoutParams.height = i;
        layoutParams.width = i;
        ViewGroup.LayoutParams layoutParams2 = ((AbstractC43436rpJ) c43312rms.OLrzqt()).OLrzqt.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams2, "");
        int i2 = this.AhwBna;
        layoutParams2.height = i2;
        layoutParams2.width = i2;
        android.content.Context context = this.EZpvd;
        if (context != null) {
            C5335Nt<android.graphics.Bitmap> c5335NtEZpvd = Glide.AEQbTJ(context).EZpvd();
            C5448Sc c5448Sc = new C5448Sc();
            int i3 = this.AhwBna;
        }
        c43312rms.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.rty
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C43688rtx.copydefault(this.OLrzqt, mediaInfo, view);
            }
        });
        java.lang.Integer num = this.copydefault;
        if (num != null && num.intValue() == 2) {
            ((AbstractC43436rpJ) c43312rms.OLrzqt()).copydefault.setVisibility(0);
            ((AbstractC43436rpJ) c43312rms.OLrzqt()).EZpvd.setVisibility(0);
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            java.lang.String str = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(timeUnit.toMinutes(mediaInfo.AEQbTJ())), java.lang.Long.valueOf(timeUnit.toSeconds(mediaInfo.AEQbTJ()) - java.util.concurrent.TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(mediaInfo.AEQbTJ())))}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "");
            ((AbstractC43436rpJ) c43312rms.OLrzqt()).EZpvd.setText(str);
        } else {
            ((AbstractC43436rpJ) c43312rms.OLrzqt()).EZpvd.setVisibility(8);
            ((AbstractC43436rpJ) c43312rms.OLrzqt()).copydefault.setVisibility(8);
        }
        if (C59449zhJ.equals$default(this.djBIcL, mediaInfo.OLrzqt(), false, 2, null)) {
            ((AbstractC43436rpJ) c43312rms.OLrzqt()).KWHzl.setVisibility(0);
            ((AbstractC43436rpJ) c43312rms.OLrzqt()).valueOf.setVisibility(0);
        } else {
            ((AbstractC43436rpJ) c43312rms.OLrzqt()).KWHzl.setVisibility(8);
            ((AbstractC43436rpJ) c43312rms.OLrzqt()).valueOf.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: o.rtx$Activity */
    public static final class Activity extends C5451Sf {
        public final /* synthetic */ C43312rms<AbstractC43436rpJ> AYXKKw;
        public final /* synthetic */ android.content.Context isConnected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(android.content.Context context, C43312rms<AbstractC43436rpJ> c43312rms, android.widget.ImageView imageView) {
            super(imageView);
            this.isConnected = context;
            this.AYXKKw = c43312rms;
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
        @Override // o.C5451Sf, o.AbstractC5458Sm
        /* JADX INFO: renamed from: EZpvd */
        public void AEQbTJ(android.graphics.Bitmap bitmap) {
            RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(C43688rtx.this.EZpvd.getResources(), bitmap);
            Intrinsics.checkNotNullExpressionValue(roundedBitmapDrawableCreate, "");
            roundedBitmapDrawableCreate.setCornerRadius(C33052mpF.AEQbTJ(2.0f, this.isConnected));
            ((AbstractC43436rpJ) this.AYXKKw.OLrzqt()).OLrzqt.setImageDrawable(roundedBitmapDrawableCreate);
        }
    }

    public static final void copydefault(C43688rtx c43688rtx, MediaInfo mediaInfo, android.view.View view) {
        InterfaceC43645rtG interfaceC43645rtG;
        if (c43688rtx.OLrzqt != null) {
            if (mediaInfo.AhwBna() == MediaPickerType.TYPE_IMAGE) {
                InterfaceC43645rtG interfaceC43645rtG2 = c43688rtx.KWHzl;
                if (interfaceC43645rtG2 != null) {
                    java.lang.String strOLrzqt = mediaInfo.OLrzqt();
                    Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
                    java.lang.String strEZpvd = mediaInfo.EZpvd();
                    Intrinsics.checkNotNullExpressionValue(strEZpvd, "");
                    long jCopydefault = mediaInfo.copydefault();
                    java.lang.String strGEmmrt = mediaInfo.gEmmrt();
                    Intrinsics.checkNotNullExpressionValue(strGEmmrt, "");
                    interfaceC43645rtG2.copydefault(1, strOLrzqt, strEZpvd, jCopydefault, strGEmmrt);
                    return;
                }
                return;
            }
            if (mediaInfo.AhwBna() != MediaPickerType.TYPE_VIDEO || (interfaceC43645rtG = c43688rtx.KWHzl) == null) {
                return;
            }
            java.lang.String strOLrzqt2 = mediaInfo.OLrzqt();
            Intrinsics.checkNotNullExpressionValue(strOLrzqt2, "");
            java.lang.String strEZpvd2 = mediaInfo.EZpvd();
            Intrinsics.checkNotNullExpressionValue(strEZpvd2, "");
            long jCopydefault2 = mediaInfo.copydefault();
            java.lang.String strGEmmrt2 = mediaInfo.gEmmrt();
            Intrinsics.checkNotNullExpressionValue(strGEmmrt2, "");
            interfaceC43645rtG.copydefault(2, strOLrzqt2, strEZpvd2, jCopydefault2, strGEmmrt2);
        }
    }
}
