package o;

import android.content.ClipData;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class oIY extends OKEditText {
    public final InterfaceC56387yDm KWHzl;
    public Function1<? super java.util.List<? extends android.net.Uri>, Unit> OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oIY(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oIY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnImagePaste(Function1<? super java.util.List<? extends android.net.Uri>, Unit> function1) {
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] androidx.appcompat.R.attr.editTextStyle int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.oIY.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ oIY(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? androidx.appcompat.R.attr.editTextStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oIY(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.oJb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oIY.EZpvd(context);
            }
        });
        ViewCompat.setOnReceiveContentListener(this, new java.lang.String[]{"image/*", "video/*"}, new OnReceiveContentListener() { // from class: o.oJa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnReceiveContentListener
            public final ContentInfoCompat onReceiveContent(android.view.View view, ContentInfoCompat contentInfoCompat) {
                return oIY.KWHzl(this.OLrzqt, view, contentInfoCompat);
            }
        });
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oIY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    private final android.content.ClipboardManager KWHzl() {
        return (android.content.ClipboardManager) this.KWHzl.getValue();
    }

    public static final android.content.ClipboardManager EZpvd(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("clipboard");
        Intrinsics.copydefault(systemService, "");
        return (android.content.ClipboardManager) systemService;
    }

    public static final ContentInfoCompat KWHzl(oIY oiy, android.view.View view, ContentInfoCompat contentInfoCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(contentInfoCompat, "");
        return oiy.copydefault(contentInfoCompat);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(@NotNull android.view.inputmethod.EditorInfo editorInfo) {
        Intrinsics.checkNotNullParameter(editorInfo, "");
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        EditorInfoCompat.setContentMimeTypes(editorInfo, new java.lang.String[]{"image/*", "video/*"});
        return InputConnectionCompat.createWrapper(this, inputConnectionOnCreateInputConnection, editorInfo);
    }

    public final ContentInfoCompat copydefault(ContentInfoCompat contentInfoCompat) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object obj;
        ContentInfoCompat contentInfoCompat2;
        try {
            Result.Application application = Result.Companion;
            android.content.ClipData clip = contentInfoCompat.getClip();
            Intrinsics.checkNotNullExpressionValue(clip, "");
            java.util.List<ClipData.Item> listEZpvd = EZpvd(clip);
            if (!listEZpvd.isEmpty()) {
                OLrzqt(listEZpvd);
                contentInfoCompat2 = null;
            } else {
                contentInfoCompat2 = contentInfoCompat;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(contentInfoCompat2);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            obj = objM7377constructorimpl;
        } else {
            pUU.AEQbTJ("OKRichPasteEditText", "Error handling rich content", thM7380exceptionOrNullimpl);
            obj = contentInfoCompat;
        }
        return (ContentInfoCompat) obj;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            copydefault();
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public final void copydefault() {
        android.content.ClipData primaryClip = KWHzl().getPrimaryClip();
        if (primaryClip == null) {
            return;
        }
        java.util.List<ClipData.Item> listEZpvd = EZpvd(primaryClip);
        if (listEZpvd.isEmpty()) {
            return;
        }
        android.content.ClipDescription description = primaryClip.getDescription();
        if (description.hasMimeType("text/*")) {
            OLrzqt((ClipData.Item) CollectionsKt___CollectionsKt.AuCTelauCTel(listEZpvd));
        } else if (description.hasMimeType("image/*") || description.hasMimeType("video/*")) {
            OLrzqt(listEZpvd);
        }
    }

    public final void OLrzqt(ClipData.Item item) {
        java.lang.CharSequence charSequenceCoerceToText = item.coerceToText(getContext());
        int iCopydefault = C56548yJl.copydefault(getSelectionStart(), 0);
        int iCopydefault2 = C56548yJl.copydefault(getSelectionEnd(), 0);
        getEditableText().replace(C56548yJl.valueOf(iCopydefault, iCopydefault2), C56548yJl.copydefault(iCopydefault, iCopydefault2), charSequenceCoerceToText, 0, charSequenceCoerceToText.length());
    }

    public final java.util.List<ClipData.Item> EZpvd(android.content.ClipData clipData) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int itemCount = clipData.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            ClipData.Item itemAt = clipData.getItemAt(i);
            Intrinsics.checkNotNullExpressionValue(itemAt, "");
            arrayList.add(itemAt);
        }
        return arrayList;
    }

    @Override // com.okinc.uilab.edit.OKEditText, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.OLrzqt = null;
    }

    public final void OLrzqt(java.util.List<? extends ClipData.Item> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (ClipData.Item item : list) {
            pUU.EZpvd("OKRichPasteEditText", "item.uri: " + item.getUri());
            android.net.Uri uri = item.getUri();
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        Function1<? super java.util.List<? extends android.net.Uri>, Unit> function1 = this.OLrzqt;
        if (function1 != null) {
            function1.invoke(arrayList);
        }
    }
}
