package com.geetest.gtc4;

import java.util.LinkedHashMap;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes21.dex */
public final class q5 extends s1 {
    public final LinkedHashMap d;
    public final LinkedList e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q5() {
        super(p5.MAP);
        this.e = new LinkedList();
        this.d = new LinkedHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.s1, com.geetest.gtc4.f3
    public final boolean equals(Object obj) {
        if (obj instanceof q5) {
            q5 q5Var = (q5) obj;
            if (super.equals(obj) && this.d.equals(q5Var.d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.s1, com.geetest.gtc4.f3
    public final int hashCode() {
        return super.hashCode() ^ this.d.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.c) {
            sb.append("{_ ");
        } else {
            sb.append("{ ");
        }
        for (f3 f3Var : this.e) {
            sb.append(f3Var);
            sb.append(": ");
            sb.append(this.d.get(f3Var));
            sb.append(", ");
        }
        if (sb.toString().endsWith(", ")) {
            sb.setLength(sb.length() - 2);
        }
        sb.append(" }");
        return sb.toString();
    }

    public q5(int i) {
        super(p5.MAP);
        this.e = new LinkedList();
        this.d = new LinkedHashMap(i);
    }
}
