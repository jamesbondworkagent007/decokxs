package o;

import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wQx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC52586wQx extends AbstractC52583wQu {
    public java.util.ArrayList<android.widget.TextView> AkhnZx;
    public android.widget.TextView fetchVPNInfo;
    public java.util.ArrayList<android.widget.TextView> isConnected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC52586wQx(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.AbstractC52583wQu
    public android.view.View EZpvd(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.gvFztT, viewGroup, true);
        android.content.Context context = viewInflate.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            android.content.Context context2 = viewInflate.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            viewInflate.setLayoutDirection(C55296xhK.AEQbTJ(context2));
        }
        this.fetchVPNInfo = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.allOf);
        this.isConnected = new java.util.ArrayList<>();
        this.AkhnZx = new java.util.ArrayList<>();
        java.util.ArrayList arrayList = this.isConnected;
        java.util.ArrayList arrayList2 = null;
        if (arrayList == null) {
            Intrinsics.gEmmrt("");
            arrayList = null;
        }
        arrayList.add(viewInflate.findViewById(C48033uCm.Application.level));
        java.util.ArrayList arrayList3 = this.isConnected;
        if (arrayList3 == null) {
            Intrinsics.gEmmrt("");
            arrayList3 = null;
        }
        arrayList3.add(viewInflate.findViewById(C48033uCm.Application.RequiresOptInLevel));
        java.util.ArrayList arrayList4 = this.isConnected;
        if (arrayList4 == null) {
            Intrinsics.gEmmrt("");
            arrayList4 = null;
        }
        arrayList4.add(viewInflate.findViewById(C48033uCm.Application.RequiresPermission));
        java.util.ArrayList arrayList5 = this.isConnected;
        if (arrayList5 == null) {
            Intrinsics.gEmmrt("");
            arrayList5 = null;
        }
        arrayList5.add(viewInflate.findViewById(C48033uCm.Application.RequiresPermissionRead));
        java.util.ArrayList arrayList6 = this.isConnected;
        if (arrayList6 == null) {
            Intrinsics.gEmmrt("");
            arrayList6 = null;
        }
        arrayList6.add(viewInflate.findViewById(C48033uCm.Application.RequiresPermissionWrite));
        java.util.ArrayList arrayList7 = this.AkhnZx;
        if (arrayList7 == null) {
            Intrinsics.gEmmrt("");
            arrayList7 = null;
        }
        arrayList7.add(viewInflate.findViewById(C48033uCm.Application.setTitleOptionalHint));
        java.util.ArrayList arrayList8 = this.AkhnZx;
        if (arrayList8 == null) {
            Intrinsics.gEmmrt("");
            arrayList8 = null;
        }
        arrayList8.add(viewInflate.findViewById(C48033uCm.Application.onSubMenuSelected));
        java.util.ArrayList arrayList9 = this.AkhnZx;
        if (arrayList9 == null) {
            Intrinsics.gEmmrt("");
            arrayList9 = null;
        }
        arrayList9.add(viewInflate.findViewById(C48033uCm.Application.invalidate));
        java.util.ArrayList arrayList10 = this.AkhnZx;
        if (arrayList10 == null) {
            Intrinsics.gEmmrt("");
            arrayList10 = null;
        }
        arrayList10.add(viewInflate.findViewById(C48033uCm.Application.onCloseSubMenu));
        java.util.ArrayList<android.widget.TextView> arrayList11 = this.AkhnZx;
        if (arrayList11 == null) {
            Intrinsics.gEmmrt("");
        } else {
            arrayList2 = arrayList11;
        }
        arrayList2.add(viewInflate.findViewById(C48033uCm.Application.isTitleOptional));
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return viewInflate;
    }

    public final void setTitleText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.TextView textView = this.fetchVPNInfo;
        android.widget.TextView textView2 = null;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setText(str);
        android.widget.TextView textView3 = this.fetchVPNInfo;
        if (textView3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            textView2 = textView3;
        }
        textView2.setVisibility(0);
    }

    public final void setLeftTitleText(@NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        setLeftTitleText(yDV.AwvSrB(strArr));
    }

    public final void setRightValueText(@NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        setRightValueText(yDV.AwvSrB(strArr));
    }

    public final void setLeftTitleText(@androidx.annotation.StringRes @NotNull int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(iArr.length);
        for (int i : iArr) {
            java.lang.String string = getContext().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            arrayList.add(string);
        }
        setLeftTitleText(arrayList);
    }

    public final void setLeftTitleTextRes(@NotNull java.util.List<java.lang.Integer> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String string = getContext().getString(((java.lang.Number) it.next()).intValue());
            Intrinsics.checkNotNullExpressionValue(string, "");
            arrayList.add(string);
        }
        setLeftTitleText(arrayList);
    }

    public final void setLeftTitleText(@NotNull java.util.List<java.lang.String> list) {
        java.util.ArrayList<android.widget.TextView> arrayList;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        int i = 0;
        while (true) {
            arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) next;
            java.util.ArrayList<android.widget.TextView> arrayList2 = this.isConnected;
            if (arrayList2 == null) {
                Intrinsics.gEmmrt("");
                arrayList2 = null;
            }
            if (i < arrayList2.size()) {
                java.util.ArrayList<android.widget.TextView> arrayList3 = this.isConnected;
                if (arrayList3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    arrayList = arrayList3;
                }
                arrayList.get(i).setText(str);
            }
            i++;
        }
        java.util.ArrayList<android.widget.TextView> arrayList4 = this.isConnected;
        if (arrayList4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            arrayList = arrayList4;
        }
        int i2 = 0;
        for (java.lang.Object obj : arrayList) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            android.widget.TextView textView = (android.widget.TextView) obj;
            if (i2 < list.size()) {
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            i2++;
        }
    }

    public final void setRightValueText(@NotNull java.util.List<java.lang.String> list) {
        java.util.ArrayList<android.widget.TextView> arrayList;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        int i = 0;
        while (true) {
            arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) next;
            java.util.ArrayList<android.widget.TextView> arrayList2 = this.AkhnZx;
            if (arrayList2 == null) {
                Intrinsics.gEmmrt("");
                arrayList2 = null;
            }
            if (i < arrayList2.size()) {
                java.util.ArrayList<android.widget.TextView> arrayList3 = this.AkhnZx;
                if (arrayList3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    arrayList = arrayList3;
                }
                arrayList.get(i).setText(str);
            }
            i++;
        }
        java.util.ArrayList<android.widget.TextView> arrayList4 = this.AkhnZx;
        if (arrayList4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            arrayList = arrayList4;
        }
        int i2 = 0;
        for (java.lang.Object obj : arrayList) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            android.widget.TextView textView = (android.widget.TextView) obj;
            if (i2 < list.size()) {
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            i2++;
        }
    }

    public final void setContents(@NotNull Triple<java.lang.String, java.lang.String, java.lang.Integer>... tripleArr) {
        Intrinsics.checkNotNullParameter(tripleArr, "");
        int i = 1;
        if (tripleArr.length != 0) {
            Triple<java.lang.String, java.lang.String, java.lang.Integer> triple = tripleArr[0];
            int iZLjUOn = yDV.zLjUOn(tripleArr);
            if (iZLjUOn != 0) {
                int length = triple.getFirst().length();
                if (1 <= iZLjUOn) {
                    int i2 = 1;
                    while (true) {
                        int length2 = tripleArr[i2].getFirst().length();
                        if (length < length2) {
                            length = length2;
                        }
                        if (i2 == iZLjUOn) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        if (tripleArr.length != 0) {
            Triple<java.lang.String, java.lang.String, java.lang.Integer> triple2 = tripleArr[0];
            int iZLjUOn2 = yDV.zLjUOn(tripleArr);
            if (iZLjUOn2 != 0) {
                int length3 = triple2.getSecond().length();
                if (1 <= iZLjUOn2) {
                    while (true) {
                        int length4 = tripleArr[i].getSecond().length();
                        if (length3 < length4) {
                            length3 = length4;
                        }
                        if (i == iZLjUOn2) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(tripleArr.length);
        for (Triple<java.lang.String, java.lang.String, java.lang.Integer> triple3 : tripleArr) {
            arrayList.add(triple3.getSecond());
        }
        setRightValueText(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(tripleArr.length);
        for (Triple<java.lang.String, java.lang.String, java.lang.Integer> triple4 : tripleArr) {
            arrayList2.add(java.lang.Integer.valueOf(triple4.getThird().intValue()));
        }
        AEQbTJ(arrayList2);
    }

    private final void AEQbTJ(java.util.List<java.lang.Integer> list) {
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            int iIntValue = ((java.lang.Number) obj).intValue();
            java.util.ArrayList<android.widget.TextView> arrayList = this.AkhnZx;
            if (arrayList == null) {
                Intrinsics.gEmmrt("");
                arrayList = null;
            }
            android.widget.TextView textView = (android.widget.TextView) CollectionsKt___CollectionsKt.AkhnZx(arrayList, i);
            if (textView == null) {
                return;
            }
            textView.setTextColor(iIntValue);
            i++;
        }
    }
}
