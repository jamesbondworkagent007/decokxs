package o;

import android.graphics.drawable.GradientDrawable;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.find_ui.data.ListType;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34845nkD extends AbstractC59533zio<C34928nlh, Application> {
    public final android.content.Context OLrzqt;

    /* JADX INFO: renamed from: o.nkD$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ListType.values().length];
            try {
                iArr[ListType.BUYXLARGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ListType.BUYLARGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ListType.BUYMID.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ListType.BUYSMALL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[ListType.SELLXLARGE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[ListType.SELLLARGE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[ListType.SELLMID.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[ListType.SELLSMALL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            EZpvd = iArr;
        }
    }

    public C34845nkD(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = context;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.djSkpj, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new Application(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull C34928nlh c34928nlh) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(c34928nlh, "");
        if (c34928nlh.EZpvd()) {
            android.widget.TextView textViewCopydefault = application.copydefault();
            if (textViewCopydefault != null) {
                textViewCopydefault.setTypeface(C55051xce.OLrzqt.AEQbTJ());
            }
            android.widget.TextView textViewKWHzl = application.KWHzl();
            if (textViewKWHzl != null) {
                textViewKWHzl.setTypeface(C55051xce.OLrzqt.AEQbTJ());
            }
        } else {
            android.widget.TextView textViewCopydefault2 = application.copydefault();
            if (textViewCopydefault2 != null) {
                textViewCopydefault2.setTypeface(C55051xce.OLrzqt.valueOf());
            }
            android.widget.TextView textViewKWHzl2 = application.KWHzl();
            if (textViewKWHzl2 != null) {
                textViewKWHzl2.setTypeface(C55051xce.OLrzqt.valueOf());
            }
        }
        android.widget.TextView textViewCopydefault3 = application.copydefault();
        if (textViewCopydefault3 != null) {
            textViewCopydefault3.setText(new C54536xML().OLrzqt(c34928nlh.copydefault()));
        }
        ListType listTypeKWHzl = c34928nlh.KWHzl();
        TaskDescription taskDescriptionAEQbTJ = listTypeKWHzl != null ? AEQbTJ(listTypeKWHzl) : null;
        if (taskDescriptionAEQbTJ != null) {
            android.widget.TextView textViewCopydefault4 = application.copydefault();
            if (textViewCopydefault4 != null) {
                textViewCopydefault4.setTextColor(taskDescriptionAEQbTJ.EZpvd());
            }
            android.widget.TextView textViewKWHzl3 = application.KWHzl();
            if (textViewKWHzl3 != null) {
                textViewKWHzl3.setText(taskDescriptionAEQbTJ.KWHzl());
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(this.OLrzqt.getResources().getDimensionPixelSize(qZH.Application.OLrzqt));
            gradientDrawable.setColor(taskDescriptionAEQbTJ.OLrzqt());
            android.view.View viewEZpvd = application.EZpvd();
            if (viewEZpvd != null) {
                viewEZpvd.setBackground(gradientDrawable);
            }
            C35139npg c35139npgAEQbTJ = application.AEQbTJ();
            if (c35139npgAEQbTJ != null) {
                c35139npgAEQbTJ.setColorAndPercent(taskDescriptionAEQbTJ.AEQbTJ(), java.lang.Math.pow(C33129mqd.AEQbTJ(c34928nlh.OLrzqt()), 0.3333333333333333d));
            }
        }
    }

    public final TaskDescription AEQbTJ(ListType listType) {
        TaskDescription taskDescription;
        switch (StateListAnimator.EZpvd[listType.ordinal()]) {
            case 1:
                int iCopydefault = C33508mxl.copydefault(this.OLrzqt);
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.zlzhuY);
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                taskDescription = new TaskDescription(iCopydefault, strAYXKKw, c33512mxp.zLjUOn(this.OLrzqt, 1.0f), C33512mxp.tradeRiseTagFill$default(c33512mxp, this.OLrzqt, 0.0f, 2, null));
                break;
            case 2:
                int iCopydefault2 = C33508mxl.copydefault(this.OLrzqt);
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(qZH.PendingIntent.QOeQqh);
                C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                taskDescription = new TaskDescription(iCopydefault2, strAYXKKw2, c33512mxp2.zLjUOn(this.OLrzqt, 0.75f), C33512mxp.tradeRiseTagFill$default(c33512mxp2, this.OLrzqt, 0.0f, 2, null));
                break;
            case 3:
                int iCopydefault3 = C33508mxl.copydefault(this.OLrzqt);
                java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(qZH.PendingIntent.DsfknC);
                C33512mxp c33512mxp3 = C33512mxp.AEQbTJ;
                taskDescription = new TaskDescription(iCopydefault3, strAYXKKw3, c33512mxp3.zLjUOn(this.OLrzqt, 0.5f), C33512mxp.tradeRiseTagFill$default(c33512mxp3, this.OLrzqt, 0.0f, 2, null));
                break;
            case 4:
                int iCopydefault4 = C33508mxl.copydefault(this.OLrzqt);
                java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(qZH.PendingIntent.sEcTXd);
                C33512mxp c33512mxp4 = C33512mxp.AEQbTJ;
                taskDescription = new TaskDescription(iCopydefault4, strAYXKKw4, c33512mxp4.zLjUOn(this.OLrzqt, 0.3f), C33512mxp.tradeRiseTagFill$default(c33512mxp4, this.OLrzqt, 0.0f, 2, null));
                break;
            case 5:
                int iAEQbTJ = C33508mxl.AEQbTJ(this.OLrzqt);
                java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(qZH.PendingIntent.zlzhuY);
                C33512mxp c33512mxp5 = C33512mxp.AEQbTJ;
                taskDescription = new TaskDescription(iAEQbTJ, strAYXKKw5, c33512mxp5.isConnected(this.OLrzqt, 1.0f), C33512mxp.tradeFallTagFill$default(c33512mxp5, this.OLrzqt, 0.0f, 2, null));
                break;
            case 6:
                int iAEQbTJ2 = C33508mxl.AEQbTJ(this.OLrzqt);
                java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(qZH.PendingIntent.QOeQqh);
                C33512mxp c33512mxp6 = C33512mxp.AEQbTJ;
                taskDescription = new TaskDescription(iAEQbTJ2, strAYXKKw6, c33512mxp6.isConnected(this.OLrzqt, 0.75f), C33512mxp.tradeFallTagFill$default(c33512mxp6, this.OLrzqt, 0.0f, 2, null));
                break;
            case 7:
                int iAEQbTJ3 = C33508mxl.AEQbTJ(this.OLrzqt);
                java.lang.String strAYXKKw7 = C33070mpX.AYXKKw(qZH.PendingIntent.DsfknC);
                C33512mxp c33512mxp7 = C33512mxp.AEQbTJ;
                taskDescription = new TaskDescription(iAEQbTJ3, strAYXKKw7, c33512mxp7.isConnected(this.OLrzqt, 0.5f), C33512mxp.tradeFallTagFill$default(c33512mxp7, this.OLrzqt, 0.0f, 2, null));
                break;
            case 8:
                int iAEQbTJ4 = C33508mxl.AEQbTJ(this.OLrzqt);
                java.lang.String strAYXKKw8 = C33070mpX.AYXKKw(qZH.PendingIntent.sEcTXd);
                C33512mxp c33512mxp8 = C33512mxp.AEQbTJ;
                taskDescription = new TaskDescription(iAEQbTJ4, strAYXKKw8, c33512mxp8.isConnected(this.OLrzqt, 0.3f), C33512mxp.tradeFallTagFill$default(c33512mxp8, this.OLrzqt, 0.0f, 2, null));
                break;
            default:
                return null;
        }
        return taskDescription;
    }

    /* JADX INFO: renamed from: o.nkD$TaskDescription */
    public static final class TaskDescription {
        public final java.lang.String AEQbTJ;
        public final int EZpvd;
        public final int KWHzl;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, java.lang.String str, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                i = taskDescription.EZpvd;
            }
            if ((i4 & 2) != 0) {
                str = taskDescription.AEQbTJ;
            }
            if ((i4 & 4) != 0) {
                i2 = taskDescription.OLrzqt;
            }
            if ((i4 & 8) != 0) {
                i3 = taskDescription.KWHzl;
            }
            return taskDescription.OLrzqt(i, str, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(int i, @NotNull java.lang.String str, int i2, int i3) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(i, str, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.EZpvd == taskDescription.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ) && this.OLrzqt == taskDescription.OLrzqt && this.KWHzl == taskDescription.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((java.lang.Integer.hashCode(this.EZpvd) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TypeConfig(textColor=" + this.EZpvd + ", titleText=" + this.AEQbTJ + ", iconColor=" + this.OLrzqt + ", percentColor=" + this.KWHzl + ")";
        }

        public TaskDescription(int i, @NotNull java.lang.String str, int i2, int i3) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = i;
            this.AEQbTJ = str;
            this.OLrzqt = i2;
            this.KWHzl = i3;
        }
    }

    /* JADX INFO: renamed from: o.nkD$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public android.view.View EZpvd;
        public android.widget.TextView KWHzl;
        public C35139npg OLrzqt;
        public android.widget.TextView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C35139npg AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView copydefault() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = view.findViewById(qZH.StateListAnimator.MediaBrowserCompatMediaItem1);
            this.KWHzl = (android.widget.TextView) view.findViewById(qZH.StateListAnimator.getNotifyChildrenChangedOptions);
            this.OLrzqt = (C35139npg) view.findViewById(qZH.StateListAnimator.apHBvG);
            this.copydefault = (android.widget.TextView) view.findViewById(qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi217);
        }
    }
}
