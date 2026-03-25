package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33586mzJ;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mzP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC33592mzP extends AbstractC33586mzJ {
    public C33589mzM AYXKKw;
    public android.content.Context AhwBna;
    public AbstractC33587mzK djBIcL;
    public mPR valueOf;

    /* JADX INFO: renamed from: o.mzP$Activity */
    public interface Activity {
        void EZpvd(java.lang.String str);
    }

    /* JADX INFO: renamed from: o.mzP$Application */
    public interface Application {
        void KWHzl(int i, C33583mzG c33583mzG);
    }

    /* JADX INFO: renamed from: o.mzP$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        public final /* synthetic */ Activity EZpvd;
        public final /* synthetic */ AbstractC33592mzP copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar(Activity activity, AbstractC33592mzP abstractC33592mzP) {
            this.EZpvd = activity;
            this.copydefault = abstractC33592mzP;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            Activity activity = this.EZpvd;
            mPR mpr = null;
            if (activity != null) {
                activity.EZpvd(editable != null ? editable.toString() : null);
            }
            if (editable == null || editable.length() == 0) {
                mPR mpr2 = this.copydefault.valueOf;
                if (mpr2 == null) {
                    Intrinsics.gEmmrt("");
                    mpr2 = null;
                }
                if (mpr2.OLrzqt.getVisibility() != 8) {
                    mPR mpr3 = this.copydefault.valueOf;
                    if (mpr3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        mpr = mpr3;
                    }
                    mpr.OLrzqt.setVisibility(8);
                    return;
                }
                return;
            }
            mPR mpr4 = this.copydefault.valueOf;
            if (mpr4 == null) {
                Intrinsics.gEmmrt("");
                mpr4 = null;
            }
            if (mpr4.OLrzqt.getVisibility() != 0) {
                mPR mpr5 = this.copydefault.valueOf;
                if (mpr5 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    mpr = mpr5;
                }
                mpr.OLrzqt.setVisibility(0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC33592mzP(@NotNull AbstractC33586mzJ.StateListAnimator stateListAnimator) {
        super(stateListAnimator);
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.AhwBna = stateListAnimator.AEQbTJ();
        this.djBIcL = stateListAnimator.AYXKKw();
        copydefault(stateListAnimator.valueOf(), stateListAnimator.djBIcL());
    }

    public final void copydefault(Application application, Activity activity) {
        C33589mzM c33589mzM = null;
        mPR mpr = (mPR) DataBindingUtil.inflate(android.view.LayoutInflater.from(this.AhwBna), C32113mPz.Fragment.zsXlph, null, false);
        this.valueOf = mpr;
        if (this.djBIcL != null) {
            if (mpr == null) {
                Intrinsics.gEmmrt("");
                mpr = null;
            }
            android.widget.EditText editText = mpr.copydefault;
            Intrinsics.checkNotNullExpressionValue(editText, "");
            editText.addTextChangedListener(new ActionBar(activity, this));
            mPR mpr2 = this.valueOf;
            if (mpr2 == null) {
                Intrinsics.gEmmrt("");
                mpr2 = null;
            }
            mpr2.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.mzL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC33592mzP.EZpvd(this.AEQbTJ, view);
                }
            });
            android.view.View viewOLrzqt = OLrzqt();
            viewOLrzqt.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            mPR mpr3 = this.valueOf;
            if (mpr3 == null) {
                Intrinsics.gEmmrt("");
                mpr3 = null;
            }
            mpr3.AEQbTJ.addView(viewOLrzqt);
            mPR mpr4 = this.valueOf;
            if (mpr4 == null) {
                Intrinsics.gEmmrt("");
                mpr4 = null;
            }
            mpr4.EZpvd.setHasFixedSize(true);
            mPR mpr5 = this.valueOf;
            if (mpr5 == null) {
                Intrinsics.gEmmrt("");
                mpr5 = null;
            }
            mpr5.EZpvd.setLayoutManager(new LinearLayoutManager(this.AhwBna, 1, false));
            android.content.Context context = this.AhwBna;
            mPR mpr6 = this.valueOf;
            if (mpr6 == null) {
                Intrinsics.gEmmrt("");
                mpr6 = null;
            }
            RecyclerView recyclerView = mpr6.EZpvd;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            AbstractC33587mzK abstractC33587mzK = this.djBIcL;
            Intrinsics.copydefault(abstractC33587mzK);
            this.AYXKKw = new C33589mzM(context, true, false, 0, null, recyclerView, arrayList, abstractC33587mzK, null, null, application);
            mPR mpr7 = this.valueOf;
            if (mpr7 == null) {
                Intrinsics.gEmmrt("");
                mpr7 = null;
            }
            RecyclerView recyclerView2 = mpr7.EZpvd;
            C33589mzM c33589mzM2 = this.AYXKKw;
            if (c33589mzM2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c33589mzM = c33589mzM2;
            }
            recyclerView2.setAdapter(c33589mzM);
        }
    }

    public static final void EZpvd(AbstractC33592mzP abstractC33592mzP, android.view.View view) {
        mPR mpr = abstractC33592mzP.valueOf;
        if (mpr == null) {
            Intrinsics.gEmmrt("");
            mpr = null;
        }
        mpr.copydefault.setText((java.lang.CharSequence) null);
    }

    @Override // o.AbstractC33586mzJ
    public android.view.View AYXKKw() {
        if (this.djBIcL == null) {
            return super.AYXKKw();
        }
        mPR mpr = this.valueOf;
        if (mpr == null) {
            Intrinsics.gEmmrt("");
            mpr = null;
        }
        android.view.View root = mpr.getRoot();
        Intrinsics.copydefault(root);
        return root;
    }
}
