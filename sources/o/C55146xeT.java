package o;

import android.graphics.Color;
import androidx.compose.material.OutlinedTextFieldKt;
import com.amplifyframework.core.model.ModelIdentifier;
import com.google.firebase.messaging.Constants;
import com.okinc.uilab.richtext.htmlspanner.style.Style;
import com.okinc.uilab.richtext.htmlspanner.style.StyleValue;
import java.util.Objects;

/* JADX INFO: renamed from: o.xeT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55146xeT {

    /* JADX INFO: renamed from: o.xeT$Application */
    public interface Application {
        boolean AEQbTJ(C59895zpo c59895zpo);
    }

    /* JADX INFO: renamed from: o.xeT$StateListAnimator */
    public interface StateListAnimator {
        Style OLrzqt(Style style, C55135xeI c55135xeI);
    }

    public static float EZpvd(int i) {
        if (i == 1) {
            return 0.6f;
        }
        if (i == 2) {
            return 0.8f;
        }
        if (i == 4) {
            return 1.2f;
        }
        if (i == 5) {
            return 1.4f;
        }
        if (i != 6) {
            return i != 7 ? 1.0f : 1.8f;
        }
        return 1.6f;
    }

    public static C55150xeX copydefault(C57845yqB c57845yqB, C55135xeI c55135xeI) {
        Objects.toString(c57845yqB);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<C57849yqF> it = c57845yqB.OLrzqt().iterator();
        while (it.hasNext()) {
            arrayList.add(OLrzqt(it.next()));
        }
        Style style = new Style();
        for (C57846yqC c57846yqC : c57845yqB.copydefault()) {
            StateListAnimator stateListAnimatorCopydefault = copydefault(c57846yqC.EZpvd(), c57846yqC.KWHzl());
            if (stateListAnimatorCopydefault != null) {
                arrayList2.add(stateListAnimatorCopydefault);
                style = stateListAnimatorCopydefault.OLrzqt(style, c55135xeI);
            }
        }
        Objects.toString(style);
        return new C55150xeX(c55135xeI, arrayList, arrayList2, c57845yqB.toString());
    }

    public static java.lang.Integer KWHzl(java.lang.String str) {
        if (str.length() == 4 && str.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER);
            for (int i = 1; i < str.length(); i++) {
                sb.append(str.charAt(i));
                sb.append(str.charAt(i));
            }
            str = sb.toString();
        }
        return java.lang.Integer.valueOf(Color.parseColor(str));
    }

    public static java.util.List<Application> OLrzqt(C57849yqF c57849yqF) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] strArrSplit = c57849yqF.toString().split("\\s");
        for (int length = strArrSplit.length - 1; length >= 0; length--) {
            arrayList.add(EZpvd(strArrSplit[length]));
        }
        return arrayList;
    }

    public static Application EZpvd(java.lang.String str) {
        byte b = 0;
        byte b2 = 0;
        if (str.indexOf(46) != -1) {
            return new ActionBar(str);
        }
        if (str.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER)) {
            return new Activity(str);
        }
        return new TaskDescription(str);
    }

    /* JADX INFO: renamed from: o.xeT$ActionBar */
    public static class ActionBar implements Application {
        public java.lang.String KWHzl;
        public java.lang.String copydefault;

        public ActionBar(java.lang.String str) {
            java.lang.String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length == 2) {
                this.KWHzl = strArrSplit[0];
                this.copydefault = strArrSplit[1];
            }
        }

        @Override // o.C55146xeT.Application
        public boolean AEQbTJ(C59895zpo c59895zpo) {
            java.lang.String strEZpvd;
            if (c59895zpo == null) {
                return false;
            }
            java.lang.String str = this.KWHzl;
            return (str == null || str.length() <= 0 || this.KWHzl.equals(c59895zpo.values())) && (strEZpvd = c59895zpo.EZpvd("class")) != null && strEZpvd.equals(this.copydefault);
        }
    }

    /* JADX INFO: renamed from: o.xeT$TaskDescription */
    public static class TaskDescription implements Application {
        public java.lang.String copydefault;

        public TaskDescription(java.lang.String str) {
            this.copydefault = str.trim();
        }

        @Override // o.C55146xeT.Application
        public boolean AEQbTJ(C59895zpo c59895zpo) {
            return c59895zpo != null && this.copydefault.equalsIgnoreCase(c59895zpo.values());
        }
    }

    /* JADX INFO: renamed from: o.xeT$Activity */
    public static class Activity implements Application {
        public java.lang.String KWHzl;

        public Activity(java.lang.String str) {
            this.KWHzl = str.substring(1);
        }

        @Override // o.C55146xeT.Application
        public boolean AEQbTJ(C59895zpo c59895zpo) {
            java.lang.String strEZpvd;
            return (c59895zpo == null || (strEZpvd = c59895zpo.EZpvd("id")) == null || !strEZpvd.equals(this.KWHzl)) ? false : true;
        }
    }

    public static StateListAnimator copydefault(final java.lang.String str, final java.lang.String str2) {
        final StyleValue styleValueCopydefault;
        final StyleValue styleValueCopydefault2;
        final StyleValue styleValueCopydefault3;
        final StyleValue styleValueCopydefault4;
        final StyleValue styleValueCopydefault5;
        if ("color".equals(str)) {
            try {
                final java.lang.Integer numKWHzl = KWHzl(str2);
                return new StateListAnimator() { // from class: o.xeT.2
                    @Override // o.C55146xeT.StateListAnimator
                    public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                        return style.copydefault(numKWHzl);
                    }
                };
            } catch (java.lang.IllegalArgumentException unused) {
                return null;
            }
        }
        if ("background-color".equals(str)) {
            try {
                final java.lang.Integer numKWHzl2 = KWHzl(str2);
                return new StateListAnimator() { // from class: o.xeT.11
                    @Override // o.C55146xeT.StateListAnimator
                    public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                        return style.EZpvd(numKWHzl2);
                    }
                };
            } catch (java.lang.IllegalArgumentException unused2) {
                return null;
            }
        }
        if ("align".equals(str) || "text-align".equals(str)) {
            try {
                final Style.TextAlignment textAlignmentValueOf = Style.TextAlignment.valueOf(str2.toUpperCase());
                return new StateListAnimator() { // from class: o.xeT.12
                    @Override // o.C55146xeT.StateListAnimator
                    public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                        return style.EZpvd(textAlignmentValueOf);
                    }
                };
            } catch (java.lang.IllegalArgumentException unused3) {
                return null;
            }
        }
        if ("font-weight".equals(str)) {
            try {
                final Style.FontWeight fontWeightValueOf = Style.FontWeight.valueOf(str2.toUpperCase());
                return new StateListAnimator() { // from class: o.xeT.13
                    @Override // o.C55146xeT.StateListAnimator
                    public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                        return style.KWHzl(fontWeightValueOf);
                    }
                };
            } catch (java.lang.IllegalArgumentException unused4) {
                return null;
            }
        }
        if ("font-style".equals(str)) {
            try {
                final Style.FontStyle fontStyleValueOf = Style.FontStyle.valueOf(str2.toUpperCase());
                return new StateListAnimator() { // from class: o.xeT.15
                    @Override // o.C55146xeT.StateListAnimator
                    public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                        return style.EZpvd(fontStyleValueOf);
                    }
                };
            } catch (java.lang.IllegalArgumentException unused5) {
                return null;
            }
        }
        if ("font-family".equals(str)) {
            return new StateListAnimator() { // from class: o.xeT.17
                @Override // o.C55146xeT.StateListAnimator
                public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                    C55130xeD c55130xeDEZpvd = c55135xeI.EZpvd(str2);
                    Objects.toString(c55130xeDEZpvd);
                    return style.OLrzqt(c55130xeDEZpvd);
                }
            };
        }
        if ("font-size".equals(str)) {
            final StyleValue styleValueCopydefault6 = StyleValue.copydefault(str2);
            if (styleValueCopydefault6 != null) {
                return new StateListAnimator() { // from class: o.xeT.20
                    @Override // o.C55146xeT.StateListAnimator
                    public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                        return style.copydefault(styleValueCopydefault6);
                    }
                };
            }
            try {
                final java.lang.Float fValueOf = java.lang.Float.valueOf(EZpvd(java.lang.Integer.parseInt(str2)));
                return new StateListAnimator() { // from class: o.xeT.18
                    @Override // o.C55146xeT.StateListAnimator
                    public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                        return style.copydefault(new StyleValue(fValueOf.floatValue(), StyleValue.Unit.EM));
                    }
                };
            } catch (java.lang.NumberFormatException unused6) {
                return null;
            }
        }
        if ("margin-bottom".equals(str) && (styleValueCopydefault5 = StyleValue.copydefault(str2)) != null) {
            return new StateListAnimator() { // from class: o.xeT.19
                @Override // o.C55146xeT.StateListAnimator
                public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                    return style.OLrzqt(styleValueCopydefault5);
                }
            };
        }
        if ("margin-top".equals(str) && (styleValueCopydefault4 = StyleValue.copydefault(str2)) != null) {
            return new StateListAnimator() { // from class: o.xeT.3
                @Override // o.C55146xeT.StateListAnimator
                public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                    return style.AhwBna(styleValueCopydefault4);
                }
            };
        }
        if ("margin-left".equals(str) && (styleValueCopydefault3 = StyleValue.copydefault(str2)) != null) {
            return new StateListAnimator() { // from class: o.xeT.4
                @Override // o.C55146xeT.StateListAnimator
                public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                    return style.AEQbTJ(styleValueCopydefault3);
                }
            };
        }
        if ("margin-right".equals(str) && (styleValueCopydefault2 = StyleValue.copydefault(str2)) != null) {
            return new StateListAnimator() { // from class: o.xeT.1
                @Override // o.C55146xeT.StateListAnimator
                public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                    return style.KWHzl(styleValueCopydefault2);
                }
            };
        }
        if ("margin".equals(str)) {
            return AEQbTJ(str2);
        }
        if ("text-indent".equals(str) && (styleValueCopydefault = StyleValue.copydefault(str2)) != null) {
            return new StateListAnimator() { // from class: o.xeT.5
                @Override // o.C55146xeT.StateListAnimator
                public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                    return style.valueOf(styleValueCopydefault);
                }
            };
        }
        if (Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION.equals(str)) {
            try {
                final Style.DisplayStyle displayStyleValueOf = Style.DisplayStyle.valueOf(str2.toUpperCase());
                return new StateListAnimator() { // from class: o.xeT.8
                    @Override // o.C55146xeT.StateListAnimator
                    public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                        return style.AEQbTJ(displayStyleValueOf);
                    }
                };
            } catch (java.lang.IllegalArgumentException unused7) {
                return null;
            }
        }
        if ("border-style".equals(str)) {
            try {
                final Style.BorderStyle borderStyleValueOf = Style.BorderStyle.valueOf(str2.toUpperCase());
                return new StateListAnimator() { // from class: o.xeT.10
                    @Override // o.C55146xeT.StateListAnimator
                    public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                        return style.AEQbTJ(borderStyleValueOf);
                    }
                };
            } catch (java.lang.IllegalArgumentException unused8) {
                return null;
            }
        }
        if ("border-color".equals(str)) {
            try {
                final java.lang.Integer numKWHzl3 = KWHzl(str2);
                return new StateListAnimator() { // from class: o.xeT.6
                    @Override // o.C55146xeT.StateListAnimator
                    public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                        return style.AEQbTJ(numKWHzl3);
                    }
                };
            } catch (java.lang.IllegalArgumentException unused9) {
                return null;
            }
        }
        if ("border-width".equals(str)) {
            final StyleValue styleValueCopydefault7 = StyleValue.copydefault(str2);
            if (styleValueCopydefault7 != null) {
                return new StateListAnimator() { // from class: o.xeT.9
                    @Override // o.C55146xeT.StateListAnimator
                    public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                        return style.EZpvd(styleValueCopydefault7);
                    }
                };
            }
            return null;
        }
        if (OutlinedTextFieldKt.BorderId.equals(str)) {
            return copydefault(str2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static StateListAnimator copydefault(java.lang.String str) {
        final java.lang.Integer numKWHzl = null;
        final Style.BorderStyle borderStyleValueOf = null;
        final StyleValue styleValueCopydefault = null;
        for (java.lang.String str2 : str.split("\\s")) {
            if (styleValueCopydefault != null || (styleValueCopydefault = StyleValue.copydefault(str2)) == null) {
                if (numKWHzl == null) {
                    try {
                        numKWHzl = KWHzl(str2);
                    } catch (java.lang.IllegalArgumentException unused) {
                        if (borderStyleValueOf != null) {
                        }
                    }
                } else if (borderStyleValueOf != null) {
                    try {
                        borderStyleValueOf = Style.BorderStyle.valueOf(str2.toUpperCase());
                    } catch (java.lang.IllegalArgumentException unused2) {
                    }
                }
            }
        }
        return new StateListAnimator() { // from class: o.xeT.7
            @Override // o.C55146xeT.StateListAnimator
            public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                java.lang.Integer num = numKWHzl;
                if (num != null) {
                    style = style.AEQbTJ(num);
                }
                StyleValue styleValue = styleValueCopydefault;
                if (styleValue != null) {
                    style = style.EZpvd(styleValue);
                }
                Style.BorderStyle borderStyle = borderStyleValueOf;
                return borderStyle != null ? style.AEQbTJ(borderStyle) : style;
            }
        };
    }

    public static StateListAnimator AEQbTJ(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String[] strArrSplit = str.split("\\s");
        if (strArrSplit.length == 1) {
            str2 = strArrSplit[0];
        } else {
            if (strArrSplit.length == 2) {
                str5 = strArrSplit[0];
                str2 = strArrSplit[1];
                str3 = str2;
                str4 = str5;
            } else if (strArrSplit.length == 3) {
                str6 = strArrSplit[0];
                java.lang.String str8 = strArrSplit[1];
                str7 = strArrSplit[2];
                str2 = str8;
                str4 = str6;
                str5 = str7;
                str3 = str2;
            } else if (strArrSplit.length == 4) {
                java.lang.String str9 = strArrSplit[0];
                str3 = strArrSplit[1];
                java.lang.String str10 = strArrSplit[2];
                str2 = strArrSplit[3];
                str4 = str9;
                str5 = str10;
            } else {
                str2 = "";
            }
            final StyleValue styleValueCopydefault = StyleValue.copydefault(str5);
            final StyleValue styleValueCopydefault2 = StyleValue.copydefault(str4);
            final StyleValue styleValueCopydefault3 = StyleValue.copydefault(str2);
            final StyleValue styleValueCopydefault4 = StyleValue.copydefault(str3);
            return new StateListAnimator() { // from class: o.xeT.14
                @Override // o.C55146xeT.StateListAnimator
                public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                    StyleValue styleValue = styleValueCopydefault;
                    if (styleValue != null) {
                        style = style.OLrzqt(styleValue);
                    }
                    StyleValue styleValue2 = styleValueCopydefault2;
                    if (styleValue2 != null) {
                        style = style.AhwBna(styleValue2);
                    }
                    StyleValue styleValue3 = styleValueCopydefault3;
                    if (styleValue3 != null) {
                        style = style.AEQbTJ(styleValue3);
                    }
                    StyleValue styleValue4 = styleValueCopydefault4;
                    return styleValue4 != null ? style.KWHzl(styleValue4) : style;
                }
            };
        }
        str6 = str2;
        str7 = str6;
        str4 = str6;
        str5 = str7;
        str3 = str2;
        final StyleValue styleValueCopydefault5 = StyleValue.copydefault(str5);
        final StyleValue styleValueCopydefault22 = StyleValue.copydefault(str4);
        final StyleValue styleValueCopydefault32 = StyleValue.copydefault(str2);
        final StyleValue styleValueCopydefault42 = StyleValue.copydefault(str3);
        return new StateListAnimator() { // from class: o.xeT.14
            @Override // o.C55146xeT.StateListAnimator
            public Style OLrzqt(Style style, C55135xeI c55135xeI) {
                StyleValue styleValue = styleValueCopydefault5;
                if (styleValue != null) {
                    style = style.OLrzqt(styleValue);
                }
                StyleValue styleValue2 = styleValueCopydefault22;
                if (styleValue2 != null) {
                    style = style.AhwBna(styleValue2);
                }
                StyleValue styleValue3 = styleValueCopydefault32;
                if (styleValue3 != null) {
                    style = style.AEQbTJ(styleValue3);
                }
                StyleValue styleValue4 = styleValueCopydefault42;
                return styleValue4 != null ? style.KWHzl(styleValue4) : style;
            }
        };
    }
}
