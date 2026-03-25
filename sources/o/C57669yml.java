package o;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.okinc.widget.dialog.ParcelableDialogDismissListener;
import com.okinc.widget.dialog.ParcelableOnCheckChangeListener;
import com.okinc.widget.dialog.ParcelableOnClickListener;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C57669yml;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57669yml extends androidx.fragment.app.DialogFragment {
    public static final Application Companion = new Application(null);

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return layoutInflater.inflate(C32113mPz.Fragment.hDKMBd, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        ParcelableDialogDismissListener parcelableDialogDismissListener;
        android.app.Dialog dialog;
        android.widget.TextView textView;
        android.view.Window window;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.app.Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        mPJ mpj = (mPJ) DataBindingUtil.bind(view);
        if (mpj != null) {
            mpj.KWHzl(new ActionBar());
        }
        android.os.Bundle arguments = getArguments();
        setCancelable(arguments != null ? arguments.getBoolean("cancelable") : true);
        if (mpj != null && (textView = mpj.AYXKKw) != null) {
            android.os.Bundle arguments2 = getArguments();
            textView.setSingleLine(arguments2 != null ? arguments2.getBoolean("title_single_line") : true);
        }
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (parcelableDialogDismissListener = (ParcelableDialogDismissListener) arguments3.getParcelable("dismiss_listener")) == null || (dialog = getDialog()) == null) {
            return;
        }
        dialog.setOnDismissListener(parcelableDialogDismissListener);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        android.app.Dialog dialog = getDialog();
        Intrinsics.copydefault(dialog);
        android.view.Window window = dialog.getWindow();
        Intrinsics.copydefault(window);
        WindowManager.LayoutParams attributes = window.getAttributes();
        Intrinsics.checkNotNullExpressionValue(attributes, "");
        C8124awn c8124awn = C8124awn.EZpvd;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ((ViewGroup.LayoutParams) attributes).width = (int) (((double) c8124awn.copydefault(contextRequireContext)) * 0.75d);
        android.app.Dialog dialog2 = getDialog();
        Intrinsics.copydefault(dialog2);
        android.view.Window window2 = dialog2.getWindow();
        Intrinsics.copydefault(window2);
        window2.setAttributes(attributes);
    }

    /* JADX INFO: renamed from: o.yml$ActionBar */
    public final class ActionBar {
        public final InterfaceC56387yDm AEQbTJ;
        public final ObservableBoolean AYXKKw;
        public final ObservableBoolean AhwBna;
        public final ObservableBoolean AkhnZx;
        public final ObservableField<java.lang.String> DbNXlk;
        public final ObservableBoolean EZpvd;
        public final ObservableField<java.lang.String> KWHzl;
        public final ObservableBoolean OLrzqt;
        public final InterfaceC56387yDm copydefault;
        public final ObservableField<java.lang.String> djBIcL;
        public final ObservableBoolean fetchVPNInfo;
        public final ObservableField<java.lang.String> gEmmrt;
        public final InterfaceC56387yDm isConnected;
        public final ObservableBoolean valueOf;
        public final ObservableField<java.lang.String> values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ObservableBoolean AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ObservableBoolean AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ObservableField<java.lang.String> AkhnZx() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ObservableField<java.lang.String> DbNXlk() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ObservableBoolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ObservableField<java.lang.String> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ObservableBoolean copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ObservableField<java.lang.String> djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ObservableField<java.lang.String> gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ObservableBoolean isConnected() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ObservableBoolean valueOf() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ObservableBoolean values() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
            ObservableField<java.lang.String> observableField = new ObservableField<>();
            this.DbNXlk = observableField;
            ObservableBoolean observableBoolean = new ObservableBoolean();
            this.AkhnZx = observableBoolean;
            ObservableField<java.lang.String> observableField2 = new ObservableField<>();
            this.gEmmrt = observableField2;
            ObservableBoolean observableBoolean2 = new ObservableBoolean();
            this.valueOf = observableBoolean2;
            ObservableField<java.lang.String> observableField3 = new ObservableField<>();
            this.KWHzl = observableField3;
            ObservableBoolean observableBoolean3 = new ObservableBoolean();
            this.AhwBna = observableBoolean3;
            ObservableBoolean observableBoolean4 = new ObservableBoolean();
            this.EZpvd = observableBoolean4;
            ObservableField<java.lang.String> observableField4 = new ObservableField<>();
            this.values = observableField4;
            ObservableBoolean observableBoolean5 = new ObservableBoolean();
            this.fetchVPNInfo = observableBoolean5;
            ObservableField<java.lang.String> observableField5 = new ObservableField<>();
            this.djBIcL = observableField5;
            ObservableBoolean observableBoolean6 = new ObservableBoolean();
            this.AYXKKw = observableBoolean6;
            ObservableBoolean observableBoolean7 = new ObservableBoolean();
            this.OLrzqt = observableBoolean7;
            this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.ymo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C57669yml.ActionBar.gEmmrt(c57669yml);
                }
            });
            this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.ymp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C57669yml.ActionBar.AEQbTJ(c57669yml);
                }
            });
            this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.ymr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C57669yml.ActionBar.EZpvd(c57669yml);
                }
            });
            android.os.Bundle arguments = C57669yml.this.getArguments();
            if (arguments != null) {
                observableField.set(arguments.getString("title"));
                java.lang.String str = observableField.get();
                boolean z = false;
                observableBoolean.set(!(str == null || str.length() == 0));
                observableField2.set(arguments.getString("content"));
                java.lang.String str2 = observableField2.get();
                observableBoolean2.set(!(str2 == null || str2.length() == 0));
                observableBoolean3.set(arguments.getBoolean("checked"));
                observableField3.set(arguments.getString("check_box_text"));
                java.lang.String str3 = observableField3.get();
                observableBoolean4.set(!(str3 == null || str3.length() == 0));
                observableField4.set(arguments.getString("positive_text"));
                java.lang.String str4 = observableField4.get();
                observableBoolean5.set(!(str4 == null || str4.length() == 0));
                observableField5.set(arguments.getString("negative_text"));
                java.lang.String str5 = observableField5.get();
                observableBoolean6.set(!(str5 == null || str5.length() == 0));
                if (observableBoolean5.get() && observableBoolean6.get()) {
                    z = true;
                }
                observableBoolean7.set(z);
            }
        }

        public final ParcelableOnClickListener fetchVPNInfo() {
            return (ParcelableOnClickListener) this.isConnected.getValue();
        }

        public static final ParcelableOnClickListener gEmmrt(C57669yml c57669yml) {
            android.os.Bundle arguments = c57669yml.getArguments();
            if (arguments != null) {
                return (ParcelableOnClickListener) arguments.getParcelable("positive_listener");
            }
            return null;
        }

        public final ParcelableOnClickListener KWHzl() {
            return (ParcelableOnClickListener) this.copydefault.getValue();
        }

        public static final ParcelableOnClickListener AEQbTJ(C57669yml c57669yml) {
            android.os.Bundle arguments = c57669yml.getArguments();
            if (arguments != null) {
                return (ParcelableOnClickListener) arguments.getParcelable("negative_listener");
            }
            return null;
        }

        public final ParcelableOnCheckChangeListener AEQbTJ() {
            return (ParcelableOnCheckChangeListener) this.AEQbTJ.getValue();
        }

        public static final ParcelableOnCheckChangeListener EZpvd(C57669yml c57669yml) {
            android.os.Bundle arguments = c57669yml.getArguments();
            if (arguments != null) {
                return (ParcelableOnCheckChangeListener) arguments.getParcelable("check_change_listener");
            }
            return null;
        }

        public final void fJNWhG() {
            ParcelableOnCheckChangeListener parcelableOnCheckChangeListenerAEQbTJ = AEQbTJ();
            if (parcelableOnCheckChangeListenerAEQbTJ != null) {
                parcelableOnCheckChangeListenerAEQbTJ.onCheckedChanged(null, this.AhwBna.get());
            }
        }

        public final void fIwbmz() {
            C57669yml.this.dismiss();
            ParcelableOnClickListener parcelableOnClickListenerFetchVPNInfo = fetchVPNInfo();
            if (parcelableOnClickListenerFetchVPNInfo != null) {
                parcelableOnClickListenerFetchVPNInfo.onClick(null);
            }
        }

        public final void ejfBZ() {
            C57669yml.this.dismiss();
            ParcelableOnClickListener parcelableOnClickListenerKWHzl = KWHzl();
            if (parcelableOnClickListenerKWHzl != null) {
                parcelableOnClickListenerKWHzl.onClick(null);
            }
        }
    }

    /* JADX INFO: renamed from: o.yml$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yml.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
