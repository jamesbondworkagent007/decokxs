import os
import sys
import zipfile

def zip_in_batches(target_path, batch_size=10):
    if not os.path.exists(target_path):
        print(f"[-] Error: Path '{target_path}' does not exist.")
        return

    # 1. Collect all files recursively
    all_files = []
    for root, _, files in os.walk(target_path):
        for file in files:
            all_files.append(os.path.join(root, file))

    if not all_files:
        print("[-] No files found in the specified directory.")
        return

    print(f"[*] Found {len(all_files)} total files. Slicing into batches of {batch_size}...")

    # 2. Setup output folder
    output_dir = "upload_batches"
    if not os.path.exists(output_dir):
        os.makedirs(output_dir)

    # 3. Process batches
    for i in range(0, len(all_files), batch_size):
        batch_num = (i // batch_size) + 1
        zip_filename = os.path.join(output_dir, f"batch_{batch_num}.zip")
        
        with zipfile.ZipFile(zip_filename, 'w', zipfile.ZIP_DEFLATED) as zipf:
            chunk = all_files[i:i + batch_size]
            for file_path in chunk:
                # arcname preserves the structure starting FROM the target_path
                # e.g., if you zip 'sources/com', the zip internal starts at 'com/...'
                arcname = os.path.relpath(file_path, os.path.dirname(target_path))
                zipf.write(file_path, arcname)
        
        print(f"[+] Created {zip_filename} ({len(chunk)} files)")

    print(f"\n[*] Done! Your ZIPs are in the '{output_dir}' folder.")

if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Usage: python3 zip10.py <path_to_source_folder>")
    else:
        zip_in_batches(sys.argv[1])
