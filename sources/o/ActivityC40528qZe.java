package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.Glide;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.pVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qZe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class ActivityC40528qZe extends AbstractActivityC33041mov {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qZc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC40528qZe.AEQbTJ(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.qZk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC40528qZe.KWHzl(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.qZl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC40528qZe.AhwBna(this.copydefault);
        }
    });
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.qZe$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qZe.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ void launch$default(ActionBar actionBar, android.content.Context context, java.lang.String str, java.util.List list, int i, java.lang.String str2, int i2, java.lang.Object obj) {
            if ((i2 & 16) != 0) {
                str2 = "";
            }
            actionBar.AEQbTJ(context, str, list, i, str2);
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, int i, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC40528qZe.class);
            intent.putExtra("extra_from_page", str);
            intent.putExtra("extra_image_url_list", (java.lang.String[]) list.toArray(new java.lang.String[0]));
            intent.putExtra("extra_default_select_index", i);
            intent.putExtra("recMetadata", str2);
            context.startActivity(intent);
        }
    }

    public static final java.lang.String AEQbTJ(ActivityC40528qZe activityC40528qZe) {
        java.lang.String stringExtra = activityC40528qZe.getIntent().getStringExtra("extra_from_page");
        return stringExtra == null ? "" : stringExtra;
    }

    private final java.lang.String KWHzl() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    private final java.lang.String[] AEQbTJ() {
        return (java.lang.String[]) this.OLrzqt.getValue();
    }

    public static final java.lang.String[] KWHzl(ActivityC40528qZe activityC40528qZe) {
        java.lang.String[] stringArrayExtra = activityC40528qZe.getIntent().getStringArrayExtra("extra_image_url_list");
        return stringArrayExtra == null ? new java.lang.String[0] : stringArrayExtra;
    }

    public static final java.lang.String AhwBna(ActivityC40528qZe activityC40528qZe) {
        java.lang.String stringExtra = activityC40528qZe.getIntent().getStringExtra("recMetadata");
        return stringExtra == null ? "" : stringExtra;
    }

    public final java.lang.String OLrzqt() {
        return (java.lang.String) this.copydefault.getValue();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(pVX.Application.copydefault);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(pVX.ActionBar.valueOf);
        wXG wxg = (wXG) findViewById(pVX.ActionBar.copydefault);
        viewPager2.setAdapter(new TaskDescription(AEQbTJ()));
        int intExtra = getIntent().getIntExtra("extra_default_select_index", 0);
        viewPager2.setCurrentItem(intExtra, false);
        wxg.setCount(AEQbTJ().length);
        wxg.setSelectedItem(viewPager2.getCurrentItem());
        viewPager2.registerOnPageChangeCallback(new Activity(wxg, this));
        findViewById(pVX.ActionBar.AEQbTJ).setOnClickListener(new View.OnClickListener() { // from class: o.qZi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC40528qZe.copydefault(this.EZpvd, view);
            }
        });
        EZpvd("ImageViewer_Full_Page_View", intExtra);
    }

    /* JADX INFO: renamed from: o.qZe$Activity */
    public static final class Activity extends ViewPager2.OnPageChangeCallback {
        public final /* synthetic */ wXG AEQbTJ;
        public final /* synthetic */ ActivityC40528qZe OLrzqt;

        public Activity(wXG wxg, ActivityC40528qZe activityC40528qZe) {
            this.AEQbTJ = wxg;
            this.OLrzqt = activityC40528qZe;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            this.AEQbTJ.setSelectedItem(i);
            this.OLrzqt.EZpvd("ImageViewer_Full_Swipe_Click", i);
            this.OLrzqt.EZpvd("ImageViewer_Full_Page_View", i);
        }
    }

    public static final void copydefault(ActivityC40528qZe activityC40528qZe, android.view.View view) {
        activityC40528qZe.finish();
    }

    /* JADX INFO: renamed from: o.qZe$TaskDescription */
    public static final class TaskDescription extends RecyclerView.Adapter<C0925TaskDescription> {
        public final java.lang.String[] AEQbTJ;

        public TaskDescription(@NotNull java.lang.String[] strArr) {
            Intrinsics.checkNotNullParameter(strArr, "");
            this.AEQbTJ = strArr;
        }

        /* JADX INFO: renamed from: o.qZe$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public final class C0925TaskDescription extends RecyclerView.ViewHolder {
            public final /* synthetic */ TaskDescription copydefault;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0925TaskDescription(@NotNull TaskDescription taskDescription, android.view.View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.copydefault = taskDescription;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public C0925TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C31696mAn c31696mAn = new C31696mAn(viewGroup.getContext());
            c31696mAn.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            c31696mAn.setScaleType(ImageView.ScaleType.FIT_CENTER);
            return new C0925TaskDescription(this, c31696mAn);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C0925TaskDescription c0925TaskDescription, int i) {
            Intrinsics.checkNotNullParameter(c0925TaskDescription, "");
            android.view.View view = c0925TaskDescription.itemView;
            C31696mAn c31696mAn = view instanceof C31696mAn ? (C31696mAn) view : null;
            if (c31696mAn != null) {
                Glide.AEQbTJ(c31696mAn.getContext()).EZpvd(this.AEQbTJ[i]).EZpvd((android.widget.ImageView) c31696mAn);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.AEQbTJ.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            java.lang.String str = (java.lang.String) yDV.gEmmrt(this.AEQbTJ, i);
            if (str != null) {
                return C33129mqd.valueOf(java.lang.Integer.valueOf(str.hashCode()));
            }
            return -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(java.lang.String str, final int i) {
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.qZg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC40528qZe.OLrzqt(i, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(int i, ActivityC40528qZe activityC40528qZe, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "image_position", java.lang.String.valueOf(i), false, 4, null);
        EventParamsList.put$default(eventParamsList, "image_url", java.lang.String.valueOf(yDV.gEmmrt(activityC40528qZe.AEQbTJ(), i)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "from_page", activityC40528qZe.KWHzl(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "recMetadata", activityC40528qZe.OLrzqt(), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
