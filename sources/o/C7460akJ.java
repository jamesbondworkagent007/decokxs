package o;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.ViewGroup;

/* JADX INFO: renamed from: o.akJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7460akJ {
    public static int EZpvd(android.widget.TextView textView, int i) {
        return java.lang.Math.min(textView.getMaxLines(), OLrzqt(textView, (i - textView.getCompoundPaddingLeft()) - textView.getCompoundPaddingRight()).getLineCount()) * textView.getLineHeight();
    }

    public static android.text.StaticLayout OLrzqt(android.widget.TextView textView, int i) {
        StaticLayout.Builder maxLines = StaticLayout.Builder.obtain(textView.getText(), 0, textView.getText().length(), textView.getPaint(), i).setAlignment(Layout.Alignment.ALIGN_NORMAL).setTextDirection(android.text.TextDirectionHeuristics.LOCALE).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(textView.getMaxLines() == -1 ? Integer.MAX_VALUE : textView.getMaxLines());
        if (Build.VERSION.SDK_INT >= 26) {
            maxLines.setJustificationMode(textView.getJustificationMode());
        }
        if (textView.getEllipsize() != null && textView.getKeyListener() == null) {
            maxLines.setEllipsize(textView.getEllipsize()).setEllipsizedWidth(i);
        }
        return maxLines.build();
    }

    public static void OLrzqt(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        marginLayoutParams.setMargins(i, i2, i3, i4);
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.setMarginEnd(i3);
    }
}
