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
import o.C7343ahz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.asG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class ActivityC7881asG extends AbstractActivityC33041mov {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.asF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC7881asG.OLrzqt(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.asH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC7881asG.AEQbTJ(this.copydefault);
        }
    });

    /* JADX INFO: renamed from: o.asG$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.asG.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC7881asG.class);
            intent.putExtra("extra_from_page", str);
            intent.putExtra("extra_image_url_list", (java.lang.String[]) list.toArray(new java.lang.String[0]));
            intent.putExtra("extra_default_select_index", i);
            context.startActivity(intent);
        }
    }

    private final java.lang.String EZpvd() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    public static final java.lang.String OLrzqt(ActivityC7881asG activityC7881asG) {
        java.lang.String stringExtra = activityC7881asG.getIntent().getStringExtra("extra_from_page");
        return stringExtra == null ? "" : stringExtra;
    }

    public static final java.lang.String[] AEQbTJ(ActivityC7881asG activityC7881asG) {
        java.lang.String[] stringArrayExtra = activityC7881asG.getIntent().getStringArrayExtra("extra_image_url_list");
        return stringArrayExtra == null ? new java.lang.String[0] : stringArrayExtra;
    }

    public final java.lang.String[] copydefault() {
        return (java.lang.String[]) this.AEQbTJ.getValue();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C7343ahz.Activity.KWHzl);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(C7343ahz.TaskDescription.dxcTrN);
        wXG wxg = (wXG) findViewById(C7343ahz.TaskDescription.values);
        viewPager2.setAdapter(new StateListAnimator(copydefault()));
        int intExtra = getIntent().getIntExtra("extra_default_select_index", 0);
        viewPager2.setCurrentItem(intExtra, false);
        wxg.setCount(copydefault().length);
        wxg.setSelectedItem(viewPager2.getCurrentItem());
        viewPager2.registerOnPageChangeCallback(new Activity(wxg, this));
        findViewById(C7343ahz.TaskDescription.fARcdN).setOnClickListener(new View.OnClickListener() { // from class: o.asO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC7881asG.KWHzl(this.EZpvd, view);
            }
        });
        AEQbTJ("ImageViewer_Full_Page_View", intExtra);
    }

    /* JADX INFO: renamed from: o.asG$Activity */
    public static final class Activity extends ViewPager2.OnPageChangeCallback {
        public final /* synthetic */ wXG EZpvd;
        public final /* synthetic */ ActivityC7881asG OLrzqt;

        public Activity(wXG wxg, ActivityC7881asG activityC7881asG) {
            this.EZpvd = wxg;
            this.OLrzqt = activityC7881asG;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            this.EZpvd.setSelectedItem(i);
            this.OLrzqt.AEQbTJ("ImageViewer_Full_Swipe_Click", i);
            this.OLrzqt.AEQbTJ("ImageViewer_Full_Page_View", i);
        }
    }

    public static final void KWHzl(ActivityC7881asG activityC7881asG, android.view.View view) {
        activityC7881asG.finish();
    }

    /* JADX INFO: renamed from: o.asG$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.Adapter<ActionBar> {
        public final java.lang.String[] KWHzl;

        public StateListAnimator(@NotNull java.lang.String[] strArr) {
            Intrinsics.checkNotNullParameter(strArr, "");
            this.KWHzl = strArr;
        }

        /* JADX INFO: renamed from: o.asG$StateListAnimator$ActionBar */
        public final class ActionBar extends RecyclerView.ViewHolder {
            public final /* synthetic */ StateListAnimator KWHzl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull StateListAnimator stateListAnimator, android.view.View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.KWHzl = stateListAnimator;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C31696mAn c31696mAn = new C31696mAn(viewGroup.getContext());
            c31696mAn.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            c31696mAn.setScaleType(ImageView.ScaleType.FIT_CENTER);
            return new ActionBar(this, c31696mAn);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            android.view.View view = actionBar.itemView;
            C31696mAn c31696mAn = view instanceof C31696mAn ? (C31696mAn) view : null;
            if (c31696mAn != null) {
                Glide.AEQbTJ(c31696mAn.getContext()).EZpvd(this.KWHzl[i]).EZpvd((android.widget.ImageView) c31696mAn);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.KWHzl.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            java.lang.String str = (java.lang.String) yDV.gEmmrt(this.KWHzl, i);
            if (str != null) {
                return C33129mqd.valueOf(java.lang.Integer.valueOf(str.hashCode()));
            }
            return -1L;
        }
    }

    public final void AEQbTJ(java.lang.String str, final int i) {
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.asI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC7881asG.OLrzqt(i, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(int i, ActivityC7881asG activityC7881asG, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "image_position", java.lang.String.valueOf(i), false, 4, null);
        EventParamsList.put$default(eventParamsList, "image_url", java.lang.String.valueOf(yDV.gEmmrt(activityC7881asG.copydefault(), i)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "from_page", activityC7881asG.EZpvd(), false, 4, null);
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
