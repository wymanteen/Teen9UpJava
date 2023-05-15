import * as React from "react";

export default function Form() {
    function handleSubmit(event: React.SyntheticEvent<HTMLFormElement>) {
        // Prevent the browser from reloading the page
        event.preventDefault();
    
        // Read the form data
        const form = event.target;
        

        console.log(form);
    
    }

    return (
    <>
        <form method="post" onSubmit={handleSubmit}>
            <label>
                Image: <input type= "file" name="file_path"  />
            </label>
            <hr />
            <label>
                Description:
            <textarea name="postContent" rows={4} cols={40} />
            </label>
            <button type="reset">Reset form</button>
            <button type="submit">Submit form</button>
        </form>
    </>
    );
  }