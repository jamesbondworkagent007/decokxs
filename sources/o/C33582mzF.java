package o;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import o.C32113mPz;
import o.C52761wXj;

/* JADX INFO: renamed from: o.mzF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@java.lang.Deprecated
public class C33582mzF {
    public int AEQbTJ;
    public java.lang.CharSequence AhwBna;
    public android.os.Message AkhnZx;
    public final android.content.Context AuCTel;
    public int AuCTelauCTel;
    public android.widget.TextView AubY;
    public NestedScrollView AwvSrB;
    public android.widget.TextView AxsJAY;
    public android.widget.TextView DTwDnp;
    public android.widget.Button DbNXlk;
    public android.widget.Button EZpvd;
    public android.widget.ListAdapter KWHzl;
    public android.os.Message OLrzqt;
    public java.lang.CharSequence QKVWgx;
    public android.view.View QVAiDq;
    public int aKErDB;
    public int dNCPSb;
    public android.os.Message djBIcL;
    public int dvKsVJ;
    public int dxcTrN;
    public android.view.View ejfBZ;
    public android.widget.ImageView fARcdN;
    public final AppCompatDialog fIwbmz;
    public int fZBcTu;
    public android.graphics.drawable.Drawable fetchVPNInfo;
    public final android.view.Window finit;
    public java.lang.CharSequence gEmmrt;
    public java.lang.CharSequence gHZMYf;
    public int getFieldNames;
    public android.os.Handler getNewProxyInstance;
    public int isConnected;
    public android.widget.ImageView iwGUEr;
    public boolean sSMYrx;
    public android.graphics.drawable.Drawable uzCIH;
    public android.widget.Button valueOf;
    public java.lang.CharSequence values;
    public android.widget.ListView wlaJM;
    public int zLjUOn;
    public java.lang.CharSequence zsXlph;
    public int zuBGHE;
    public boolean fFgQHt = false;
    public int UeEOUB = 0;
    public int RJOkX = 0;
    public int QUSxYX = 0;
    public int djSkpj = 0;
    public boolean RcXXUw = false;
    public int QbewEr = 0;
    public int QOLQEE = 0;
    public int OcIXYQ = 0;
    public int ORxRYg = 0;
    public boolean QfsBiF = false;
    public int hDKMBd = 0;
    public int fJNWhG = -1;
    public int AYXKKw = 0;
    public boolean gasjUx = true;
    public boolean fvQaOB = true;
    public final View.OnClickListener copydefault = new View.OnClickListener() { // from class: o.mzF.3
        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            android.os.Message messageObtain;
            android.os.Message message;
            android.os.Message message2;
            android.os.Message message3;
            C33582mzF c33582mzF = C33582mzF.this;
            if (view == c33582mzF.DbNXlk && (message3 = c33582mzF.AkhnZx) != null) {
                messageObtain = android.os.Message.obtain(message3);
            } else if (view == c33582mzF.EZpvd && (message2 = c33582mzF.OLrzqt) != null) {
                messageObtain = android.os.Message.obtain(message2);
            } else {
                messageObtain = (view != c33582mzF.valueOf || (message = c33582mzF.djBIcL) == null) ? null : android.os.Message.obtain(message);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            if (messageObtain == null || messageObtain.arg1 >= 0) {
                C33582mzF c33582mzF2 = C33582mzF.this;
                c33582mzF2.getNewProxyInstance.obtainMessage(1, c33582mzF2.fIwbmz).sendToTarget();
            }
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(boolean z) {
        this.fvQaOB = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(android.view.View view) {
        this.ejfBZ = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(android.view.View view, int i, int i2, int i3, int i4) {
        this.QVAiDq = view;
        this.dNCPSb = 0;
        this.fFgQHt = true;
        this.fZBcTu = i;
        this.dxcTrN = i2;
        this.dvKsVJ = i3;
        this.aKErDB = i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.gasjUx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        int i = this.isConnected;
        return (i != 0 && this.AYXKKw == 1) ? i : this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(int i, int i2, int i3, int i4) {
        this.QfsBiF = true;
        this.OcIXYQ = i;
        this.QbewEr = i2;
        this.ORxRYg = i3;
        this.QOLQEE = i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(int i) {
        this.QVAiDq = null;
        this.dNCPSb = i;
        this.fFgQHt = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(int i, int i2, int i3, int i4) {
        this.RcXXUw = true;
        this.QUSxYX = i;
        this.UeEOUB = i2;
        this.djSkpj = i3;
        this.RJOkX = i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(android.view.View view) {
        this.QVAiDq = view;
        this.dNCPSb = 0;
        this.fFgQHt = false;
    }

    /* JADX INFO: renamed from: o.mzF$ActionBar */
    public static final class ActionBar extends android.os.Handler {
        public WeakReference<android.content.DialogInterface> AEQbTJ;

        public ActionBar(android.content.DialogInterface dialogInterface) {
            this.AEQbTJ = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.AEQbTJ.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((android.content.DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static boolean copydefault(android.content.Context context) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(androidx.appcompat.R.attr.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    public C33582mzF(android.content.Context context, AppCompatDialog appCompatDialog, android.view.Window window) {
        this.AuCTel = context;
        this.fIwbmz = appCompatDialog;
        this.finit = window;
        this.getNewProxyInstance = new ActionBar(appCompatDialog);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, androidx.appcompat.R.styleable.AlertDialog, androidx.appcompat.R.attr.alertDialogStyle, 0);
        this.AEQbTJ = C32113mPz.Fragment.getFieldNames;
        this.isConnected = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.zLjUOn = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_listLayout, 0);
        this.AuCTelauCTel = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.zuBGHE = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.getFieldNames = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_listItemLayout, 0);
        this.sSMYrx = typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AlertDialog_showTitle, true);
        typedArrayObtainStyledAttributes.recycle();
        appCompatDialog.supportRequestWindowFeature(1);
    }

    public static boolean OLrzqt(android.view.View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return false;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (OLrzqt(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public void KWHzl() {
        this.fIwbmz.setContentView(OLrzqt());
        copydefault();
        android.view.Display defaultDisplay = this.finit.getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes = this.fIwbmz.getWindow().getAttributes();
        attributes.width = (int) (((double) defaultDisplay.getWidth()) * 0.8d);
        this.fIwbmz.getWindow().setAttributes(attributes);
    }

    public void EZpvd(java.lang.CharSequence charSequence) {
        this.QKVWgx = charSequence;
        android.widget.TextView textView = this.DTwDnp;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void KWHzl(java.lang.CharSequence charSequence) {
        this.gHZMYf = charSequence;
        android.widget.TextView textView = this.AxsJAY;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void OLrzqt(java.lang.CharSequence charSequence) {
        this.zsXlph = charSequence;
        android.widget.TextView textView = this.AubY;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void KWHzl(int i, java.lang.CharSequence charSequence, DialogInterface.OnClickListener onClickListener, android.os.Message message) {
        if (message == null && onClickListener != null) {
            message = this.getNewProxyInstance.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.AhwBna = charSequence;
            this.djBIcL = message;
            return;
        }
        if (i == -2) {
            this.gEmmrt = charSequence;
            this.OLrzqt = message;
            if (this.fvQaOB) {
                return;
            }
            message.arg1 = -1000;
            return;
        }
        if (i != -1) {
            throw new java.lang.IllegalArgumentException("Button does not exist");
        }
        this.values = charSequence;
        this.AkhnZx = message;
        if (this.gasjUx) {
            return;
        }
        message.arg1 = -1000;
    }

    public void OLrzqt(int i) {
        this.uzCIH = null;
        this.hDKMBd = i;
        android.widget.ImageView imageView = this.iwGUEr;
        if (imageView != null) {
            if (i != 0) {
                imageView.setVisibility(0);
                this.iwGUEr.setImageResource(this.hDKMBd);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
        this.uzCIH = drawable;
        this.hDKMBd = 0;
        android.widget.ImageView imageView = this.iwGUEr;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.iwGUEr.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public void OLrzqt(android.graphics.drawable.Drawable drawable) {
        this.fetchVPNInfo = drawable;
        android.widget.ImageView imageView = this.fARcdN;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.fARcdN.setImageDrawable(drawable);
                this.fARcdN.setOnClickListener(new View.OnClickListener() { // from class: o.mzF.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        C33582mzF.this.fIwbmz.cancel();
                    }
                });
            } else {
                imageView.setVisibility(8);
                this.fARcdN.setOnClickListener(null);
            }
        }
    }

    public int KWHzl(int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        this.AuCTel.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public boolean EZpvd(int i, android.view.KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.AwvSrB;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    public boolean AEQbTJ(int i, android.view.KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.AwvSrB;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    public final android.view.ViewGroup AEQbTJ(@androidx.annotation.Nullable android.view.View view, @androidx.annotation.Nullable android.view.View view2) {
        if (view == null) {
            if (view2 instanceof android.view.ViewStub) {
                view2 = ((android.view.ViewStub) view2).inflate();
            }
            return (android.view.ViewGroup) view2;
        }
        if (view2 != null) {
            android.view.ViewParent parent = view2.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof android.view.ViewStub) {
            view = ((android.view.ViewStub) view).inflate();
        }
        return (android.view.ViewGroup) view;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault() {
        android.view.View viewFindViewById;
        android.widget.ListAdapter listAdapter;
        android.view.View viewFindViewById2;
        android.view.View viewFindViewById3 = this.finit.findViewById(androidx.appcompat.R.id.parentPanel);
        android.view.View viewFindViewById4 = viewFindViewById3.findViewById(androidx.appcompat.R.id.topPanel);
        android.view.View viewFindViewById5 = viewFindViewById3.findViewById(androidx.appcompat.R.id.contentPanel);
        android.view.View viewFindViewById6 = viewFindViewById3.findViewById(androidx.appcompat.R.id.buttonPanel);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById3.findViewById(androidx.appcompat.R.id.customPanel);
        copydefault(viewGroup);
        android.view.View viewFindViewById7 = viewGroup.findViewById(androidx.appcompat.R.id.topPanel);
        android.view.View viewFindViewById8 = viewGroup.findViewById(androidx.appcompat.R.id.contentPanel);
        android.view.View viewFindViewById9 = viewGroup.findViewById(androidx.appcompat.R.id.buttonPanel);
        android.view.ViewGroup viewGroupAEQbTJ = AEQbTJ(viewFindViewById7, viewFindViewById4);
        android.view.ViewGroup viewGroupAEQbTJ2 = AEQbTJ(viewFindViewById8, viewFindViewById5);
        android.view.ViewGroup viewGroupAEQbTJ3 = AEQbTJ(viewFindViewById9, viewFindViewById6);
        OLrzqt(viewGroupAEQbTJ2);
        KWHzl(viewGroupAEQbTJ3);
        AEQbTJ(viewGroupAEQbTJ);
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (viewGroupAEQbTJ == null || viewGroupAEQbTJ.getVisibility() == 8) ? 0 : 1;
        boolean z3 = (viewGroupAEQbTJ3 == null || viewGroupAEQbTJ3.getVisibility() == 8) ? false : true;
        if (!z3 && viewGroupAEQbTJ2 != null && (viewFindViewById2 = viewGroupAEQbTJ2.findViewById(androidx.appcompat.R.id.textSpacerNoButtons)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z2 != 0) {
            NestedScrollView nestedScrollView = this.AwvSrB;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            android.view.View viewFindViewById10 = null;
            android.view.View viewFindViewById11 = (this.zsXlph == null && this.wlaJM == null) ? null : viewGroupAEQbTJ.findViewById(androidx.appcompat.R.id.titleDividerNoCustom);
            if (viewFindViewById11 != null) {
                viewFindViewById11.setVisibility(0);
            }
            if (this.zsXlph == null && this.wlaJM == null && !z) {
                viewFindViewById10 = viewGroupAEQbTJ.findViewById(android.R.id.custom);
            }
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupAEQbTJ2 != null && (viewFindViewById = viewGroupAEQbTJ2.findViewById(androidx.appcompat.R.id.textSpacerNoTitle)) != null) {
            viewFindViewById.setVisibility(0);
        }
        android.widget.ListView listView = this.wlaJM;
        if (listView instanceof StateListAnimator) {
            ((StateListAnimator) listView).setHasDecor(z2, z3);
        }
        if (!z) {
            android.view.View view = this.wlaJM;
            if (view == null) {
                view = this.AwvSrB;
            }
            if (view != null) {
                KWHzl(viewGroupAEQbTJ2, view, z2 | (z3 ? 2 : 0), 3);
            }
        }
        android.widget.ListView listView2 = this.wlaJM;
        if (listView2 == null || (listAdapter = this.KWHzl) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i = this.fJNWhG;
        if (i > -1) {
            listView2.setItemChecked(i, true);
            listView2.setSelection(i);
        }
    }

    public final void KWHzl(android.view.ViewGroup viewGroup, android.view.View view, int i, int i2) {
        android.view.View viewFindViewById = this.finit.findViewById(androidx.appcompat.R.id.scrollIndicatorUp);
        android.view.View viewFindViewById2 = this.finit.findViewById(androidx.appcompat.R.id.scrollIndicatorDown);
        ViewCompat.setScrollIndicators(view, i, i2);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    public final void copydefault(android.view.ViewGroup viewGroup) {
        android.view.View viewInflate = this.QVAiDq;
        if (viewInflate == null) {
            viewInflate = this.dNCPSb != 0 ? android.view.LayoutInflater.from(this.AuCTel).inflate(this.dNCPSb, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !OLrzqt(viewInflate)) {
            this.finit.setFlags(131072, 131072);
        }
        if (z) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.finit.findViewById(androidx.appcompat.R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (this.fFgQHt) {
                frameLayout.setPaddingRelative(this.fZBcTu, this.dxcTrN, this.dvKsVJ, this.aKErDB);
            }
            if (this.RcXXUw) {
                viewGroup.setPaddingRelative(this.QUSxYX, this.UeEOUB, this.djSkpj, this.RJOkX);
            }
            if (this.wlaJM != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void AEQbTJ(android.view.ViewGroup viewGroup) {
        if (this.QfsBiF) {
            viewGroup.setPaddingRelative(this.OcIXYQ, this.QbewEr, this.ORxRYg, this.QOLQEE);
        }
        if (this.ejfBZ != null) {
            viewGroup.addView(this.ejfBZ, 0, new ViewGroup.LayoutParams(-1, -2));
            this.finit.findViewById(androidx.appcompat.R.id.title_template).setVisibility(8);
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) this.finit.findViewById(android.R.id.closeButton);
        this.fARcdN = imageView;
        if (imageView != null) {
            if (this.fetchVPNInfo != null) {
                imageView.setVisibility(0);
                this.fARcdN.setImageDrawable(this.fetchVPNInfo);
                this.fARcdN.setOnClickListener(new View.OnClickListener() { // from class: o.mzF.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        C33582mzF.this.fIwbmz.cancel();
                    }
                });
            } else {
                imageView.setVisibility(8);
                this.fARcdN.setOnClickListener(null);
            }
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) this.finit.findViewById(android.R.id.icon);
        this.iwGUEr = imageView2;
        if (this.hDKMBd != 0) {
            this.iwGUEr.setImageDrawable(imageView2.getResources().getDrawable(this.hDKMBd));
            this.iwGUEr.setVisibility(0);
        } else {
            android.graphics.drawable.Drawable drawable = this.uzCIH;
            if (drawable != null) {
                imageView2.setImageDrawable(drawable);
                this.iwGUEr.setVisibility(0);
            } else {
                imageView2.setImageDrawable(null);
                this.iwGUEr.setVisibility(8);
            }
        }
        if ((!android.text.TextUtils.isEmpty(this.QKVWgx) || !android.text.TextUtils.isEmpty(this.gHZMYf)) && this.sSMYrx) {
            android.widget.TextView textView = (android.widget.TextView) this.finit.findViewById(androidx.appcompat.R.id.alertTitle);
            this.DTwDnp = textView;
            textView.setText(this.QKVWgx);
            this.AxsJAY = (android.widget.TextView) this.finit.findViewById(android.R.id.text2);
            if (android.text.TextUtils.isEmpty(this.gHZMYf)) {
                return;
            }
            this.AxsJAY.setVisibility(0);
            this.AxsJAY.setText(this.gHZMYf);
            return;
        }
        this.finit.findViewById(androidx.appcompat.R.id.title_template).setVisibility(8);
    }

    public final boolean AEQbTJ() {
        return this.ejfBZ != null || ((!android.text.TextUtils.isEmpty(this.QKVWgx) || !android.text.TextUtils.isEmpty(this.gHZMYf)) && this.sSMYrx);
    }

    public final void OLrzqt(android.view.ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.finit.findViewById(androidx.appcompat.R.id.scrollView);
        this.AwvSrB = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.AwvSrB.setNestedScrollingEnabled(false);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(android.R.id.message);
        this.AubY = textView;
        if (textView == null) {
            return;
        }
        if (this.zsXlph != null) {
            if (AEQbTJ()) {
                android.widget.TextView textView2 = this.AubY;
                textView2.setTextAppearance(textView2.getContext(), C52761wXj.LoaderManager.QkdxfA);
            } else {
                android.widget.TextView textView3 = this.AubY;
                textView3.setTextAppearance(textView3.getContext(), C52761wXj.LoaderManager.OJuSTm);
            }
            C54813xWg.copydefault(this.AubY);
            this.AubY.setTextSize(14.0f);
            this.AubY.setText(this.zsXlph);
            return;
        }
        textView.setVisibility(8);
        this.AwvSrB.removeView(this.AubY);
        if (this.wlaJM != null) {
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.AwvSrB.getParent();
            int iIndexOfChild = viewGroup2.indexOfChild(this.AwvSrB);
            viewGroup2.removeViewAt(iIndexOfChild);
            viewGroup2.addView(this.wlaJM, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void KWHzl(android.view.ViewGroup viewGroup) {
        int i;
        android.widget.Button button = (android.widget.Button) viewGroup.findViewById(android.R.id.button1);
        this.DbNXlk = button;
        button.setOnClickListener(this.copydefault);
        this.DbNXlk.setAllCaps(false);
        if (android.text.TextUtils.isEmpty(this.values)) {
            this.DbNXlk.setVisibility(8);
            i = 0;
        } else {
            this.DbNXlk.setText(this.values);
            this.DbNXlk.setVisibility(0);
            i = 1;
        }
        android.widget.Button button2 = (android.widget.Button) viewGroup.findViewById(android.R.id.button2);
        this.EZpvd = button2;
        button2.setOnClickListener(this.copydefault);
        this.DbNXlk.setAllCaps(false);
        if (android.text.TextUtils.isEmpty(this.gEmmrt)) {
            this.EZpvd.setVisibility(8);
        } else {
            this.EZpvd.setText(this.gEmmrt);
            this.EZpvd.setVisibility(0);
            i |= 2;
        }
        android.widget.Button button3 = (android.widget.Button) viewGroup.findViewById(android.R.id.button3);
        this.valueOf = button3;
        button3.setOnClickListener(this.copydefault);
        if (android.text.TextUtils.isEmpty(this.AhwBna)) {
            this.valueOf.setVisibility(8);
        } else {
            this.valueOf.setText(this.AhwBna);
            this.valueOf.setVisibility(0);
            i |= 4;
        }
        if (copydefault(this.AuCTel)) {
            if (i == 1) {
                AEQbTJ(this.DbNXlk);
            } else if (i == 2) {
                AEQbTJ(this.EZpvd);
            } else if (i == 4) {
                AEQbTJ(this.valueOf);
            }
        }
        if (i != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void AEQbTJ(android.widget.Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: o.mzF$StateListAnimator */
    public static class StateListAnimator extends android.widget.ListView {
        public final int OLrzqt;
        public final int copydefault;

        public StateListAnimator(android.content.Context context) {
            this(context, null);
        }

        public StateListAnimator(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.RecycleListView);
            this.copydefault = typedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.OLrzqt = typedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.RecycleListView_paddingTopNoTitle, -1);
        }

        public void setHasDecor(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPaddingRelative(getPaddingLeft(), z ? getPaddingTop() : this.OLrzqt, getPaddingRight(), z2 ? getPaddingBottom() : this.copydefault);
        }
    }

    /* JADX INFO: renamed from: o.mzF$Activity */
    public static class Activity {
        public android.widget.ListAdapter AEQbTJ;
        public android.view.View AYXKKw;
        public android.graphics.drawable.Drawable AhwBna;
        public java.lang.String AuCTel;
        public AdapterView.OnItemSelectedListener AuCTelauCTel;
        public DialogInterface.OnKeyListener AubY;
        public java.lang.CharSequence AwvSrB;
        public boolean DbNXlk;
        public boolean[] KWHzl;
        public android.graphics.drawable.Drawable OLrzqt;
        public android.view.View OcIXYQ;
        public int RcXXUw;
        public int UeEOUB;
        public int aKErDB;
        public int dNCPSb;
        public java.lang.CharSequence[] ejfBZ;
        public java.lang.CharSequence fARcdN;
        public DialogInterface.OnClickListener fIwbmz;
        public java.lang.CharSequence fJNWhG;
        public boolean fetchVPNInfo;
        public int finit;
        public final android.content.Context gEmmrt;
        public java.lang.CharSequence gHZMYf;
        public DialogInterface.OnMultiChoiceClickListener getFieldNames;
        public DialogInterface.OnClickListener getNewProxyInstance;
        public java.lang.CharSequence hDKMBd;
        public final android.view.LayoutInflater isConnected;
        public DialogInterface.OnCancelListener iwGUEr;
        public DialogInterface.OnClickListener uzCIH;
        public android.database.Cursor valueOf;
        public java.lang.String values;
        public DialogInterface.OnClickListener wlaJM;
        public DialogInterface.OnDismissListener zLjUOn;
        public ActionBar zsXlph;
        public java.lang.CharSequence zuBGHE;
        public int AkhnZx = 0;
        public int djBIcL = 0;
        public boolean djSkpj = false;
        public int RJOkX = 0;
        public int QbewEr = 0;
        public int QfsBiF = 0;
        public int QUSxYX = 0;
        public boolean QVAiDq = false;
        public int DTwDnp = 0;
        public int sSMYrx = 0;
        public int ORxRYg = 0;
        public int QOLQEE = 0;
        public boolean QKVWgx = false;
        public int copydefault = -1;
        public boolean AxsJAY = true;
        public boolean EZpvd = true;

        /* JADX INFO: renamed from: o.mzF$Activity$ActionBar */
        public interface ActionBar {
            void KWHzl(android.widget.ListView listView);
        }

        public Activity(android.content.Context context) {
            this.gEmmrt = context;
            this.isConnected = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void copydefault(C33582mzF c33582mzF) {
            android.view.View view = this.AYXKKw;
            if (view != null) {
                c33582mzF.EZpvd(view);
            } else {
                java.lang.CharSequence charSequence = this.AwvSrB;
                if (charSequence != null) {
                    c33582mzF.EZpvd(charSequence);
                }
                java.lang.CharSequence charSequence2 = this.gHZMYf;
                if (charSequence2 != null) {
                    c33582mzF.KWHzl(charSequence2);
                }
                android.graphics.drawable.Drawable drawable = this.AhwBna;
                if (drawable != null) {
                    c33582mzF.AEQbTJ(drawable);
                }
                int i = this.AkhnZx;
                if (i != 0) {
                    c33582mzF.OLrzqt(i);
                }
                int i2 = this.djBIcL;
                if (i2 != 0) {
                    c33582mzF.OLrzqt(c33582mzF.KWHzl(i2));
                }
                android.graphics.drawable.Drawable drawable2 = this.OLrzqt;
                if (drawable2 != null) {
                    c33582mzF.OLrzqt(drawable2);
                }
            }
            java.lang.CharSequence charSequence3 = this.fARcdN;
            if (charSequence3 != null) {
                c33582mzF.OLrzqt(charSequence3);
            }
            java.lang.CharSequence charSequence4 = this.zuBGHE;
            if (charSequence4 != null) {
                c33582mzF.KWHzl(-1, charSequence4, this.wlaJM, (android.os.Message) null);
            }
            java.lang.CharSequence charSequence5 = this.fJNWhG;
            if (charSequence5 != null) {
                c33582mzF.KWHzl(-2, charSequence5, this.fIwbmz, (android.os.Message) null);
            }
            java.lang.CharSequence charSequence6 = this.hDKMBd;
            if (charSequence6 != null) {
                c33582mzF.KWHzl(-3, charSequence6, this.getNewProxyInstance, (android.os.Message) null);
            }
            if (this.ejfBZ != null || this.valueOf != null || this.AEQbTJ != null) {
                KWHzl(c33582mzF);
            }
            if (this.OcIXYQ == null) {
                int i3 = this.dNCPSb;
                if (i3 != 0) {
                    c33582mzF.copydefault(i3);
                    return;
                }
                return;
            }
            if (this.QVAiDq) {
                c33582mzF.copydefault(this.QfsBiF, this.RJOkX, this.QUSxYX, this.QbewEr);
            }
            if (this.QKVWgx) {
                c33582mzF.OLrzqt(this.ORxRYg, this.DTwDnp, this.QOLQEE, this.sSMYrx);
            }
            if (this.djSkpj) {
                c33582mzF.EZpvd(this.OcIXYQ, this.UeEOUB, this.finit, this.aKErDB, this.RcXXUw);
            } else {
                c33582mzF.copydefault(this.OcIXYQ);
            }
        }

        public final void KWHzl(final C33582mzF c33582mzF) {
            int i;
            android.widget.ListAdapter application;
            final StateListAnimator stateListAnimator = (StateListAnimator) this.isConnected.inflate(c33582mzF.zLjUOn, (android.view.ViewGroup) null);
            if (!this.DbNXlk) {
                if (this.fetchVPNInfo) {
                    i = c33582mzF.zuBGHE;
                } else {
                    i = c33582mzF.getFieldNames;
                }
                int i2 = i;
                android.database.Cursor cursor = this.valueOf;
                if (cursor != null) {
                    application = new android.widget.SimpleCursorAdapter(this.gEmmrt, i2, cursor, new java.lang.String[]{this.AuCTel}, new int[]{android.R.id.text1});
                } else {
                    application = this.AEQbTJ;
                    if (application == null) {
                        application = new Application(this.gEmmrt, i2, android.R.id.text1, this.ejfBZ);
                    }
                }
            } else if (this.valueOf == null) {
                application = new android.widget.ArrayAdapter<java.lang.CharSequence>(this.gEmmrt, c33582mzF.AuCTelauCTel, android.R.id.text1, this.ejfBZ) { // from class: o.mzF.Activity.5
                    @Override // android.widget.ArrayAdapter, android.widget.Adapter
                    public android.view.View getView(int i3, android.view.View view, android.view.ViewGroup viewGroup) {
                        android.view.View view2 = super.getView(i3, view, viewGroup);
                        boolean[] zArr = Activity.this.KWHzl;
                        if (zArr != null && zArr[i3]) {
                            stateListAnimator.setItemChecked(i3, true);
                        }
                        return view2;
                    }
                };
            } else {
                application = new android.widget.CursorAdapter(this.gEmmrt, this.valueOf, false) { // from class: o.mzF.Activity.1
                    public final int KWHzl;
                    public final int copydefault;

                    {
                        android.database.Cursor cursor2 = getCursor();
                        this.KWHzl = cursor2.getColumnIndexOrThrow(Activity.this.AuCTel);
                        this.copydefault = cursor2.getColumnIndexOrThrow(Activity.this.values);
                    }

                    @Override // android.widget.CursorAdapter
                    public void bindView(android.view.View view, android.content.Context context, android.database.Cursor cursor2) {
                        ((android.widget.CheckedTextView) view.findViewById(android.R.id.text1)).setText(cursor2.getString(this.KWHzl));
                        stateListAnimator.setItemChecked(cursor2.getPosition(), cursor2.getInt(this.copydefault) == 1);
                    }

                    @Override // android.widget.CursorAdapter
                    public android.view.View newView(android.content.Context context, android.database.Cursor cursor2, android.view.ViewGroup viewGroup) {
                        return Activity.this.isConnected.inflate(c33582mzF.AuCTelauCTel, viewGroup, false);
                    }
                };
            }
            ActionBar actionBar = this.zsXlph;
            if (actionBar != null) {
                actionBar.KWHzl(stateListAnimator);
            }
            c33582mzF.KWHzl = application;
            c33582mzF.fJNWhG = this.copydefault;
            if (this.uzCIH != null) {
                stateListAnimator.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.mzF.Activity.4
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i3, long j) {
                        Activity.this.uzCIH.onClick(c33582mzF.fIwbmz, i3);
                        if (Activity.this.fetchVPNInfo) {
                            return;
                        }
                        c33582mzF.fIwbmz.dismiss();
                    }
                });
            } else if (this.getFieldNames != null) {
                stateListAnimator.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.mzF.Activity.3
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i3, long j) {
                        boolean[] zArr = Activity.this.KWHzl;
                        if (zArr != null) {
                            zArr[i3] = stateListAnimator.isItemChecked(i3);
                        }
                        Activity.this.getFieldNames.onClick(c33582mzF.fIwbmz, i3, stateListAnimator.isItemChecked(i3));
                    }
                });
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.AuCTelauCTel;
            if (onItemSelectedListener != null) {
                stateListAnimator.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.fetchVPNInfo) {
                stateListAnimator.setChoiceMode(1);
            } else if (this.DbNXlk) {
                stateListAnimator.setChoiceMode(2);
            }
            c33582mzF.wlaJM = stateListAnimator;
        }
    }

    /* JADX INFO: renamed from: o.mzF$Application */
    public static class Application extends android.widget.ArrayAdapter<java.lang.CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }

        public Application(android.content.Context context, int i, int i2, java.lang.CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }
    }
}
