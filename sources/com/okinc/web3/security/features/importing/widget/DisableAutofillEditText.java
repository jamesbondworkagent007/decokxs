package com.okinc.web3.security.features.importing.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt$$ExternalSyntheticApiModelOutline0;
import com.okinc.uilab.edit.OKEditText;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public class DisableAutofillEditText extends OKEditText {
    public static final int $stable = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.View
    public void autofill(@NotNull SparseArray<AutofillValue> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "");
    }

    @Override // android.widget.TextView, android.view.View
    public void autofill(AutofillValue autofillValue) {
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
        return 0;
    }

    @Override // android.widget.TextView, android.view.View
    public Void getAutofillValue() {
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public /* synthetic */ AutofillValue getAutofillValue() {
        return AndroidAutofill_androidKt$$ExternalSyntheticApiModelOutline0.m(getAutofillValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisableAutofillEditText(@NotNull Context context) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisableAutofillEditText(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisableAutofillEditText(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
