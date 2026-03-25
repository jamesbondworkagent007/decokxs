package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.unify_trade.bot.data.BotGuideData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import o.wJM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wJM extends wXX {
    public AbstractC48663uZt OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    @Override // o.wXX
    public float getHeightScale() {
        return 0.94f;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wJM.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.util.ArrayList<BotGuideData> arrayList) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            wJM wjm = new wJM();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("data", arrayList);
            wjm.setArguments(bundle);
            wjm.show(fragmentManager, wJM.class.getSimpleName());
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(-1);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.OLrzqt = AbstractC48663uZt.EZpvd(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        android.os.Bundle arguments = getArguments();
        AbstractC48663uZt abstractC48663uZt = null;
        java.util.ArrayList<BotGuideData> parcelableArrayList = arguments != null ? arguments.getParcelableArrayList("data") : null;
        copydefault(parcelableArrayList);
        AbstractC48663uZt abstractC48663uZt2 = this.OLrzqt;
        if (abstractC48663uZt2 == null) {
            Intrinsics.gEmmrt("");
            abstractC48663uZt2 = null;
        }
        C55172xet c55172xet = abstractC48663uZt2.KWHzl;
        c55172xet.setCurrentIndex(0);
        c55172xet.setCount(parcelableArrayList != null ? parcelableArrayList.size() : 1);
        AbstractC48663uZt abstractC48663uZt3 = this.OLrzqt;
        if (abstractC48663uZt3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48663uZt = abstractC48663uZt3;
        }
        wYC wyc = abstractC48663uZt.EZpvd;
        wyc.setOnClickListener(new ActionBar(wyc, 1000L, this));
    }

    public static final class Activity extends ViewPager2.OnPageChangeCallback {
        public final /* synthetic */ java.util.List<Application> copydefault;

        public Activity(java.util.List<Application> list) {
            this.copydefault = list;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            AbstractC48663uZt abstractC48663uZt = wJM.this.OLrzqt;
            AbstractC48663uZt abstractC48663uZt2 = null;
            if (abstractC48663uZt == null) {
                Intrinsics.gEmmrt("");
                abstractC48663uZt = null;
            }
            abstractC48663uZt.KWHzl.setCurrentIndex(i);
            if (i == 0) {
                AbstractC48663uZt abstractC48663uZt3 = wJM.this.OLrzqt;
                if (abstractC48663uZt3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC48663uZt3 = null;
                }
                wYF wyf = abstractC48663uZt3.AEQbTJ;
                wyf.setType(5);
                C52794wYp c52794wYpCopydefault = wyf.copydefault();
                if (c52794wYpCopydefault != null) {
                    c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.RdAHlO));
                }
            } else if (i == this.copydefault.size() - 1) {
                AbstractC48663uZt abstractC48663uZt4 = wJM.this.OLrzqt;
                if (abstractC48663uZt4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC48663uZt4 = null;
                }
                wYF wyf2 = abstractC48663uZt4.AEQbTJ;
                wyf2.setType(14);
                C52794wYp c52794wYpCopydefault2 = wyf2.copydefault();
                if (c52794wYpCopydefault2 != null) {
                    c52794wYpCopydefault2.setText(C33070mpX.AYXKKw(C55688xof.Application.Rattr));
                }
            } else {
                AbstractC48663uZt abstractC48663uZt5 = wJM.this.OLrzqt;
                if (abstractC48663uZt5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC48663uZt5 = null;
                }
                wYF wyf3 = abstractC48663uZt5.AEQbTJ;
                wyf3.setType(14);
                C52794wYp c52794wYpCopydefault3 = wyf3.copydefault();
                if (c52794wYpCopydefault3 != null) {
                    c52794wYpCopydefault3.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.RdAHlO));
                }
            }
            AbstractC48663uZt abstractC48663uZt6 = wJM.this.OLrzqt;
            if (abstractC48663uZt6 == null) {
                Intrinsics.gEmmrt("");
                abstractC48663uZt6 = null;
            }
            C52794wYp c52794wYpAEQbTJ = abstractC48663uZt6.AEQbTJ.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                final wJM wjm = wJM.this;
                c52794wYpAEQbTJ.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.OFhtUX));
                c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.wJJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        wJM.Activity.EZpvd(wjm, view);
                    }
                });
            }
            AbstractC48663uZt abstractC48663uZt7 = wJM.this.OLrzqt;
            if (abstractC48663uZt7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48663uZt2 = abstractC48663uZt7;
            }
            C52794wYp c52794wYpCopydefault4 = abstractC48663uZt2.AEQbTJ.copydefault();
            if (c52794wYpCopydefault4 != null) {
                final wJM wjm2 = wJM.this;
                final java.util.List<Application> list = this.copydefault;
                c52794wYpCopydefault4.setOnClickListener(new View.OnClickListener() { // from class: o.wJN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        wJM.Activity.EZpvd(wjm2, list, view);
                    }
                });
            }
        }

        public static final void EZpvd(wJM wjm, android.view.View view) {
            AbstractC48663uZt abstractC48663uZt = wjm.OLrzqt;
            if (abstractC48663uZt == null) {
                Intrinsics.gEmmrt("");
                abstractC48663uZt = null;
            }
            abstractC48663uZt.OLrzqt.setCurrentItem(r0.getCurrentItem() - 1);
        }

        public static final void EZpvd(wJM wjm, java.util.List list, android.view.View view) {
            AbstractC48663uZt abstractC48663uZt = wjm.OLrzqt;
            AbstractC48663uZt abstractC48663uZt2 = null;
            if (abstractC48663uZt == null) {
                Intrinsics.gEmmrt("");
                abstractC48663uZt = null;
            }
            if (abstractC48663uZt.OLrzqt.getCurrentItem() != list.size() - 1) {
                AbstractC48663uZt abstractC48663uZt3 = wjm.OLrzqt;
                if (abstractC48663uZt3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC48663uZt2 = abstractC48663uZt3;
                }
                ViewPager2 viewPager2 = abstractC48663uZt2.OLrzqt;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
                return;
            }
            wjm.dismissAllowingStateLoss();
        }
    }

    public static final class Application implements InterfaceC47982uAp {
        public static final int OLrzqt = BotGuideData.$stable;
        public final BotGuideData KWHzl;

        public Application(@NotNull BotGuideData botGuideData) {
            Intrinsics.checkNotNullParameter(botGuideData, "");
            this.KWHzl = botGuideData;
        }

        @Override // o.InterfaceC47982uAp
        public androidx.fragment.app.Fragment getFragment(java.lang.Object obj) {
            return wJF.Companion.AEQbTJ(this.KWHzl);
        }
    }

    public final void copydefault(java.util.ArrayList<BotGuideData> arrayList) {
        if (arrayList != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new Application((BotGuideData) it.next()));
            }
            AbstractC48663uZt abstractC48663uZt = this.OLrzqt;
            AbstractC48663uZt abstractC48663uZt2 = null;
            if (abstractC48663uZt == null) {
                Intrinsics.gEmmrt("");
                abstractC48663uZt = null;
            }
            ViewPager2 viewPager2 = abstractC48663uZt.OLrzqt;
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Lifecycle lifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            viewPager2.setAdapter(new C47976uAj(childFragmentManager, arrayList2, lifecycle, null, 8, null));
            AbstractC48663uZt abstractC48663uZt3 = this.OLrzqt;
            if (abstractC48663uZt3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48663uZt2 = abstractC48663uZt3;
            }
            abstractC48663uZt2.OLrzqt.registerOnPageChangeCallback(new Activity(arrayList2));
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ wJM KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, wJM wjm) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = wjm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }
}
