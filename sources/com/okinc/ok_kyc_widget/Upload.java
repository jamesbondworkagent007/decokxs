package com.okinc.ok_kyc_widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C33129mqd;
import o.C41930rAa;
import o.C41933rAd;
import o.C42519rVw;
import o.C43662rtX;
import o.C52761wXj;
import o.C55296xhK;
import o.C56390yDp;
import o.C56423yEv;
import o.C56424yEw;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.pTD;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class Upload extends ConstraintLayout {
    public List<TaskDescription> AEQbTJ;
    public C41930rAa AYXKKw;
    public View.OnClickListener AhwBna;
    public int EZpvd;
    public final ActionBar KWHzl;
    public Status OLrzqt;
    public String copydefault;
    public List<String> djBIcL;
    public final C42519rVw gEmmrt;
    public int valueOf;

    /* JADX INFO: loaded from: classes16.dex */
    public interface Application {
        void copydefault(@NotNull TaskDescription taskDescription);
    }

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.UPLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.UPLOAD_DISABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Status.FAILURE_OVER_SIZE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Upload(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Upload(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFileNumberLimit(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: com.okinc.ok_kyc_widget.Upload.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ Upload(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Upload(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = Status.UPLOAD;
        this.AEQbTJ = new ArrayList();
        this.djBIcL = yDY.gEmmrt("PNG", "JPEG");
        this.EZpvd = 1;
        this.valueOf = 5;
        Integer errorMsg = Status.FAILURE.getErrorMsg();
        this.copydefault = errorMsg != null ? context.getString(errorMsg.intValue()) : null;
        C42519rVw c42519rVw = new C42519rVw(context, attributeSet, i);
        this.gEmmrt = c42519rVw;
        this.AYXKKw = C41930rAa.OLrzqt(LayoutInflater.from(context), this, true);
        ActionBar actionBar = new ActionBar(context, c42519rVw, this, c42519rVw.djBIcL(), this.AEQbTJ);
        this.KWHzl = actionBar;
        this.AYXKKw.KWHzl.setAdapter(actionBar);
        this.AYXKKw.KWHzl.setLayoutManager(new LinearLayoutManager(context));
        this.AYXKKw.KWHzl.addItemDecoration(new Activity(context.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.zuBGHE) * 2));
        setBasicStyle$default(this, false, 1, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Status {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private final int background;
        private final Integer errorMsg;
        private final int icon;
        private final boolean isEnabled;
        private final boolean isIconThemeSupported;
        private final Integer subtitle;
        private final int title;
        public static final Status UPLOAD = new Status("UPLOAD", 0, C43662rtX.Activity.dNCPSb, true, C43662rtX.Activity.AkhnZx, true, C43662rtX.Dialog.dvKsVJ, Integer.valueOf(C43662rtX.Dialog.finit), null);
        public static final Status UPLOAD_DISABLE = new Status("UPLOAD_DISABLE", 1, C43662rtX.Activity.dxcTrN, true, C43662rtX.Activity.AuCTel, false, C43662rtX.Dialog.dvKsVJ, Integer.valueOf(C43662rtX.Dialog.finit), null);
        public static final Status UPLOADING = new Status("UPLOADING", 2, C43662rtX.Activity.dNCPSb, true, C43662rtX.Activity.AkhnZx, false, C43662rtX.Dialog.dxcTrN, null, null);
        public static final Status FAILURE = new Status("FAILURE", 3, C43662rtX.Activity.dNCPSb, true, C43662rtX.Activity.AkhnZx, true, C43662rtX.Dialog.dvKsVJ, Integer.valueOf(C43662rtX.Dialog.finit), Integer.valueOf(C43662rtX.Dialog.fZBcTu));
        public static final Status FAILURE_OVER_SIZE = new Status("FAILURE_OVER_SIZE", 4, C43662rtX.Activity.dNCPSb, true, C43662rtX.Activity.AkhnZx, true, C43662rtX.Dialog.dvKsVJ, Integer.valueOf(C43662rtX.Dialog.finit), Integer.valueOf(C43662rtX.Dialog.djBIcL));

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Status[] $values() {
            return new Status[]{UPLOAD, UPLOAD_DISABLE, UPLOADING, FAILURE, FAILURE_OVER_SIZE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Status> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getBackground() {
            return this.background;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getErrorMsg() {
            return this.errorMsg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getSubtitle() {
            return this.subtitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isEnabled() {
            return this.isEnabled;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isIconThemeSupported() {
            return this.isIconThemeSupported;
        }

        private Status(@DrawableRes String str, int i, @DrawableRes int i2, boolean z, @StringRes int i3, @StringRes boolean z2, @StringRes int i4, Integer num, Integer num2) {
            this.icon = i2;
            this.isIconThemeSupported = z;
            this.background = i3;
            this.isEnabled = z2;
            this.title = i4;
            this.subtitle = num;
            this.errorMsg = num2;
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(statusArr$values);
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public final void copydefault(int i) {
        this.valueOf = i;
        setBasicStyle$default(this, false, 1, null);
    }

    public final void setUpload() {
        if (this.EZpvd <= this.KWHzl.OLrzqt()) {
            setDisabled();
            return;
        }
        this.OLrzqt = Status.UPLOAD;
        EZpvd(this.AhwBna);
        setBasicStyle$default(this, false, 1, null);
    }

    public final void setUpload(View.OnClickListener onClickListener) {
        this.AhwBna = onClickListener;
        setUpload();
    }

    public final void setDisabled() {
        this.OLrzqt = Status.UPLOAD_DISABLE;
        EZpvd((View.OnClickListener) null);
        setBasicStyle$default(this, false, 1, null);
    }

    public final void setUploading() {
        this.OLrzqt = Status.UPLOADING;
        EZpvd((View.OnClickListener) null);
        AEQbTJ(true);
    }

    public final void setUploadingPercentage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd((View.OnClickListener) null);
        Status status = this.OLrzqt;
        if (status == Status.UPLOADING) {
            this.AYXKKw.AYXKKw.setText(C33070mpX.AYXKKw(status.getTitle()));
        }
    }

    public final void EZpvd(@NotNull List<TaskDescription> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl.AEQbTJ(list);
    }

    public final void copydefault(@NotNull List<TaskDescription> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            this.KWHzl.EZpvd(list);
        } else {
            this.KWHzl.EZpvd(list);
            this.AYXKKw.KWHzl.getVisibility();
        }
    }

    public final void setOnFileDeleteIconClickedListener(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.KWHzl.EZpvd(application);
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class ActionBar extends RecyclerView.Adapter<Application> {
        public final C42519rVw AEQbTJ;
        public final Upload AYXKKw;
        public final Context EZpvd;
        public Application KWHzl;
        public List<TaskDescription> OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            this.KWHzl = application;
        }

        /* JADX INFO: loaded from: classes23.dex */
        public static final class Application extends RecyclerView.ViewHolder {
            public final C41933rAd KWHzl;
            public final ActionBar copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar AEQbTJ() {
                return this.copydefault;
            }

            public static final class StateListAnimator implements View.OnClickListener {
                public final /* synthetic */ View EZpvd;
                public final /* synthetic */ Application KWHzl;
                public final /* synthetic */ long OLrzqt;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public StateListAnimator(View view, long j, Application application) {
                    this.EZpvd = view;
                    this.OLrzqt = j;
                    this.KWHzl = application;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof Checkable)) {
                        C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                        if (this.KWHzl.getBindingAdapterPosition() <= -1 || this.KWHzl.getBindingAdapterPosition() >= this.KWHzl.AEQbTJ().OLrzqt.size()) {
                            return;
                        }
                        TaskDescription taskDescription = (TaskDescription) this.KWHzl.AEQbTJ().OLrzqt.get(this.KWHzl.getBindingAdapterPosition());
                        Application application = this.KWHzl.AEQbTJ().KWHzl;
                        if (application != null) {
                            application.copydefault(taskDescription);
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull C41933rAd c41933rAd, @NotNull ActionBar actionBar) {
                super(c41933rAd.getRoot());
                Intrinsics.checkNotNullParameter(c41933rAd, "");
                Intrinsics.checkNotNullParameter(actionBar, "");
                this.KWHzl = c41933rAd;
                this.copydefault = actionBar;
                if (actionBar.KWHzl != null) {
                    Drawable drawable = actionBar.EZpvd.getDrawable(C43662rtX.Activity.dvKsVJ);
                    if (drawable != null) {
                        DrawableCompat.setTintList(drawable, ColorStateList.valueOf(actionBar.copydefault));
                    }
                    c41933rAd.KWHzl.setImageDrawable(drawable);
                    ImageView imageView = c41933rAd.KWHzl;
                    imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, this));
                }
            }

            public final void AEQbTJ(@NotNull TaskDescription taskDescription) {
                Intrinsics.checkNotNullParameter(taskDescription, "");
                this.KWHzl.AEQbTJ.setText(taskDescription.EZpvd());
            }
        }

        public ActionBar(@NotNull Context context, @NotNull C42519rVw c42519rVw, @NotNull Upload upload, int i, @NotNull List<TaskDescription> list) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(c42519rVw, "");
            Intrinsics.checkNotNullParameter(upload, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = context;
            this.AEQbTJ = c42519rVw;
            this.AYXKKw = upload;
            this.copydefault = i;
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Application onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C41933rAd c41933rAdEZpvd = C41933rAd.EZpvd(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c41933rAdEZpvd, "");
            c41933rAdEZpvd.AEQbTJ.setTextColor(this.AEQbTJ.getFieldNames());
            return new Application(c41933rAdEZpvd, this);
        }

        public final boolean KWHzl(long j) {
            boolean z;
            Iterator<TaskDescription> it = this.OLrzqt.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                TaskDescription next = it.next();
                if (next.copydefault() == j) {
                    this.OLrzqt.remove(next);
                    z = true;
                    break;
                }
            }
            if (z) {
                notifyDataSetChanged();
                List<TaskDescription> list = this.OLrzqt;
                if (list == null || list.isEmpty()) {
                    this.AYXKKw.AYXKKw.KWHzl.setVisibility(8);
                }
            }
            return z;
        }

        public final void AEQbTJ(@NotNull List<TaskDescription> list) {
            Intrinsics.checkNotNullParameter(list, "");
            if (this.AYXKKw.AYXKKw.KWHzl.getVisibility() == 8) {
                this.AYXKKw.AYXKKw.KWHzl.setVisibility(0);
            }
            this.OLrzqt.addAll(list);
            notifyDataSetChanged();
        }

        public final void EZpvd(@NotNull List<TaskDescription> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt.clear();
            AEQbTJ(list);
        }

        public final int OLrzqt() {
            return this.OLrzqt.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.OLrzqt.size();
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Application application, int i) {
            Intrinsics.checkNotNullParameter(application, "");
            application.AEQbTJ(this.OLrzqt.get(i));
        }
    }

    public final boolean KWHzl(long j) {
        boolean zKWHzl = this.KWHzl.KWHzl(j);
        if (zKWHzl) {
            setUpload();
        }
        return zKWHzl;
    }

    public final void setFailed(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = Status.FAILURE;
        if (!C33129mqd.OLrzqt((CharSequence) str)) {
            str = getContext().getString(C43662rtX.Dialog.fZBcTu);
            Intrinsics.copydefault((Object) str);
        }
        this.copydefault = str;
        EZpvd(this.AhwBna);
        setBasicStyle$default(this, false, 1, null);
    }

    public final void setFailedOverSize(int i) {
        this.OLrzqt = Status.FAILURE_OVER_SIZE;
        this.valueOf = i;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.copydefault = pTD.KWHzl(context, C43662rtX.Dialog.djBIcL, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("fileSize", Integer.valueOf(i))));
        EZpvd(this.AhwBna);
        setBasicStyle$default(this, false, 1, null);
    }

    public final void setSupportedFileTypes(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            this.djBIcL = list;
        }
    }

    private final void EZpvd(View.OnClickListener onClickListener) {
        this.AYXKKw.OLrzqt.setOnClickListener(onClickListener);
    }

    public final void copydefault() {
        int i = StateListAnimator.AEQbTJ[this.OLrzqt.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            TextView textView = this.AYXKKw.AYXKKw;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView.setText(pTD.KWHzl(context, this.OLrzqt.getTitle(), (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("numberUploaded", Integer.valueOf(this.KWHzl.OLrzqt())), C56390yDp.OLrzqt("limit", Integer.valueOf(this.EZpvd)))));
        }
    }

    public static /* synthetic */ void setBasicStyle$default(Upload upload, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        upload.AEQbTJ(z);
    }

    private final void AEQbTJ(boolean z) {
        String string;
        int size;
        int i = 0;
        if (z) {
            if (!this.AYXKKw.gEmmrt.isAnimating()) {
                this.AYXKKw.gEmmrt.setAutoMirrored(true);
                this.AYXKKw.EZpvd.setVisibility(8);
                this.AYXKKw.gEmmrt.setVisibility(0);
                this.AYXKKw.copydefault.setVisibility(8);
                this.AYXKKw.gEmmrt.KWHzl(0L);
                this.AYXKKw.AYXKKw.setText(C33070mpX.AYXKKw(this.OLrzqt.getTitle()));
            }
        } else {
            if (this.AYXKKw.gEmmrt.isAnimating()) {
                this.AYXKKw.gEmmrt.cancelAnimation();
            }
            ImageView imageView = this.AYXKKw.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            if (imageView.getVisibility() != 0) {
                this.AYXKKw.gEmmrt.setVisibility(8);
                this.AYXKKw.EZpvd.setVisibility(0);
            }
            this.AYXKKw.EZpvd.setImageDrawable(getResources().getDrawable(this.OLrzqt.getIcon(), null));
            copydefault();
            Status status = this.OLrzqt;
            if (status == Status.FAILURE || status == Status.FAILURE_OVER_SIZE) {
                this.AYXKKw.copydefault.setTextColor(this.gEmmrt.fJNWhG());
                this.AYXKKw.copydefault.setVisibility(0);
                this.AYXKKw.copydefault.setText(this.copydefault);
            } else {
                this.AYXKKw.copydefault.setVisibility(8);
            }
        }
        this.AYXKKw.OLrzqt.setBackground(getContext().getResources().getDrawable(this.OLrzqt.getBackground(), getContext().getTheme()));
        this.AYXKKw.OLrzqt.setEnabled(this.OLrzqt.isEnabled());
        if (this.OLrzqt.getSubtitle() != null) {
            this.AYXKKw.AhwBna.setVisibility(0);
            this.AYXKKw.AhwBna.setTextAppearance(getContext(), C52761wXj.LoaderManager.dmfpNf);
            if (this.djBIcL.size() == 1) {
                string = this.djBIcL.get(0);
            } else {
                StringBuilder sb = new StringBuilder();
                if (this.djBIcL.size() > 1 && (size = this.djBIcL.size() - 2) >= 0) {
                    while (true) {
                        sb.append(this.djBIcL.get(i));
                        sb.append(", ");
                        if (i == size) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                List<String> list = this.djBIcL;
                sb.append(list.get(list.size() - 1));
                string = sb.toString();
                Intrinsics.copydefault((Object) string);
            }
            TextView textView = this.AYXKKw.AhwBna;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Integer subtitle = this.OLrzqt.getSubtitle();
            Intrinsics.copydefault(subtitle);
            textView.setText(pTD.KWHzl(context, subtitle.intValue(), (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("format", string), C56390yDp.OLrzqt("fileSize", Integer.valueOf(this.valueOf)))));
        } else {
            this.AYXKKw.AhwBna.setVisibility(8);
        }
        if (StateListAnimator.AEQbTJ[this.OLrzqt.ordinal()] == 2) {
            this.AYXKKw.AYXKKw.setTextColor(this.gEmmrt.iwGUEr());
            this.AYXKKw.AhwBna.setTextColor(this.gEmmrt.fIwbmz());
        } else {
            this.AYXKKw.AYXKKw.setTextColor(this.gEmmrt.getFieldNames());
            this.AYXKKw.AhwBna.setTextColor(this.gEmmrt.fARcdN());
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription {
        public final Bitmap EZpvd;
        public final String OLrzqt;
        public final long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, Bitmap bitmap, long j, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bitmap = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                j = taskDescription.copydefault;
            }
            if ((i & 4) != 0) {
                str = taskDescription.OLrzqt;
            }
            return taskDescription.OLrzqt(bitmap, j, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(Bitmap bitmap, long j, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(bitmap, j, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && this.copydefault == taskDescription.copydefault && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) taskDescription.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Bitmap bitmap = this.EZpvd;
            return ((((bitmap == null ? 0 : bitmap.hashCode()) * 31) + Long.hashCode(this.copydefault)) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UploadFileViewModel(bitmap=" + this.EZpvd + ", imageId=" + this.copydefault + ", fileName=" + this.OLrzqt + ")";
        }

        public TaskDescription(Bitmap bitmap, long j, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = bitmap;
            this.copydefault = j;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:android.graphics.Bitmap:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.Bitmap) : (r1v0 android.graphics.Bitmap))
  (r2v0 long)
  (r4v0 java.lang.String)
 A[MD:(android.graphics.Bitmap, long, java.lang.String):void (m)] (LINE:455) call: com.okinc.ok_kyc_widget.Upload.TaskDescription.<init>(android.graphics.Bitmap, long, java.lang.String):void type: THIS */
        public /* synthetic */ TaskDescription(Bitmap bitmap, long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bitmap, j, str);
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity extends RecyclerView.ItemDecoration {
        public final int EZpvd;

        public Activity(int i) {
            this.EZpvd = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = this.EZpvd;
            }
        }
    }
}
