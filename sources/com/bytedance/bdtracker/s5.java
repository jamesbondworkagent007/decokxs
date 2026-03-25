package com.bytedance.bdtracker;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.bytedance.applog.R;
import com.bytedance.applog.log.LoggerImpl;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray<String> f258a = new SparseArray<>(4);
    public static final Set<Integer> b = new HashSet(4);
    public static final LruCache<Class, String> c = new LruCache<>(100);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int a(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return 0;
        }
        return display.getDisplayId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String a(View view, boolean z) {
        int id;
        Object tag = view.getTag(84159242);
        if (tag != null && (tag instanceof String)) {
            return (String) tag;
        }
        if (!z && (id = view.getId()) > 2130706432 && !b.contains(Integer.valueOf(id))) {
            SparseArray<String> sparseArray = f258a;
            String str = sparseArray.get(id);
            if (str != null) {
                return str;
            }
            try {
                String resourceEntryName = view.getResources().getResourceEntryName(id);
                sparseArray.put(id, resourceEntryName);
                return resourceEntryName;
            } catch (Exception unused) {
                b.add(Integer.valueOf(id));
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(Class cls) {
        LruCache<Class, String> lruCache = c;
        String simpleName = lruCache.get(cls);
        if (TextUtils.isEmpty(simpleName)) {
            simpleName = cls.getSimpleName();
            if (TextUtils.isEmpty(simpleName)) {
                simpleName = "Anonymous";
            }
            lruCache.put(cls, simpleName);
            if (!a5.h && !a5.e && !a5.f136a && simpleName.contains("RecyclerView")) {
                try {
                    if (a5.a((Class<?>) cls) != null && a5.c != null) {
                        a5.b = cls;
                        a5.f136a = true;
                    }
                } catch (Exception e) {
                    LoggerImpl.global().error("checkCustomRecyclerView failed", e, new Object[0]);
                }
            }
        }
        return simpleName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String a(String str) {
        return str == null ? "" : (TextUtils.isEmpty(str) || str.length() <= 20) ? str : str.substring(0, 20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean a(Context context, int i) {
        return ((DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)).getDisplays()[0].getDisplayId() == i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean b(View view) {
        return view == null || view.getTag(R.id.applog_tag_ignore) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c6, code lost:
    
        if (r0.getText() != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f5, code lost:
    
        if (r0.getText() != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0103, code lost:
    
        if (r0.getText() != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0105, code lost:
    
        r0 = r0.getText();
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList<String> a(View view, String str) {
        String url;
        TextView textView;
        CharSequence text;
        Object tag = view.getTag(84159244);
        ArrayList<String> arrayList = null;
        if (tag != null) {
            url = String.valueOf(tag);
        } else {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                ArrayList<String> arrayList2 = new ArrayList<>(childCount);
                for (int i = 0; i < childCount && viewGroup.getChildAt(i).getVisibility() == 0; i++) {
                    arrayList2.addAll(a(viewGroup.getChildAt(i), (String) null));
                }
                url = null;
                arrayList = arrayList2;
            } else if (view instanceof EditText) {
                if (view.getTag(84159251) != null) {
                    EditText editText = (EditText) view;
                    int inputType = editText.getInputType() & 4095;
                    if (inputType == 129 || inputType == 225 || inputType == 18 || inputType == 145) {
                        url = null;
                    } else {
                        try {
                            Field declaredField = TextView.class.getDeclaredField("mText");
                            declaredField.setAccessible(true);
                            text = (CharSequence) declaredField.get(editText);
                        } catch (Throwable th) {
                            LoggerImpl.global().error(Collections.singletonList("ViewUtils"), "getEditTextText failed", th, new Object[0]);
                            text = null;
                        }
                        url = text == null ? "" : text.toString();
                    }
                }
            } else if (view instanceof RatingBar) {
                url = String.valueOf(((RatingBar) view).getRating());
            } else if (view instanceof Spinner) {
                Spinner spinner = (Spinner) view;
                Object selectedItem = spinner.getSelectedItem();
                if (selectedItem instanceof String) {
                    url = (String) selectedItem;
                } else {
                    View selectedView = spinner.getSelectedView();
                    if (selectedView instanceof TextView) {
                        textView = (TextView) selectedView;
                    }
                    url = null;
                }
            } else if (view instanceof SeekBar) {
                url = String.valueOf(((SeekBar) view).getProgress());
            } else if (view instanceof RadioGroup) {
                RadioGroup radioGroup = (RadioGroup) view;
                View viewFindViewById = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
                if (viewFindViewById != null && (viewFindViewById instanceof RadioButton)) {
                    textView = (RadioButton) viewFindViewById;
                }
                url = null;
            } else {
                if (view instanceof TextView) {
                    textView = (TextView) view;
                } else if (view instanceof ImageView) {
                    if (!TextUtils.isEmpty(str)) {
                        url = str;
                    }
                } else if (view instanceof WebView) {
                    WebView webView = (WebView) view;
                    if (!a(webView)) {
                        url = webView.getUrl();
                        if (url == null) {
                        }
                    } else if (!a5.b(view) || (url = ((com.tencent.smtt.sdk.WebView) view).getUrl()) == null) {
                    }
                }
                url = null;
            }
        }
        if (arrayList == null) {
            if (TextUtils.isEmpty(url)) {
                if (str == null) {
                    str = view.getContentDescription() != null ? view.getContentDescription().toString() : url;
                }
                url = a(str);
            }
            arrayList = new ArrayList<>(1);
            if (!TextUtils.isEmpty(url)) {
                arrayList.add(url);
            }
        }
        return arrayList;
    }

    public static boolean a(WebView webView) {
        Object obj;
        try {
            Field declaredField = WebView.class.getDeclaredField("mProvider");
            declaredField.setAccessible(true);
            obj = declaredField.get(webView);
        } catch (Exception e) {
            LoggerImpl.global().error(Collections.singletonList("ViewUtils"), "Check isDestroyed failed", e, new Object[0]);
        }
        if ("android.webkit.WebViewClassic".equals(obj)) {
            Field declaredField2 = obj.getClass().getDeclaredField("mWebViewCore");
            declaredField2.setAccessible(true);
            return declaredField2.get(obj) == null;
        }
        Field declaredField3 = obj.getClass().getDeclaredField("mAwContents");
        declaredField3.setAccessible(true);
        Object obj2 = declaredField3.get(obj);
        Method declaredMethod = obj2.getClass().getDeclaredMethod("isDestroyed", Integer.TYPE);
        declaredMethod.setAccessible(true);
        Object objInvoke = declaredMethod.invoke(obj2, 0);
        if (objInvoke instanceof Boolean) {
            return ((Boolean) objInvoke).booleanValue();
        }
        return false;
    }
}
