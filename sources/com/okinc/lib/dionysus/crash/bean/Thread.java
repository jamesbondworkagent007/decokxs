package com.okinc.lib.dionysus.crash.bean;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class Thread {
    private List<StackFrame> frames = new ArrayList();
    private long id;
    private String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<StackFrame> getFrames() {
        return this.frames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFrames(List<StackFrame> list) {
        this.frames = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setId(long j) {
        this.id = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setName(String str) {
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Thread thread = (Thread) obj;
        if (this.id != thread.id) {
            return false;
        }
        String str = this.name;
        if (str == null ? thread.name != null : !str.equals(thread.name)) {
            return false;
        }
        List<StackFrame> list = this.frames;
        List<StackFrame> list2 = thread.frames;
        return list != null ? list.equals(list2) : list2 == null;
    }

    public int hashCode() {
        long j = this.id;
        int i = (int) (j ^ (j >>> 32));
        String str = this.name;
        int iHashCode = str != null ? str.hashCode() : 0;
        List<StackFrame> list = this.frames;
        return (((i * 31) + iHashCode) * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "Thread{id=" + this.id + ", name='" + this.name + "', frames=" + this.frames + AbstractJsonLexerKt.END_OBJ;
    }
}
