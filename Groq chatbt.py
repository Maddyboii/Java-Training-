from groq import Groq
client = Groq(
api_key = ""
)

print("Groq chatbot")
print("Type 'exit' to quit")

while True:
    user_message = input("You: ")
    if user_message.lower() == "exit":
        print("Exiting the chatbot. Goodbye!")
        break
    response = client.chat.completions.create(
        model = "openai/gpt-oss-120b",
        messages = [
            {
                "role":"user",
                "content":user_message
            }
        ]
    )
    bot_message = response.choices[0].message.content

    print("Bot:", bot_message)