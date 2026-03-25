package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class vSQ extends AbstractC57671ymn {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public android.view.View AhwBna;
    public java.lang.Float EZpvd;
    public AbstractC48359uOo KWHzl;
    public final ActionBar copydefault;
    public int valueOf;
    public boolean AYXKKw = true;
    public final java.util.ArrayList<java.lang.Integer> AEQbTJ = new java.util.ArrayList<>();
    public final java.util.ArrayList<android.widget.ImageView> gEmmrt = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public android.view.View EZpvd(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public java.lang.Float OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public boolean isConnected() {
        return this.AYXKKw;
    }

    public vSQ() {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        Intrinsics.copydefault(looperMyLooper);
        this.copydefault = new ActionBar(looperMyLooper);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vSQ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ vSQ newInstance$default(TaskDescription taskDescription, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return taskDescription.EZpvd(i);
        }

        public final vSQ EZpvd(int i) {
            vSQ vsq = new vSQ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("type", i);
            vsq.setArguments(bundle);
            return vsq;
        }
    }

    public static final class ActionBar extends android.os.Handler {
        public ActionBar(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            C33547myX c33547myX;
            C33547myX c33547myX2;
            Intrinsics.checkNotNullParameter(message, "");
            AbstractC48359uOo abstractC48359uOo = vSQ.this.KWHzl;
            if (abstractC48359uOo != null && (c33547myX = abstractC48359uOo.djBIcL) != null) {
                AbstractC48359uOo abstractC48359uOo2 = vSQ.this.KWHzl;
                c33547myX.setCurrentItem((((abstractC48359uOo2 == null || (c33547myX2 = abstractC48359uOo2.djBIcL) == null) ? 0 : c33547myX2.getCurrentItem()) + 1) % vSQ.this.AEQbTJ.size());
            }
            sendMessageDelayed(android.os.Message.obtain(), 3000L);
        }
    }

    @Override // o.C33003moJ, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        copydefault();
    }

    @Override // o.AbstractC57671ymn
    public android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.KWHzl = (AbstractC48359uOo) DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.dmfpNf, viewGroup, false);
        EZpvd();
        AbstractC48359uOo abstractC48359uOo = this.KWHzl;
        Intrinsics.copydefault(abstractC48359uOo);
        return abstractC48359uOo.getRoot();
    }

    public final void copydefault() {
        android.os.Bundle arguments = getArguments();
        this.valueOf = arguments != null ? arguments.getInt("type") : 0;
        if (C33492mxV.OLrzqt()) {
            this.AEQbTJ.add(java.lang.Integer.valueOf(C55688xof.Application.AlertControllerCheckedItemAdapter));
            this.AEQbTJ.add(java.lang.Integer.valueOf(C55688xof.Application.onPrepareListView));
            if (this.valueOf == 0) {
                this.AEQbTJ.add(java.lang.Integer.valueOf(C55688xof.Application.AlertControllerAlertParamsOnPrepareListViewListener));
            } else {
                this.AEQbTJ.add(java.lang.Integer.valueOf(C55688xof.Application.hasStableIds));
            }
        } else {
            this.AEQbTJ.add(java.lang.Integer.valueOf(C55688xof.Application.AlertControllerRecycleListView));
            this.AEQbTJ.add(java.lang.Integer.valueOf(C55688xof.Application.getItemId));
            if (this.valueOf == 0) {
                this.AEQbTJ.add(java.lang.Integer.valueOf(C55688xof.Application.setHasDecor));
            } else {
                this.AEQbTJ.add(java.lang.Integer.valueOf(C55688xof.Application.AlertDialog));
            }
        }
        java.util.Iterator<T> it = this.AEQbTJ.iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Number) it.next()).intValue();
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            this.gEmmrt.add(imageView);
            C33054mpH.EZpvd(imageView, C33070mpX.AYXKKw(iIntValue), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : "lfit", (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        }
    }

    private final void EZpvd() {
        android.widget.ImageView imageView;
        C52794wYp c52794wYp;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        AbstractC48359uOo abstractC48359uOo = this.KWHzl;
        if (abstractC48359uOo != null && (textView2 = abstractC48359uOo.AEQbTJ) != null) {
            textView2.setText(C33070mpX.AYXKKw(this.valueOf == 0 ? C55688xof.Application.AlertControllerAlertParams3 : C55688xof.Application.AlertControllerAlertParams2));
        }
        AbstractC48359uOo abstractC48359uOo2 = this.KWHzl;
        if (abstractC48359uOo2 != null && (textView = abstractC48359uOo2.OLrzqt) != null) {
            textView.setText(C33070mpX.AYXKKw(this.valueOf == 0 ? C55688xof.Application.apply : C55688xof.Application.AlertControllerAlertParams));
        }
        KWHzl();
        AYXKKw();
        AbstractC48359uOo abstractC48359uOo3 = this.KWHzl;
        if (abstractC48359uOo3 != null && (c52794wYp = abstractC48359uOo3.EZpvd) != null) {
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.vSW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    vSQ.EZpvd(this.AEQbTJ, view);
                }
            });
        }
        AbstractC48359uOo abstractC48359uOo4 = this.KWHzl;
        if (abstractC48359uOo4 == null || (imageView = abstractC48359uOo4.copydefault) == null) {
            return;
        }
        imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, this));
    }

    public static final void EZpvd(vSQ vsq, android.view.View view) {
        vsq.dismiss();
    }

    public final void KWHzl() {
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        int size = this.gEmmrt.size() - 1;
        android.view.View childAt = null;
        if (size >= 0) {
            int i = 0;
            while (true) {
                android.widget.ImageView imageView = new android.widget.ImageView(getContext());
                imageView.setImageResource(C48033uCm.ActionBar.AxsJAY);
                AbstractC48359uOo abstractC48359uOo = this.KWHzl;
                if (abstractC48359uOo != null && (linearLayoutCompat2 = abstractC48359uOo.KWHzl) != null) {
                    linearLayoutCompat2.addView(imageView);
                }
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = C55298xhM.dp2px$default(8.0f, null, 1, null);
                marginLayoutParams.leftMargin = C55298xhM.dp2px$default(2.0f, null, 1, null);
                marginLayoutParams.rightMargin = C55298xhM.dp2px$default(2.0f, null, 1, null);
                if (i == size) {
                    break;
                } else {
                    i++;
                }
            }
        }
        AbstractC48359uOo abstractC48359uOo2 = this.KWHzl;
        if (abstractC48359uOo2 != null && (linearLayoutCompat = abstractC48359uOo2.KWHzl) != null) {
            childAt = linearLayoutCompat.getChildAt(0);
        }
        this.AhwBna = childAt;
        if (childAt != null) {
            childAt.setSelected(true);
        }
        this.copydefault.sendMessageDelayed(android.os.Message.obtain(), 3000L);
    }

    public static final class Application extends PagerAdapter {
        public Application() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return vSQ.this.gEmmrt.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return Intrinsics.EZpvd(view, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            viewGroup.addView((android.view.View) vSQ.this.gEmmrt.get(i));
            java.lang.Object obj = vSQ.this.gEmmrt.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            return obj;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            Intrinsics.checkNotNullParameter(obj, "");
            viewGroup.removeView((android.view.View) obj);
        }
    }

    private final void AYXKKw() {
        C33547myX c33547myX;
        C33547myX c33547myX2;
        AbstractC48359uOo abstractC48359uOo = this.KWHzl;
        if (abstractC48359uOo != null && (c33547myX2 = abstractC48359uOo.djBIcL) != null) {
            c33547myX2.setAdapter(new Application());
        }
        AbstractC48359uOo abstractC48359uOo2 = this.KWHzl;
        if (abstractC48359uOo2 == null || (c33547myX = abstractC48359uOo2.djBIcL) == null) {
            return;
        }
        c33547myX.addOnPageChangeListener(new Activity());
    }

    public static final class Activity implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        public Activity() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            LinearLayoutCompat linearLayoutCompat;
            android.view.View view = vSQ.this.AhwBna;
            if (view != null) {
                view.setSelected(false);
            }
            vSQ vsq = vSQ.this;
            AbstractC48359uOo abstractC48359uOo = vsq.KWHzl;
            vsq.AhwBna = (abstractC48359uOo == null || (linearLayoutCompat = abstractC48359uOo.KWHzl) == null) ? null : linearLayoutCompat.getChildAt(i);
            android.view.View view2 = vSQ.this.AhwBna;
            if (view2 != null) {
                view2.setSelected(true);
            }
            vSQ.this.copydefault.removeCallbacksAndMessages(null);
            vSQ.this.copydefault.sendMessageDelayed(android.os.Message.obtain(), 3000L);
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ vSQ AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, vSQ vsq) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = vsq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.dismiss();
            }
        }
    }
}
